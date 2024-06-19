package com.ayme.david.patrones.clase.estructurales.composite.repasos.mapache;

import java.util.ArrayList;
import java.util.List;

public class Box implements IItem {
    List<IItem> productos;

    public Box() {
        this.productos = new ArrayList<>();
    }

    public void addProduct(IItem producto){
        this.productos.add(producto);
    }

    @Override
    public float getPrice() {
        float suma = 0;
        for (IItem iItem : productos) {
            suma = suma + iItem.getPrice();
        }
        return suma;
        
    }

}
