package com.ayme.david.patrones.clase.abstract_factory;

public class Ipad implements ITablet{
    private String modelo;
    private String procesador;
    public Ipad(String modelo, String procesador) {
        this.modelo = modelo;
        this.procesador = procesador;
    }
    @Override
    public String toString() {
        return "Ipad [modelo=" + modelo + ", procesador=" + procesador + "]";
    }
    
    
}
