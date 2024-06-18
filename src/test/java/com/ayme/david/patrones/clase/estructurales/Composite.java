package com.ayme.david.patrones.clase.estructurales;

import org.junit.Test;

import com.ayme.david.patrones.clase.estructurales.composite.Menu;

public class Composite {
    
    @Test
    public void Test1() {
        Menu menu = new Menu("Menu Principal");
   
        Menu menu1 = new Menu("Menu 1");
        Menu menu2 = new Menu("Menu 2");
        menu.agregarMenu(menu1);
        menu.agregarMenu(menu2);
        System.out.println(menu);

    }
}
