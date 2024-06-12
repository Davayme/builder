package com.ayme.david.patrones.clase.abstract_factory;

public class Mackbook implements IComputadora{
    private String marca;
    private String procesador;
    public Mackbook(String marca, String procesador) {
        this.marca = marca;
        this.procesador = procesador;
    }
    @Override
    public String toString() {
        return "Mackbook [marca=" + marca + ", procesador=" + procesador + "]";
    }

    
    
}
