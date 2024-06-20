package com.ayme.david.patrones.clase.estructurales.adapter.guru;

public class Main {
    public static void main(String[] args) {
        XmlDataProvider xmlDataProvider = new XmlDataProvider("<data><value>123</value></data>");
        AnalysisLibrary adapter = new XmlToJsonAdapter(xmlDataProvider);

        // Utilizar la biblioteca de análisis a través del adaptador
        adapter.analyzeData("");
    }
}
