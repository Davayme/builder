package com.ayme.david.patrones.clase.creacionales;

import org.junit.Test;

import com.ayme.david.patrones.crecionales.clase.abstract_factory.AppleStoreFactory;
import com.ayme.david.patrones.crecionales.clase.abstract_factory.DellStoreFactory;
import com.ayme.david.patrones.crecionales.clase.abstract_factory.IComputadora;
import com.ayme.david.patrones.crecionales.clase.factory_method.Pastel;
import com.ayme.david.patrones.crecionales.clase.factory_method.PasteleriaDA;

public class Abstract_Factory {
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
