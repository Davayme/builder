package com.ayme.david.patrones.clase.estructurales.composite.repasos.mio;

public class Developer implements IEmpleado {

    private String nombre;
    private long id;
    
    public Developer(String nombre, long id) {
        this.nombre = nombre;
        this.id = id;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Id: " +this.id + "Nombre: " + this.nombre);
    }
    
}
