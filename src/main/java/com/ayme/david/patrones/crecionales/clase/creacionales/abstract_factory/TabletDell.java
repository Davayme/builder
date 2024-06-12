package com.ayme.david.patrones.crecionales.clase.creacionales.abstract_factory;

public class TabletDell implements ITablet{
    private String modelo;
    private String procesador;

    public TabletDell(String modelo, String procesador) {
        this.modelo = modelo;
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "TabletDell [modelo=" + modelo + ", procesador=" + procesador + "]";
    }
    
}
