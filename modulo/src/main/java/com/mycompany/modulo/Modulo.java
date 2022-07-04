
package com.mycompany.modulo;

import java.util.Scanner;

public class Modulo {

    public static void main(String[] args) {
        
        // variables
        int num1,num2, cociente, modulo;
        
        //entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero 1: ");
        num1 = teclado.nextInt();
        System.out.print("Numero 2: ");
        num2 = teclado.nextInt();
        
        //Cálculos
        cociente = num1/num2;
        modulo = num1%num2;
        
        //salida
        System.out.println("El cociente es: " + cociente);
        System.out.println("El resto de la división es: " + modulo);
    }
}
