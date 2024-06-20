package com.ayme.david.patrones.clase.estructurales.adapter.guru;


// Adapter
public class XMLToJSONAdapter implements JSONParser {
    private XMLData xmlData;

    public XMLToJSONAdapter(XMLData xmlData) {
        this.xmlData = xmlData;
    }

    @Override
    public String parse() {
        System.out.println("Transformando datos de XML a JSON...");
        System.out.println("Datos XML recibidos: " + this.xmlData.getXMLData());
        // Emulación de la conversión de XML a JSON
        String jsonData = "{\"order\": {\"id\": \"123\", \"name\": \"John Doe\", \"amount\": \"100\"}}";
        System.out.println("Datos JSON simulados: " + jsonData);
        return jsonData;
    }
}


