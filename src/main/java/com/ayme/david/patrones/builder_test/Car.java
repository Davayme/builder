package com.ayme.david.patrones.builder_test;

public class Car {
    // Propiedades requeridas
    private String make;
    private String model;
    private int year;
    private String color;
    private String engine;

    // Constructor privado
    private Car(String make) {
        this.make = make;
    }

    // Método estático para iniciar el builder
    public static CarBuilder crearCar(String make) {
        return new CarBuilder(new Car(make));
    }

    // Clase interna CarBuilder
    public static class CarBuilder {
        protected Car car;

        private CarBuilder(Car car) {
            this.car = car;
        }

        public ModelStep setModel(String model) {
            car.model = model;
            return new ModelStep(car);
        }

        public Car build() {
            return car;
        }
    }

    // Clase interna ModelStep
    public static class ModelStep extends CarBuilder {
        private ModelStep(Car car) {
            super(car);
        }

        public ModelStep setYear(int year) {
            car.year = year;
            return this;
        }

        public ModelStep setColor(String color) {
            car.color = color;
            return this;
        }

        public ModelStep setEngine(String engine) {
            car.engine = engine;
            return this;
        }

        @Override
        public Car build() {
            return car;
        }
    }

    @Override
    public String toString() {
        return "Car [make=" + make + ", model=" + model + ", year=" + year + ", color=" + color + ", engine=" + engine + "]";
    }

    public static void main(String[] args) {
        // Ejemplo de uso correcto
        Car car = Car.crearCar("Toyota")
                .setModel("Camry")
                .setYear(2023)
                .setColor("Rojo")
                .setEngine("V6")
                .build();

        System.out.println(car);

        // Ejemplo sin modelo, lo que debería lanzar una excepción o no permitir el seteo de otras propiedades
        try {
            Car carError = Car.crearCar("Honda")
                    .setYear(2022)  // Error: no se puede establecer año sin modelo
                    .build();
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Ejemplo sin setear año, color y motor
        Car carSinAñoColorMotor = Car.crearCar("Ford")
                .setModel("Mustang")
                .build();

        System.out.println(carSinAñoColorMotor);
    }
}
