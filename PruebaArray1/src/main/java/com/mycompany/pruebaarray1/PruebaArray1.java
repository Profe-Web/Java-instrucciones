/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.pruebaarray1;

import java.util.Scanner;

/**
 *
 * @author Profe
 */
public class PruebaArray1 {

    public static void main(String[] args) {
        int[] nuevoArray = new int[5];
        int entrada = 0;
        int sumaTotal = 0;
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Entra nuevo número");
            entrada = sc.nextInt();
            nuevoArray[i] = entrada;
            sumaTotal = sumaTotal+entrada;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Tu array es: ");
            System.out.println(nuevoArray[i]);
        }
        System.out.println("Y la suma es " + sumaTotal);
    }
}
