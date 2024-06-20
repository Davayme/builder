package com.ayme.david.patrones.clase.estructurales.adapter.guru;

// Implementación de la biblioteca de análisis
public class JsonAnalysisLibrary implements AnalysisLibrary {
    private String jsonData;

    public JsonAnalysisLibrary(String jsonData) {
        this.jsonData = jsonData;
    }

    @Override
    public void analyzeData() {
        System.out.println("Analizando datos JSON: " + jsonData);
    }
}

