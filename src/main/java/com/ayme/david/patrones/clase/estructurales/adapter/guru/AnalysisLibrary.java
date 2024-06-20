package com.ayme.david.patrones.clase.estructurales.adapter.guru;

// Client
public class AnalysisLibrary {
    private JSONParser jsonParser;

    public AnalysisLibrary(JSONParser jsonParser) {
        this.jsonParser = jsonParser;
    }

    public void analyzeData() {
        System.out.println("Analizando datos JSON...");
        String jsonData = jsonParser.parse();
        System.out.println("Datos analizados: " + jsonData);
    }
}


