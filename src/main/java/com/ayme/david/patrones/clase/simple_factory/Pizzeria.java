package com.ayme.david.patrones.clase.simple_factory;

public class Pizzeria {

    public Pizza createLittlePizza() {
        return new Pizza(6); //6 rebanadas para la pizza pequeña
    }

    public Pizza createMediumPizza() {
        return new Pizza(8); //8 rebanadas para la pizza mediana
    }

    public Pizza createBigPizza() {
        return new Pizza(12); //12 rebanadas para la pizza grande
    }
    
    //simple factory sirve para controlar la creación de objetos
}