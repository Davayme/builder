package com.ayme.david.patrones.clase.estructurales.composite.repasos.mio;

public class Manager implements IEmpleado {

    private String nombre;
    private Long id;
    
    public Manager(String nombre, Long id) {
        this.nombre = nombre;
        this.id = id;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Id: " + this.id + "Nombre: " + this.nombre);
    }

}
