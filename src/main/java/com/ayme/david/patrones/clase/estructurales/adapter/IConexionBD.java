package com.ayme.david.patrones.clase.estructurales.adapter;

public interface IConexionBD {
    // crear la conexion
    public void conexion();

    // ejecuar la consulta en la BD
    public String ejecutarConsulta();
}
