package com.ayme.david.patrones.crecionales.clase.abstract_factory;

public interface IAbstractFactory {
       /*El abstract factory  permite crear familias de objetos relacionados o dependientes sin especificar sus clases concretas.*/ 
       //Dentro de la interfaz se definen los métodos que se van a implementar en las clases concretas.
       //En el factory method se define un método que se encarga de crear objetos de una clase concreta.
       IComputadora crearComputadora( String modelo, String procesador);
       ITablet crearTablet(String modelo, String procesador);
       //Se retorna una interfa por que se va a retornar un objeto de una clase concreta.

}
