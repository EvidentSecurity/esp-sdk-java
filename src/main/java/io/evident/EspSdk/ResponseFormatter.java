/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.evident.EspSdk;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.common.base.CaseFormat;
import com.google.gson.JsonNull;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author shaun
 */
public class ResponseFormatter {

    public class ClassNJson {
        public Class myClass;
        public String myData;
        public ClassNJson(Class c, String d) {
            myClass = c;
            myData = d;
        }
    }

    private final HashMap<String,JsonObject> includedObjects = new HashMap<>();

    public String cleanUpResponse(String json) {
        JsonObject jo = getObject(json);
        mapIncludedObjects(jo.getAsJsonArray("included"));
        String retVal = formatJsonElement(jo.get("data"));
        if (retVal.isEmpty()) {
            retVal = json;
        }
        return retVal;
    }

    public Class getPaginatedData(String json, List<String> paginatedObjectsRet, List<ResponseFormatter.ClassNJson> includedObjectsRet,
            Map<String,String> linksJson) {
        Class dataObjectClass = null;
        JsonObject jo = getObject(json);
        mapIncludedObjects(jo.getAsJsonArray("included"));
        JsonArray objects = jo.getAsJsonArray("data");
        if (objects.size() > 0) {
            Iterator<JsonElement> itr = objects.iterator();
            JsonElement curElem = itr.next();
            dataObjectClass = determineJsonElementClass(curElem);
            paginatedObjectsRet.add(formatJsonElement(curElem));
            while (itr.hasNext()) {
                paginatedObjectsRet.add(formatJsonElement(itr.next()));
            }
            for (String obj : includedObjects.keySet() ) {
                curElem = includedObjects.get(obj);
                includedObjectsRet.add(new ClassNJson(determineJsonElementClass(curElem), formatJsonElement(curElem)));
            }
        }
        JsonObject links = jo.getAsJsonObject("links");
        if (links != null) {
            for (Entry<String,JsonElement> linkDesc : links.entrySet()) {
                linksJson.put(linkDesc.getKey(), links.get(linkDesc.getKey()).getAsString());
            }
        }
        return dataObjectClass;
    }

    private String formatJsonElement(JsonElement element) {
        StringBuilder retElement = new StringBuilder();
        if (element != null) {
            if (element.isJsonObject()) {
                String formattedObject = formatJsonObject(element.getAsJsonObject());
                retElement.append(formattedObject);
            }
            else if (element.isJsonArray()) {
                String typeName = getObjectName(element);
                retElement.append("\"").append(typeName).append("\":[");
                String objectIdName = determineObjectIdName(typeName);
                Iterator<JsonElement> itr = element.getAsJsonArray().iterator();
                StringBuilder ids = new StringBuilder();
                ids.append("\"").append(objectIdName).append("\":[");
                boolean first = true;
                while(itr.hasNext()) {
                    JsonElement curElement = itr.next();
                    if (!first) {
                        retElement.append(",");
                        ids.append(",");
                    } else {
                        first = false;
                    }
                    ids.append(curElement.getAsJsonObject().getAsJsonPrimitive("id"));
                    String formattedElement = formatJsonElement(curElement);
                    retElement.append(formattedElement);
                }
                retElement.append("],").append(ids).append("]");
            }
        }
        return retElement.toString();
    }

    private String formatJsonObject(JsonObject obj) {
        StringBuilder responseBuffer = new StringBuilder();
        if (obj != null) {
            String objId = obj.getAsJsonPrimitive("id").getAsString();
            responseBuffer.append("{\"id\":").append(objId);
            responseBuffer.append(",\"type\":").append(obj.getAsJsonPrimitive("type").getAsString());
            JsonObject memberObjs = obj.getAsJsonObject("attributes");
            if (memberObjs != null) {
                String members = memberObjs.toString();
                members = members.substring(1, members.length() - 1);
                responseBuffer.append(",").append(members);
            }
            JsonObject relObjs = obj.getAsJsonObject("relationships");
            if (relObjs != null) {
                for (Entry<String,JsonElement> curRelObj : relObjs.entrySet()) {
    //                JsonElement relElement = relObjs.get(key);
                    String relatedElement = formatRelatedJsonElement(curRelObj.getValue(), curRelObj.getKey());
                    if (!relatedElement.isEmpty()) {
                        responseBuffer.append(",").append(relatedElement);
                    }
                }
            }
            responseBuffer.append("}");
        }
        return responseBuffer.toString();
    }

    private String formatRelatedJsonElement(JsonElement relElement, String key) {
        StringBuilder relObjBuffer = new StringBuilder();

        JsonElement data = relElement.getAsJsonObject().get("data");
        if ((data != null) && !data.isJsonNull() && !data.isJsonPrimitive() && !(data.isJsonArray() && (data.getAsJsonArray().size() == 0))) {
            if (data.isJsonObject()) {
                String objId = data.getAsJsonObject().get("id").getAsString();
                String objType = key; //data.getAsJsonObject().get("type").getAsString();
                String objIdName = determineObjectIdName(objType);
                if ((objIdName != null) && (objIdName.length() > 0)) {
                    relObjBuffer.append("\"").append(objIdName).append("\":\"").append(objId).append("\"");
                    JsonObject incObj = includedObjects.get(objType + "-" + objId);
                    if (incObj == null) {
                        incObj = includedObjects.get(objType + "s-" + objId);
                    }
                    if (incObj != null) {
                        String obj = formatJsonObject(incObj);
                        relObjBuffer.append(",\"").append(objType).append("\":").append(obj);
                    }
                }
            } else {
                StringBuilder objects = new StringBuilder();
                StringBuilder ids = new StringBuilder();
                Iterator<JsonElement> itr = data.getAsJsonArray().iterator();
                String objType = null;
                while(itr.hasNext()) {
                    JsonObject curObj = itr.next().getAsJsonObject();
                    if (objType == null) {
                        objType = curObj.get("type").getAsString();
                        objects.append("\"").append(objType).append("\":[");
                        ids.append("\"").append(determineObjectIdName(objType)).append("\":[");
                    } else {
                        if (objects.length() > 0) {
                            objects.append(",");
                        }
                        ids.append(",");
                    }
                    String curId = curObj.getAsJsonPrimitive("id").getAsString();
                    ids.append("\"").append(curId).append("\"");
                    JsonObject relObj = includedObjects.get(objType + "-" + curId);
                    if (relObj != null) {
                        String formattedObject = formatJsonObject(relObj);
                        objects.append(formattedObject);
                    } else {
                        objects.delete(0, objects.length());
                    }
                }
                relObjBuffer.append(ids).append("]");
                if (objects.length() > 0 ) {
                    relObjBuffer.append(",").append(objects).append("]");
                }
            }
        } else {
            // can only supply ids from related link(s), if present
            JsonElement links = relElement.getAsJsonObject().get("links");
            if (links != null) {
                JsonElement relLinks = links.getAsJsonObject().get("related");
                if(relLinks.getClass() != JsonNull.class) {
                    String url = relLinks.getAsString();
                    String id = determineRelatedIdString(url, key);
                    if (!id.isEmpty()) {
                        relObjBuffer.append("\"").append(determineObjectIdName(key)).append("\":").append(id);
                    }
                }
            }
        }
        return relObjBuffer.toString();
    }

    private String getObjectName(JsonElement element) {
        String typeName = null;
        if (element.isJsonObject()) {
            typeName = element.getAsJsonObject().getAsJsonPrimitive("type").getAsString();
        } else {
            typeName = element.getAsJsonArray().get(0).getAsJsonObject().getAsJsonPrimitive("type").getAsString();
        }
        return typeName;
    }

    private Class determineJsonElementClass(JsonElement elem) {
        return determineObjectClass(getObjectName(elem));
    }

    private Class determineObjectClass(String typeName) {
        final String evidentModels = "io.evident.models.";
        String javaName = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, typeName);
        Class located = null;
        try {
            try {
                located = Class.forName(evidentModels + javaName);
            } catch (ClassNotFoundException e1) {
                if (typeName.endsWith("s")) {
                    try {
                        located = Class.forName(evidentModels + javaName.substring(0, javaName.length() - 1));
                    } catch (ClassNotFoundException e2) {
                        if (typeName.endsWith("es")) {
                            located = Class.forName(evidentModels + javaName.substring(0, javaName.length() - 2));
                        } else {
                            throw e2;
                        }
                    }
                } else {
                    throw e1;
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.format("%s\n-- Could not find requested class '%s' (%s)", e.getMessage(), typeName, javaName);
        }
        return located;
    }

    private String determineObjectIdName(String typeName) {
        StringBuilder objIdName = new StringBuilder();
        Class located = determineObjectClass(typeName);
        if (located != null) {
            objIdName.append(CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, located.getSimpleName())).append("_id");
            if (!located.getSimpleName().equalsIgnoreCase(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, typeName))) {
                objIdName.append("s");
            }
        }
        return objIdName.toString();
    }

    private String determineRelatedIdString(String url, String key) {
        StringBuilder relIdString = new StringBuilder();

        // see if link is direct to object
        StringBuilder matchTo = new StringBuilder();
        matchTo.append("\\/").append(key).append("(s|es)?\\/(?<id>\\d)*.json");
        Pattern pattern = Pattern.compile(matchTo.toString());
        Matcher matcher = pattern.matcher(url);
        if (matcher.find()) {
            relIdString.append(matcher.group("id"));
        } else {
            // locate filter(s)
            pattern = Pattern.compile("filter(%5B|\\[)id_(?<mult>(in(%5D%5B%5D|\\]\\[\\])|eq))=(?<id>\\d)*");
            matcher = pattern.matcher(url);
            if (matcher.find()) {
                if (matcher.group("mult").startsWith("eq")) {
                    relIdString.append(matcher.group("id"));
                } else {
                    relIdString.append("[").append(matcher.group("id"));
                    while (matcher.find()) {
                        relIdString.append(",").append(matcher.group("id"));
                    }
                    relIdString.append("]");
                }
            }
        }
        return relIdString.toString();
    }

    private void mapIncludedObjects(JsonArray included) {
        if (included != null) {
            Iterator<JsonElement> inclObjs = included.iterator();
            while (inclObjs.hasNext()) {
                JsonObject curObj = inclObjs.next().getAsJsonObject();
                StringBuilder key = new StringBuilder();
                try {
                    String type = curObj.getAsJsonPrimitive("type").getAsString();
                    String id = curObj.getAsJsonPrimitive("id").getAsString();
                    key.append(type).append("-").append(id);
                } catch (Exception e) {
                    System.out.format("Could not resolve included object: %s\nException: %s", curObj.toString(), e.toString());
                    continue;
                }
                includedObjects.put(key.toString(), curObj);
            }
        }
    }

    private JsonObject getObject(String json) {
        JsonParser jsonParser = new JsonParser();
        return jsonParser.parse(json).getAsJsonObject();
    }
}
