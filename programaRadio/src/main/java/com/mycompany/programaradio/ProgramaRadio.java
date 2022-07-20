

package com.mycompany.programaradio;

import java.util.ArrayList;

/**
 *
 * @author Profe
 */

public class ProgramaRadio {

    public static void main(String[] args) {
        
        ArrayList <Podcast> listaProg = new ArrayList<>();
        
        listaProg.add(new Podcast("Medianoche", "Misterio", 60, "Canal66"));
        listaProg.add(new Podcast("Golazo", "Deportes", 90, "TodoSport"));
        listaProg.add(new Podcast("Al día", "Eventos locales", 30, "BonDia"));
        
        System.out.println("Programas:");
        System.out.println(listaProg); //muestra todo
        System.out.println(listaProg.get(1)); //muestra todo del indice 1
        System.out.println(listaProg.get(1).getDuracion()); //muestra 'duración' del indice 1
        
        System.out.println("");
        System.out.println("for-each:");
        for(Podcast x: listaProg){
            System.out.println(x);
        }
        
        //leer y mostrar el segundo atributo del segundo indice
        System.out.println("segundo del segundo:" + listaProg.get(2).getGenero());
        
        //cambiar ese mismo a otro nombre "noticias"
        listaProg.get(2).setGenero("noticias");
        System.out.println("NUEVO segundo del segundo:" + listaProg.get(2).getGenero());
        
        //ver solo los titulos y duracion de todos los programas
        for(Podcast x: listaProg){
            System.out.println(x.getNombre()+ ": " + x.getDuracion() + " minutos");
        }
        
        //indicando el indice
        for(int i=0; i<listaProg.size();i++){
            System.out.println("El programa "+ (i+1) + " es: " + listaProg.get(i));
        }
        
        //quitar el segundo indice
        listaProg.remove(2);
        System.out.println("Lista final: " + listaProg);
        
    }
}
