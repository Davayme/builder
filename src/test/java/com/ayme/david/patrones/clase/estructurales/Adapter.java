package com.ayme.david.patrones.clase.estructurales;

import org.junit.Test;

import com.ayme.david.patrones.clase.estructurales.adapter.AdaptadorBD;
import com.ayme.david.patrones.clase.estructurales.adapter.ConexionMongo;
import com.ayme.david.patrones.clase.estructurales.adapter.IConexionBD;

public class Adapter {
    @Test
    public void Test1(){
    //Pregunta, por que al inicializar un objeto Interfaz, se puede igualar a una clase que la implementa?
    //Respuesta: Porque la clase que la implementa tiene todos los metodos de la interfaz
        //IConexionBD c = new ConexionMSQL();
    /*     IConexionBD c = new ConexionMongo();
        c.conexion();
        String resultado = c.ejecutarConsulta();
        System.out.println(resultado); */

        IConexionBD c = new AdaptadorBD(new ConexionMongo());
        c.conexion();
        String resultado = c.ejecutarConsulta();
        System.out.println(resultado);
    }
}
