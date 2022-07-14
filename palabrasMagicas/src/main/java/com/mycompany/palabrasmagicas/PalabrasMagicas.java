

package com.mycompany.palabrasmagicas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Profe
 */

public class PalabrasMagicas {

    public static void main(String[] args) {
        
        // para generar lista de arrayList directamente:
        //Arrays.asList()
        ArrayList<String> colegas
                = new ArrayList<>(Arrays.asList("Pepe", "Alex", "Carlos", "Eva", "Marta", "Alex", "Edu", "Monica"));
        
        ArrayList<Integer> edades = new ArrayList<>(Arrays.asList(34, 57, 23, 78, 52, 33, 98, 19, 27, 65));
        
        
        // Cómo encontrar el índice de un elemento
        // indexOf()
        // Si no lo encuentra, da posición -1
        int indice = colegas.indexOf("Eva");
        System.out.println("Eva tiene un índice de: " + indice);
        System.out.println("");
        
        
        //Si existe ese elemento en la lista
        //CONTAINS
        // Booleano (encontrado o no)
        String name = "Alex";
        boolean encontrado = colegas.contains(name); //True o False
        
        if(encontrado){  //como decir: (encontrado==true)
            System.out.println("Nombre encontrado!" + name + " indice: " + colegas.indexOf(name));
        } else System.out.println("No encontrado  :-(");
        
        
        // Ordenar alfabeticamente, o numéricamente
        // SORT()
        
        //Alfabeticamente
        Collections.sort(colegas);
        System.out.println(colegas);
        
        //Numericamente
        Collections.sort(edades);
        System.out.println(edades);
        
        
        // Collections (_interface)> List(_interface) > AbstractList(clase)> ArrayList, LinkedList, etc
        
    }
}
