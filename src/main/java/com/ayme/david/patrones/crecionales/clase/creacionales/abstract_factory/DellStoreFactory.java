package com.ayme.david.patrones.crecionales.clase.creacionales.abstract_factory;

public class DellStoreFactory implements IAbstractFactory{

    @Override
    public IComputadora crearComputadora(String modelo, String procesador) {
        return new DellXP(modelo, procesador);
    }

    @Override
    public ITablet crearTablet(String modelo, String procesador) {
       return new TabletDell(modelo, procesador);
    }
    
}
