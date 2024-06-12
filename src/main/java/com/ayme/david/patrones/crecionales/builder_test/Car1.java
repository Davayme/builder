package com.ayme.david.patrones.crecionales.builder_test;

public class Car1 {
    String nombre;
    String modelo;
    String año;
    String km;
    String placa;
    
    @Override
    public String toString() {
        return "Car1 [nombre=" + nombre + ", modelo=" + modelo + ", año=" + año + ", km=" + km + ", placa=" + placa
                + "]";
    }

    private Car1(String nombre, String modelo){
        this.nombre = nombre;
        this.modelo = modelo;
    }

    public static CarBuilder createCar(String nombre, String modelo){
        return new CarBuilder(new Car1(nombre, modelo));

    }
    public static class CarBuilder{
        protected Car1 c;

        private CarBuilder(Car1 c){
            this.c = c;
        }

        public CarBuilder setAnio(String año){
            this.c.año = año;
            return this;
        }

        public CarBuilder setKM(String km){
            this.c.km = km;
            return this;
        }

        public Car1 build(){
            return this.c;
        }
    }

    public static void main(String[] args) {
        Car1 carro = Car1.createCar("chevrolet", "ADA-22")
                    .setAnio("2019")
                    .setKM("20KM")
                    .build();
        System.out.println(carro);
    }
}
