package com.ayme.david.patrones.crecionales.clase.factory_method;

public class Pastel {
    private int cantidadRebanadas;
    private String sabor;
    //Teoria de Factory Method
    //lA teroria de factory method dice que se debe de crear una interfaz que permita a las subclases decidir que clase instanciar
    public Pastel(int cantidadRebanadas, String sabor) {
        this.cantidadRebanadas = cantidadRebanadas;
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        return "Pastel [cantidadRebanadas=" + cantidadRebanadas + ", sabor=" + sabor + "]";
    }
    
}
