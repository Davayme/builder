package com.ayme.david.patrones.crecionales.clase.estructurales.adapter;

public interface IConexionMSQL {
    //crear la conexion
    public void conexion();

    //ejecuar la consulta en la BD
    public String ejecutarConsulta();
}
