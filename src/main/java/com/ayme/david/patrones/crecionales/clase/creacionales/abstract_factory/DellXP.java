package com.ayme.david.patrones.crecionales.clase.creacionales.abstract_factory;

public class DellXP implements IComputadora{
    private String modelo;
    private String procesador;
    
    public DellXP(String modelo, String procesador) {
        this.modelo = modelo;
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "DellXP [modelo=" + modelo + ", procesador=" + procesador + "]";
    }

    
    
}
