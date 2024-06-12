package com.ayme.david.patrones.crecionales.clase.estructurales.adapter;

public class ConexionMongo implements IConexionNOSQL{

    @Override
    public void conexion() {
        System.out.println("Conexion con MongoDB");
    }

    @Override
    public String ejecuarConsultaNOSQL() {
        return "Consulta MongoDB"; 
    }

    
}
