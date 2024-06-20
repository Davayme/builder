package com.ayme.david.patrones.clase.estructurales.adapter.guru.practica;

public class JsonAnalysisData {
    private String json;

    public JsonAnalysisData(String json) {
        this.json = json;
    }
    
    public void analizeData(){
        System.out.println("Json analizado: " + this.json);
    }
}
