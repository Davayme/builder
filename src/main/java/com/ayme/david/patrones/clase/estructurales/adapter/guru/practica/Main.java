package com.ayme.david.patrones.clase.estructurales.adapter.guru.practica;

public class Main {
    public static void main(String[] args) {
        XMLData xmlData = new XMLData("<data>num<data>");
        AdapterXMLToJson adapter = new AdapterXMLToJson(xmlData);
        adapter.analizeData();
    }
}
