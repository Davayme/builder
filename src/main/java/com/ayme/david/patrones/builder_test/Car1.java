package com.ayme.david.patrones.builder_test;

public class Car1 {
    // Propiedades de Car
    private final String make;
    private final String model;
    private final int year;
    private final String color;
    private final String engine;

    // Constructor privado
    private Car1(CarBuilder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
        this.engine = builder.engine;
    }

    // Clase estática Builder
    public static class CarBuilder {
        // Propiedades del Builder
        private String make;
        private String model;
        private int year;
        private String color;
        private String engine;

        // Métodos de configuración
        public CarBuilder setMake(String make) {
            this.make = make;
            return this;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        // Método de construcción
        public Car1 build() {
            return new Car1(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // Crear un objeto Car usando el Builder
        Car1 car = new Car1.CarBuilder()
                .setMake("Toyota")
                .setModel("Camry")
                .setYear(2023)
                .setColor("Rojo")
                .setEngine("V6")
                .build();

        System.out.println(car);
    }
}

