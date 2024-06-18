package com.ayme.david.patrones.clase.estructurales.composite;
import java.util.ArrayList;

public class Menu implements IMenu{
    ArrayList<IMenu> menus;
    String nombre;
    public Menu(String nombre) {
        menus = new ArrayList<>();
        this.nombre = nombre;
    }

    @Override
    public boolean abierto() {
        System.out.println("Menu abierto");
        return true;
    }

    @Override
    public boolean cerrado() {
        System.out.println("Menu cerrado");
        return true;
    }

    public void agregarMenu(IMenu menu){
        this.menus.add(menu);

    }

    public IMenu obtenerMenu(int index){
        return this.menus.get(index);
    }

    @Override
    public String toString() {
        return "Menu [menus=" + menus + ", nombre=" + nombre + "]";
    }


    
}
