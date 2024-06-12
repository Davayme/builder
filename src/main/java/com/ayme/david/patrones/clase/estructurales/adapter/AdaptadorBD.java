package com.ayme.david.patrones.clase.estructurales.adapter;

public class AdaptadorBD implements IConexionBD {
    //1. Definir su comportamiento
    private IConexionNOSQL noSQL;

    //entonces: enlazando las dos interfaces

    //Asignamos un valor al atributo mendiante el constructor
    public AdaptadorBD(IConexionNOSQL noSQL) {
        this.noSQL = noSQL;
    }


    @Override
    public void conexion() {
        this.noSQL.conexion();
    }

    @Override
    public String ejecutarConsulta() {
        
        return this.noSQL.ejecuarConsultaNOSQL();
    }
    
}
