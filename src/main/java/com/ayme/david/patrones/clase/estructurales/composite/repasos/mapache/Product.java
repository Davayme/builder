package com.ayme.david.patrones.clase.estructurales.composite.repasos.mapache;

public class Product implements IItem{
    private String name;
    private float price;
    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }
    
    @Override
    public float getPrice() {
        return this.price;
    }

    public String getName() {
        return name;
    }

    
}
