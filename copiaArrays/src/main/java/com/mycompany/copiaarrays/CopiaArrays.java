

package com.mycompany.copiaarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Profe
 */

public class CopiaArrays {

    public static void main(String[] args) {
        /*
        //copiar VARIABLES: sí copias el valor actual de la otra variable
        //cuando cambias una, NO cambias la otra
        System.out.println("Un vez copiado el valor de una variable sobre otra, puedes hacer lo que quieras con cada una porque son independientes");
        String barco1 = "verde";
        String barco2 = barco1; //adquiere el valor EN ESE MOMENTO   
        System.out.println("barco2 = barco1:");
        System.out.println("adquiere el valor EN ESE MOMENTO");
        System.out.println("barco 1: " + barco1);
        System.out.println("barco 2: " + barco2);
        System.out.println("");
        
        Scanner teclado= new Scanner(System.in);
        System.out.println("introduce valor para barco1");
        barco1 = teclado.next();
        System.out.println("barco1 cambiado por usuario:");
        System.out.println("barco 1: " + barco1);
        System.out.println("barco 2: " + barco2);
        System.out.println("");
        
        System.out.println("introduce valor para barco2");
        barco2 = teclado.next();
        System.out.println("barco2 cambiado por usuario:");
        System.out.println("barco 1: " + barco1);
        System.out.println("barco 2: " + barco2);
        System.out.println("");*/
        
        //ARRAYS: guarda la referencia (la dirección de memoria)
        //hermanos clónicos, lo que pasa en uno pasa en el otro
        String[] colores1 = {"verde", "rojo", "amarillo", "violeta", "azul"};
        String[] colores2 = colores1;
        
        System.out.println("colores1: " + colores1);
        System.out.println("colores2: " + colores2);
        
        System.out.println("colores1, indice 2: " + colores1[2]);
        System.out.println("colores2, indice 2: " + colores2[2]);
        colores1[2] = "negro";
        System.out.println("indice 2 de colores1 cambiado a negro:");
        System.out.println("colores1, indice 2: " + colores1[2]);
        System.out.println("colores2, indice 2: " + colores2[2]);
        
        String[] colores3 = {"verde", "rojo", "amarillo", "violeta", "azul"};
        String[] colores4 = {"amarillo", "blanco", "negro","gris"};
        //colores3 = colores4; //da error si la cantidad de elementos es diferente
        String[] colores5 = colores4; //clona la dirección de memoria antigua de colores4
        colores4 = colores3;//colores4 clona la dirección de memoria de colores3
        
        /*System.out.println("colores3, indice 2: " + colores3[4]);
        System.out.println("colores4, indice 2: " + colores4[4]);
        
        colores4[4] = "elefante";
        System.out.println("colores3, indice 2: " + colores3[4]);
        System.out.println("colores4, indice 2: " + colores4[4]);*/
        
        //colores5 = {"verde", "azul", "rojo", "amarillo", "violeta"};
        System.out.println(colores3[1]);
        System.out.println(colores4[1]);
        System.out.println(colores5[1]);
        
        
        System.out.println(colores3);
        System.out.println(colores4);
        System.out.println(colores5);
        
        
        // instrucción Arrays.copyOf() *** solucion ***
        //NO se clona, se crea una array nueva, copiando el contenido de la otra
        System.out.println("");
        System.out.println("Copiado con copyOf()");
        String[] colores6 = Arrays.copyOf(colores5, colores5.length);
        System.out.println("colores5: " + colores5 + " posición 2: " + colores5[2]);
        System.out.println("colores6: " + colores6 + " posición 2: " + colores6[2]);
        
        colores6[2] = "indigo";
        System.out.println("Cambiado color de negro a indigo en colores6");
        System.out.println("colores5: " + colores5 + " posición 2: " + colores5[2]);
        System.out.println("colores6: " + colores6 + " posición 2: " + colores6[2]);
        
        
        //ARRAYLIST: igual, te guarda solo la referencia 
        ArrayList<String> coloresA = new ArrayList(Arrays.asList("verde", "rojo", "amarillo", "violeta", "rosa"));
        ArrayList<String> coloresB = coloresA;
        System.out.println("colores A: " + coloresA);
        System.out.println("colores B: " + coloresB);
        
        coloresB.set(2, "negro");
        System.out.println("colores A: " + coloresA);
        System.out.println("colores B: " + coloresB);
        
//        coloresB.clear();
//        System.out.println("colores A: " + coloresA);
//        System.out.println("colores B: " + coloresB);
        

        // addAll *** solucion *** como el copyOf()
        ArrayList<String> coloresC = new ArrayList<>();
        coloresC.addAll(coloresA);
        System.out.println("");
        System.out.println("copiados mediante adAll:");
        System.out.println("colores A: " + coloresA);
        System.out.println("colores C: " + coloresC);
        
        coloresC.set(2, "elefante");
        System.out.println("");
        System.out.println("colores C cambiado, son ArrayLists independientes:");
        System.out.println("colores A: " + coloresA);
        System.out.println("colores C: " + coloresC);
        
        //asignacion directa: new ArrayList<>(coloresA); *** SOLUCION2 ***
        System.out.println("");
        System.out.println("coloresD = coloresA mediante asignación directa,");
        System.out.println("=new ArrayList<>(coloresA):");
        ArrayList<String> coloresD = new ArrayList<>(coloresA);
        System.out.println("colores A: " + coloresA);
        System.out.println("colores D: " + coloresD);
        
        System.out.println("colores D cambiado, son ArrayLists independientes:");
        coloresD.set(2, "pajarraco");
        System.out.println("colores A: " + coloresA);
        System.out.println("colores D: " + coloresD);
        
        //si alguien encuentra la manera de esto último funcione con ArrayList de objetos, que me avise!!!
    }
}
