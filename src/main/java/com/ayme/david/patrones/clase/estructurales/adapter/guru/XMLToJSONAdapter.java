package com.ayme.david.patrones.clase.estructurales.adapter.guru;

import java.util.List;

public class XMLToJSONAdapter implements IJsonParse {
    private XMLData xmlData;
   
    public XMLToJSONAdapter(XMLData xmlData) {
        this.xmlData = xmlData;
    }

    @Override
    public String parse(String jsonString) {
        // Convertir el XML a JSON utilizando la biblioteca org.json
        String xmlString = xmlData.getXMLData();
        JSONObject jsonObject = XML.toJSONObject(xmlString);
        return jsonObject.toString();
    }

}
