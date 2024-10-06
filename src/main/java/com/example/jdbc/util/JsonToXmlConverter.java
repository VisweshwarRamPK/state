package com.example.jdbc.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class JsonToXmlConverter {


    private static JsonToXmlConverter instance;


    private JsonToXmlConverter() {
    }


    public static JsonToXmlConverter getInstance() {
        if (instance == null) {
            instance = new JsonToXmlConverter();
        }
        return instance;
    }


    public String convertJsonToXml(String json) throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.writeValueAsString(json);
    }


    public String convertXmlToJson(String xml) throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.readValue(xml, String.class);
    }
}
