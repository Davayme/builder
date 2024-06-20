package com.ayme.david.patrones.clase.estructurales.adapter.guru;

public class Main {
    public static void main(String[] args) {
        // Datos en formato XML
        String xmlDataString = "<order><id>123</id><name>John Doe</name><amount>100</amount></order>";
        XMLData xmlData = new XMLData(xmlDataString);

        // Crear adaptador de XML a JSON
        JSONParser jsonParser = new XMLToJSONAdapter(xmlData);

        // Utilizar la biblioteca de análisis con el adaptador
        AnalysisLibrary analysisLibrary = new AnalysisLibrary(jsonParser);
        analysisLibrary.analyzeData();
    }
}
