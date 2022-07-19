package com.mycompany.camaras;

/**
 *
 * @author Profe
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Camaras {

    public static void main(String[] args) {

        ArrayList<Camara> listaCamaras = new ArrayList<>();

        listaCamaras.add(new Camara("Nikon", "Astro Zoom AZ422", "Objetivo fijo", 20, false, 226.21f));
        listaCamaras.add(new Camara("Sony", "sonyA600", "16-50mm intercambiable", 24, false, 592.55f));
        listaCamaras.add(new Camara("Canon", "EOS 2000D", "18-55mm intercambiable", 24, true, 522.55f));
        listaCamaras.add(new Camara("Nikon", "D3500", "18-55mm intercambiable", 24, true, 609.89f));
        listaCamaras.add(new Camara("Sony", "Alpha DSC-HX400V", "Objetivo fijo", 20, false, 387.0f));

        // ACCEDER a atributos concretos:
        // lista.objeto.atributo -con getters para privados
        System.out.println("modelo del tercer índice: " + 
                listaCamaras.get(3).getModelo());
        System.out.println("precio del cuarto índice: " + 
                listaCamaras.get(4).getPrecio() + " €");
        System.out.println("si es reflex el índice 1: " + 
                listaCamaras.get(1).isReflex());
        System.out.println("Objetivo tercer índice es:" +
                listaCamaras.get(3).getTipoObjetivo());
            
        
        // CAMBIAR el valor de un atributo:
        System.out.println("cambiamos el objetivo del tercer índice");
        
        //OJO, SET HACERLO EN DOS PASOS! *****************************
        //PRIMERO SE CAMBIA:
        listaCamaras.get(3).setTipoObjetivo("20-50mm zoom fijo- VIVA YO!!!"); 
        //DESPUÉS VISUALIZARLO:
        System.out.println("objetivo del tercer índice: " + listaCamaras.get(3).getTipoObjetivo());
        
        //SI HAGO TODO A LA VEZ, no funciona:
        //System.out.println("CAMBIAR objetivo del tercer índice: " +  listaCamaras.get(3).setTipoObjetivo("20-50mm zoom fijo"));

        int opcion = 0;
        while (opcion != 7) {
            System.out.println("ELIGE UNA OPCION:");
            System.out.println("1- ver todo");
            System.out.println("2- ver todos los modelos");
            System.out.println("3- ver todos los objetivos");
            System.out.println("4- ver todos los megapixels");
            System.out.println("5- ver todos si es reflex o no");
            System.out.println("6- ver todos los precios");
            System.out.println("7- Salir");
            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: //for-each TODOS
//                    for (Camara x : listaCamaras) {
//                        System.out.println(x);
//                    }
                    //bucle FOR normal con índice:
                    for (int i=0; i<listaCamaras.size();i++){
                        System.out.println(listaCamaras.get(i).getMarca()+ ", " + listaCamaras.get(i).getModelo() + ", indice: " + i);
                }
                    break;

                case 2: //Modelos
                    for (Camara x : listaCamaras) {
                        System.out.println(x.getMarca()+ ": " + x.getModelo());
                        //x= listaCamaras.get(0)
                        //x= listaCamaras.get(1)
                        //x= listaCamaras.get(2)
                        //x= listaCamaras.get(3)
                        //x= listaCamaras.get(4)
                    }
                    break;
                case 3: //tipo de objetivo
                    for (Camara x : listaCamaras) {
                        System.out.println(x.getMarca() + ", " + x.getModelo() + ": " + x.getTipoObjetivo());
                    }
                    break;
                case 4:
                    for (Camara x : listaCamaras) {
                        System.out.println(x.getMarca() + ", " + x.getModelo() + ": " +  x.getMegapixels() + " megapixels");
                    }
                    break;
                case 5:
                    for (Camara x : listaCamaras) {
                        System.out.println(x.getMarca() + ", " + x.getModelo() + ": " + x.getReflex());
                    }
                    break;
                case 6:
                    for (Camara x : listaCamaras) {
                        System.out.println(x.getMarca() + ", " + x.getModelo() + ": " +  x.getPrecio() + " €");
                    }
                    break;
            }
            System.out.println("");
        }
    }
}
