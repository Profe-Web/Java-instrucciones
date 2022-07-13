package com.mycompany.arraylist2;

import java.util.ArrayList;

/**
 *
 * @author Profe
 */
public class Arraylist2 {

    public static void main(String[] args) {

        //Crear ArrayList *****   
        //ArrayList<String> listaCompra2 = new ArrayList<>();
        //ArrayList<Integer> compraPrecios = new ArrayList<>();
        ArrayList<String> listaCompra2 = new ArrayList<>(4);

        
        //Añadir elemento nuevo, al final: add ***** 
        listaCompra2.add("pimienta");
        listaCompra2.add("tomate");
        listaCompra2.add("patata");
        listaCompra2.add("zanahoria");

        System.out.println(listaCompra2);

        listaCompra2.add("apio");
        System.out.println(listaCompra2);

        
        // ArrayList no tiene tamaño fijo de elementos (puedes añadir/quitar)***
        // ArrayList necesitas improtar java.util.ArrayList
        // ArrayList utiliza wrappers (Integer, String) en vez de tipos primitivos como int
        
        
        //visualizar un elemento concreto ( leer con GET() ) ***** 
        System.out.println("ver índice 3: " + listaCompra2.get(3));

        
        //Añadir un elemento intermedio
        //Insertar un ingrediente en el indice 2:
        listaCompra2.add(2, "brocoli");
        System.out.println("hemos añadido brocoli en indice 2: " + listaCompra2);

        
        //cambiar un elemento, con SET() ***** 
        listaCompra2.set(2, "coles de bruselas");
        //listaCompra2.set(12, "coles de bruselas"); ERROR OutOfBounds
        System.out.println("hemos cambiado el indice 2: " + listaCompra2);

        
        //eliminar elemento con REMOVE() ***** 
        listaCompra2.remove(2);
        System.out.println("hemos eliminado el indice 2: " + listaCompra2);

        
        // Dimension ArrayList SIZE()
        System.out.println("Dimensión de la array: " + listaCompra2.size() + " elementos");

        
        //Mostrar todo con bucle for-each
        for (String x : listaCompra2) {
            System.out.println("\nIngrediente: " + x);
        }

        
        //Mostrar todo con bucle for
        for (int i = 0; i < listaCompra2.size(); i++) {
            System.out.println("Ingrediente: " + listaCompra2.get(i));
        }

        
        //Se podrian añadir elementos con entrada de teclado con while o for y .add()
        //Incluso se podria añadir con índices (lista.add(indice, elemento)
        //También se podrían quitar con remove()
        
        
        //Vaciar toda la lista
        listaCompra2.clear();
        System.out.println("Lo que queda de la lista: " + listaCompra2);
        
        
        // C.R.U.D. = Create, Read, Update, Delete
        
    }

}
