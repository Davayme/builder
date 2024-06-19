package com.ayme.david.patrones.clase.estructurales.composite.repasos.mapache;

public class Main {
    public static void main(String[] args) {
        Product produc1 = new Product("Papas", 20);
        Product produc2 = new Product("Producto 2", 20);
        Product product3 = new Product("Producto 3", 60);

        Box boxHijo = new Box();
        boxHijo.addProduct(produc1);
        boxHijo.addProduct(produc2);
        boxHijo.addProduct(product3);

        Product papas = new Product("Doritos", 22);
        Box padre = new Box();
        padre.addProduct(papas);
        padre.addProduct(boxHijo);

        Box pedido = new Box();
        pedido.addProduct(padre);

        System.out.println("Precio total " + pedido.getPrice());
        /* // Crear productos individuales
    
        Product product1 = new Product("Producto 1", 10.0);
        Product product2 = new Product("Producto 2", 15.0);
        Product product3 = new Product("Producto 3", 5.0);

        // Crear cajas y agregar productos
        Box box1 = new Box();
        box1.addItem(product1);
        box1.addItem(product2);

        Box box2 = new Box();
        box2.addItem(product3);
        box2.addItem(box1); // Agregar una caja dentro de otra caja

        // Crear un pedido (una caja grande)
        Box order = new Box();
        order.addItem(box2);

        // Calcular el precio total del pedido
        double totalPrice = order.getPrice();
        System.out.println("Precio total del pedido: " + totalPrice); */
    }
}
