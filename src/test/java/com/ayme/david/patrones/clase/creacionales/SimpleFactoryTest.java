package com.ayme.david.patrones.clase.creacionales;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ayme.david.patrones.clase.creacionales.simple_factory.Pizza;
import com.ayme.david.patrones.clase.creacionales.simple_factory.Pizzeria;

public class SimpleFactoryTest {

    @Test
    public void Test1() {
        Pizza pizza = new Pizza(8);
        assertTrue(pizza.toString().equals("Pizza [cantidadRebanadas=8]"));
    }

    @Test
    public void Test2() {
        Pizzeria pizzeria = new Pizzeria();
        Pizza pizzaHawaiana = pizzeria.createMediumPizza();
        System.out.println(pizzaHawaiana);
    }
}
