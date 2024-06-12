package com.ayme.david.patrones.crecionales.clase.estructurales.adapter;

//El patrón adapter es un patrón estructural que permite que objetos con interfaces incompatibles trabajen juntos.
// Lo importan de extender nuestra aplicacion es que lo logeremos sin necesidad de hacer cambios a nuestro cliente.
//El adaptador se encarga de hacer que la interfaz de una clase sea compatible con la interfaz de otra clase.
public class ConexionMSQL implements IConexionMSQL {

    @Override
    public void conexion() {
        System.out.println("Conexion establecida con SQL");
    }

    @Override
    public String ejecutarConsulta() {
        return "Consulta SQL ejecutada";
    }

}
