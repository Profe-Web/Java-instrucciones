
package com.mycompany.sumarestareturn;

import java.util.Scanner;

/**
 *
 * @author Profe
 */
public class SumaRestaReturn {

    public static void main(String[] args) {
        // Definicion variables
        int num1, num2, resultado1, resultado2;
        
        System.out.println("--- SUMAR Y RESTAR CON FUNCIONES ---");
        
        //Input números
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el primer número:");
        num1 = teclado.nextInt();
        System.out.println("Escribe el segundo número:");
        num2 = teclado.nextInt();
        
        //Llamar a las funciones
        resultado1 = suma(num1, num2);
        resultado2 = resta(num1, num2);
        
        //Mostrar resultados
        System.out.println("La suma es: " + resultado1);
        System.out.println("La resta es: " + resultado2);
    }
    
    //Funciones
    static int suma(int pepito, int pepita){ //devueltve entero (return)
        int resultado1 = pepito+pepita;
        return resultado1;
    }
    
    static int resta(int alfonsito, int alfonsita){
        int resultado2 = alfonsito-alfonsita;
        return resultado2;
    }
}
