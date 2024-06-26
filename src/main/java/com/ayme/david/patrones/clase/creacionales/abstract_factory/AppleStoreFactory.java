package com.ayme.david.patrones.clase.creacionales.abstract_factory;

public class AppleStoreFactory implements IAbstractFactory {

    @Override
    public IComputadora crearComputadora(String modelo, String procesador) {

        return new Mackbook(modelo , procesador);
    }

    @Override
    public ITablet crearTablet(String modelo, String procesador) {
        return new Ipad( modelo, procesador);
    }

}
