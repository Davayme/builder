package com.ayme.david.patrones.clase.estructurales.composite.repasos.mio;

import java.util.ArrayList;
import java.util.List;

public class Company implements IEmpleado{
    private List<IEmpleado> empleados;

    public Company() {
        this.empleados = new ArrayList<>();
    }

    public boolean agregarEmpleado(IEmpleado empleado) {
        return this.empleados.add(empleado);
    }

    @Override
    public void mostrarDatos() {
        for (IEmpleado iEmpleado : this.empleados) {
            iEmpleado.mostrarDatos();
        }
    }
}
