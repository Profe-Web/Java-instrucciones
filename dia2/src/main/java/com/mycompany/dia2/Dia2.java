package com.mycompany.dia2;

import java.util.Scanner;

/**
 *
 * @author Profe
 */
public class Dia2 {

    public static void main(String[] args) {

        /*   float numeroEntero = 5.3f;
        float numeroByte = 128.5f;
        
        float numUsuario;
        
        final float PI = 3.1415927F; //final = const
       
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un número decimal");
        numUsuario = teclado.nextFloat();
        
        System.out.println("tu numero es:  " + numUsuario);
        System.out.println("el número Pi es:  " + PI);
         */
        int numUsuario1;
        int numUsuario2;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un número");
        numUsuario1 = teclado.nextInt();
        System.out.println("Escribe otro número");
        numUsuario2 = teclado.nextInt();
        double resultado;
        resultado = (float) numUsuario1 / numUsuario2;
        System.out.println("la división es: " + resultado);
    }
}
