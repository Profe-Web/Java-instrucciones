package com.mycompany.testarraylistclass;

import java.util.ArrayList;

/**
 *
 * @author Profe
 */

public class TestArrayListClass {

    public static void main(String[] args) {
        
        
        //Array de productos TiendaChino
        ArrayList <TiendaChino> productos = new ArrayList<>();
        
        //Instanciar clase en objetos:
        TiendaChino p1 = new TiendaChino("Robot", "Juguetes", 15);
        TiendaChino p2 = new TiendaChino("Tijeras", "Papeleria", 18);
        TiendaChino p3 = new TiendaChino("Jarrón", "Decoración", 25);
        TiendaChino p4 = new TiendaChino("Altavoz", "Electronica", 20);
        TiendaChino p5 = new TiendaChino("Coca-Cola", "Refrescos", 1.50);
        
        System.out.println("Producto 3: " + p3);
        
        System.out.println("Productos: " + productos); // vacía
        
        //Añadir productos a Array productos
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);
        
        //Mostar todo
        System.out.println("Productos: " + productos);
        
        //Mostrar producto 4
        System.out.println("Producto 4: " + productos.get(4));
        System.out.println("Producto 4: " + p5); //Ojo número índice!
        
        //Mostrar solo nombre producto 4
        System.out.println("Producto 4: " + p5.getName());
        
    }
}
