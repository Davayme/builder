package com.ayme.david.patrones.clase.estrucurales;

import org.junit.Test;

import com.ayme.david.patrones.crecionales.clase.creacionales.abstract_factory.AppleStoreFactory;
import com.ayme.david.patrones.crecionales.clase.creacionales.abstract_factory.DellStoreFactory;
import com.ayme.david.patrones.crecionales.clase.creacionales.abstract_factory.IComputadora;
import com.ayme.david.patrones.crecionales.clase.estructurales.adapter.ConexionMSQL;
import com.ayme.david.patrones.crecionales.clase.estructurales.adapter.IConexionMSQL;

public class Adapter {
    @Test
    public void Test1(){
    //Pregunta, por que al inicializar un objeto Interfaz, se puede igualar a una clase que la implementa?
    //Respuesta: Porque la clase que la implementa tiene todos los metodos de la interfaz
        IConexionMSQL c = new ConexionMSQL();
        c.conexion();
        String resultado = c.ejecutarConsulta();
        System.out.println(resultado);
    }
}
