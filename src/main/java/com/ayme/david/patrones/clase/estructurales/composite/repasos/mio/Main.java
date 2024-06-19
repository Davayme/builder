package com.ayme.david.patrones.clase.estructurales.composite.repasos.mio;

public class Main {
    public static void main(String[] args) {
        Developer dev1 = new Developer("Developer1", 1);
        Developer dev2 = new Developer("Developer2", 2);

        Company desarroladores = new Company();
        desarroladores.agregarEmpleado(dev1);
        desarroladores.agregarEmpleado(dev2);


        Company otros = new Company();
        Manager manager1 = new Manager("El jefe", (long) 3);
        otros.agregarEmpleado(desarroladores);
        otros.agregarEmpleado(manager1);
        otros.mostrarDatos();

    }
}
