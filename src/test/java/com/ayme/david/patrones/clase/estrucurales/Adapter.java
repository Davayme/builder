package com.ayme.david.patrones.clase.estrucurales;

import org.junit.Test;

import com.ayme.david.patrones.crecionales.clase.creacionales.abstract_factory.AppleStoreFactory;
import com.ayme.david.patrones.crecionales.clase.creacionales.abstract_factory.DellStoreFactory;
import com.ayme.david.patrones.crecionales.clase.creacionales.abstract_factory.IComputadora;

public class Adapter {
    @Test
    public void Test1() {
        AppleStoreFactory appleStoreFactory = new AppleStoreFactory();
        DellStoreFactory dellStore = new DellStoreFactory();

        IComputadora mackbook = appleStoreFactory.crearComputadora("Mackbook", "AM11");

        System.out.println(mackbook);
        IComputadora dellXP = dellStore.crearComputadora("DELXP", "Ryzen 5");
        System.out.println(dellXP);

    }
}
