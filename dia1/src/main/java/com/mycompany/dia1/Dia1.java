package com.mycompany.dia1;

import java.util.Scanner;

/**
 *
 * @author Profe
 */
public class Dia1 {

    public static void main(String[] args) {

        //definicion de variables
        int num1, num2, suma;
        String nombre;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe tu nombre: ");
        nombre = teclado.nextLine(); //Line para string

        System.out.print("Escribe el primer número: ");
        num1 = teclado.nextInt(); //int para enteros
        System.out.print("Escribe el segundo número: ");
        num2 = teclado.nextInt();

        //Hacer la suma
        suma = num1 + num2;

        //Mostrar en pantalla
        System.out.println(""); //dejar linea en blanco, o \n
        System.out.println("Hola " + nombre + ", la suma de num1 y num2 da: " + suma);
        
       
    }
}