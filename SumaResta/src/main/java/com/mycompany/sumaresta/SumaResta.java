

package com.mycompany.sumaresta;

import java.util.Scanner;



/**
 *
 * @author Profe
 */
public class SumaResta {

    public static void main(String[] args){
        
        // Definicion variables
        int num1, num2;
        
        System.out.println("--- SUMAR Y RESTAR CON FUNCIONES ---");
        
        //Input números
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el primer número:");
        num1 = teclado.nextInt();
        System.out.println("Escribe el segundo número:");
        num2 = teclado.nextInt();
        
        //Llamar a las funciones
        suma(num1, num2);
        resta(num1, num2);
    }
    
    //Funciones
    static void suma(int pepito, int pepita){ //no devuelve nada (return)
        System.out.println("La suma es:");
        System.out.println(pepito+pepita);
    }
    
    static void resta(int alfonsito, int alfonsita){
        System.out.println("La resta es:");
        System.out.println(alfonsito-alfonsita);
    }
}
