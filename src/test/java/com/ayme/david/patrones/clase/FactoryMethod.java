package com.ayme.david.patrones.clase;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ayme.david.patrones.clase.factory_method.Pastel;
import com.ayme.david.patrones.clase.factory_method.PasteleriaDA;

public class FactoryMethod {
    @Test
    public void Test1() {
        PasteleriaDA pasteleriaDA = new PasteleriaDA();
        Pastel pastelChocolate = pasteleriaDA.prepararPastel("chocolate");
        System.out.println(pastelChocolate);
        Pastel pastelVainilla = pasteleriaDA.prepararPastel("vainilla");
        System.out.println(pastelVainilla);

        PasteleriaDA pasteleriaDA2 = new PasteleriaDA();
        
    }
}
