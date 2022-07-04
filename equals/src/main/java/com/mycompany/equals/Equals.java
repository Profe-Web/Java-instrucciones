
package com.mycompany.equals;

import java.util.Scanner;

/**
 *
 * @author Profe
 */
public class Equals {

    public static void main(String[] args) {
        //Condicionales igual que en javascript
        //con alguna excepción: comparación de strings
        
        //NUMEROS
//        int num1;
//        int num2;
//        
//        Scanner teclado = new Scanner(System.in);
//        System.out.print("dime el primer número: ");
//        num1 = teclado.nextInt();
//        System.out.print("dime el segundo número: ");
//        num2 = teclado.nextInt();
//        
//        if(num1>num2){
//            System.out.println("El primer número es mayor que el segundo");
//        } else if (num2>num1){
//            System.out.println("El segundo número es mayor que el primero");
//        } else{
//            System.out.println("Los dos números son iguales, o algo falló en la Matrix");
//        }
        

          // STRINGS: equals
//        String letra1, letra2;
//        String password="SECRETO";
//        
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("dime una letra A o B");
//        letra1 = teclado.nextLine();
//        letra1 = letra1.toUpperCase();
//        System.out.println("dime otra letra C o D ");
//        letra2 = teclado.nextLine();
//        letra2 = letra2.toUpperCase();
//        
//        if(letra1.equals(password)){
//            System.out.println("Password correcto!");
//        } else if (letra2.equals("C")||letra2.equals("D")){
//            System.out.println("La segunda letra es C o D");
//        } else{
//            System.out.println("La letra NO es A, B, C, D");
//        }

        // con SWITCH, pasado a "rule switch"
        String letra1;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("dime una letra A o B");
        letra1 = teclado.nextLine();
        letra1 = letra1.toUpperCase();
        
        switch (letra1){
            case "A" -> System.out.println("La letra es A ");
            case "B" -> System.out.println("La letra es B ");
            case "SECRETO" -> System.out.println("PASSWORD CORRECTO! ");
            default -> System.out.println("Hoy no doy una :-( ");
        }
    }
}
