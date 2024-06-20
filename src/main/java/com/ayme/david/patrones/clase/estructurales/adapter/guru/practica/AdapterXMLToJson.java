package com.ayme.david.patrones.clase.estructurales.adapter.guru.practica;

public class AdapterXMLToJson implements AnalysisLibrary{
    private XMLData xmlData;

    public AdapterXMLToJson(XMLData xmlData) {
        this.xmlData = xmlData;
    }

    @Override
    public void analizeData() {
        String json = this.convertToJson(this.xmlData.getXmlData());
        System.out.println(json);
        JsonAnalysisData jad = new JsonAnalysisData(json);
        jad.analizeData();
    }

    public String convertToJson(String xml){
        return "data : {num:2}";
    }
}
