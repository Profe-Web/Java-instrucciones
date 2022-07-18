package com.mycompany.random2;

/**
 *
 * @author Profe
 */
public class Random2 {

    public static void main(String[] args) {
        System.out.println("Hello Random World!");

        
        System.out.println("Cómo hacer aleatorio del 1 al 10");
        int random1 = (int) Math.random(); //de double a int
        System.out.println("random 1 sin nada: " + random1);
        // da cero porque es un int y no se multiplica por nada

        
        double random2 = Math.random();
        System.out.println("random 2 sin nada: " + random2);
        // da entre 0 y 0.99999...

        
        int random3 = (int) Math.ceil(Math.random() * 10);
        //ceil = techo. Redondea hacia arriba: del a al 10
        //floor = suelo. Redondea hacia abajo
        // si no, da un número entero del 0 al 9
        System.out.println("random 3 del 1 al 10: " + random3);
        
        
        // del 50 al 100
        int random4 = 0;
        for(int i=0; i<10; i++){
           random4 =(int) Math.ceil((Math.random() * 50) + 50);
           System.out.println("random 4 del 50 al 100: " + random4);
        }
        
        
        // del 50 al 100, incluyendo 50 y 100, son 51 números
        int random5 = 0;
        for(int i=0; i<10; i++){
           random5 =(int) Math.ceil((Math.random() * 51) + 49);
           System.out.println("random 4 del 50 al 100, ambos inclusive: " + random5);
        }
        
    }
}
