package com.ayme.david.patrones.clase.creacionales.builder.builder_test;

public class Pedido {
    String id;
    String mesero;
    String nombre;
    String producto;
    String cliente;
    String factura;
    
    @Override
    public String toString() {
        return "Pedido [id=" + id + ", mesero=" + mesero + ", cliente=" + cliente + ", producto=" + producto + "] " + factura;
    }
    private Pedido(String id, String mesero){
        this.id = id;
        this.mesero = mesero;
    }

    public static PedidoBuilder makePedido(String id, String mesero){
        return new PedidoBuilder(new Pedido(id, mesero));
    }

    public static class PedidoBuilder{
        Pedido p;
        private PedidoBuilder(Pedido p){
            this.p = p;
        }

        public PedidoBuilder setNombre(String nombre){
            this.p.nombre = nombre;
            return this;
        }
        public ClienteBuilder setProducto(String pro){
            this.p.producto = pro;
            return new ClienteBuilder(this.p);
        }

        

    }

    public static class ClienteBuilder extends PedidoBuilder{
        private ClienteBuilder(Pedido p){
            super(p);
        }

        public ClienteBuilder setCliente(String lcien){
            super.p.cliente = lcien;
            return this;
        }

        public Pedido build(){
            return super.p;
        }

        public ClienteBuilder setFatura(String a){
            super.p.factura = a;
            return this;
        }

    }

    public static void main(String[] args) {
        Pedido p = Pedido.makePedido("d", "d")
                    .setProducto("")
                    .setCliente("d")
                    .setFatura("aaaa")
                    .build();

        System.out.println(p);
    }
}
