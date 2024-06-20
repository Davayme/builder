package com.ayme.david.patrones.clase.estructurales.adapter.guru;

public class XmlToJsonAdapter implements AnalysisLibrary {
    private XmlDataProvider xmlDataProvider;

    public XmlToJsonAdapter(XmlDataProvider xmlDataProvider) {
        this.xmlDataProvider = xmlDataProvider;
    }

    @Override
    public void analyzeData(String jsonData) {
        // Convertir XML a JSON (simulado con un mensaje)
        String xmlData = xmlDataProvider.getXmlData();
        String convertedData = convertXmlToJson(xmlData);
        System.out.println("Datos convertidos de XML a JSON: " + convertedData);
        // Llamar al método de la biblioteca de análisis con los datos convertidos
        JsonAnalysisLibrary jsonLibrary = new JsonAnalysisLibrary();
        jsonLibrary.analyzeData(convertedData);
    }

    private String convertXmlToJson(String xmlData) {
        // Simulación de conversión (en una implementación real, se debería parsear el XML)
        return "{\"value\": 123}";
    }
}
