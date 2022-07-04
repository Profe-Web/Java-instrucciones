package com.mycompany.dia3;

import java.util.Scanner;

public class Dia3 {

    public static void main(String[] args) {
        //POTENCIAS POW (power)
        //Variables
//        int num1;
//        int num2;
//        double resultado;
//        
//        Scanner teclado = new Scanner(System.in); //abre lector de entrada de teclado
//        System.out.println("Introduce el número"); //sout+TAB
//        num1 = teclado.nextInt();
//        System.out.println("Introduce la potencia");
//        num2 = teclado.nextInt();
//        resultado = Math.pow(num1,num2);
//        
//        System.out.println("El número "+ num1 + " a la potencia " + num2 + " da como resultado " + resultado);
//    

        // Números aleatorios  Math.random()
        // numero entre 0 y 0.99
//        int numeroAleatorio = (int)Math.ceil(Math.random()*10) ; //Redondear
//        //ceil = ceiling (techo) número mínimo de resultado=1 (hasta 10)
//        //floor = (suelo) número mínimo de resultado=0 (hasta 9)
//        
//        System.out.println("El número es:" + numeroAleatorio);
        // BUCLES FOR
//        for(int i=1; i<=10; i++){
//            System.out.println(i);
//        }

        //BUCLES WHILE
//        int i=0;
//        
//        while(i<=10){
//            System.out.println(i);
//            i++;
//        }

        //BUCLES WHILE-2
//        int i=0;
//        boolean condicion = false; //verdadero o falso
//        
//        while(condicion == false){ //Ej: mientras no digan "salir"
//            System.out.println(i);
//            i++;
//            if(i==10){
//                condicion = true;
//            }
//        }

        //ARRAYS (BASICO)
        // Todos los datos del array del mismo tipo!
        // int[] edad = new int[5];
//        //int edad[] = new int[5]; es lo mismo
//        edad[0] = 6;
//        edad[1] = 16;
//        edad[2] = 23;
//        edad[3] = 80;
//        edad[4] = 45;
//        
//        for(int i=0; i<edad.length; i++){
//            System.out.println(edad[i]);
//        }

   //    int[] edad2 = {65, 44, 83, 26, 19, 98, 57, 12, 24, 38};
//        
//        for(int i=0; i<edad2.length; i++){
//            System.out.println(edad2[i]);
//        }
//         
//        //System.out.println(edad2);//imprime direccion de memoria reservada
//        //para que saliera el contenido, habría que usar un ArrayList y sobreescribirlo con el método toString()
//    
//        //Array con strings
//        
  //      String[] nombres = {"Pepito", "Carlitos", "Segismundo", "Florencio", "Eufrasia", "Carlota", "Labbat"};
//        for(int i=0; i<nombres.length; i++){
//            System.out.println(nombres[i]);
//        }
//        

        //for-each (for extendido)
//        for (String i : nombres) {
//            System.out.println(i);
//        }
//        
        
        //for-each (for extendido)
//        for (int i : edad2) {
//            System.out.println(i);
//        }
//        
//        //Longitud array y mitad
//        int longArray = nombres.length;
//        System.out.println("el array tiene " + longArray + " elementos");
//        System.out.println("La mitad de la longitud es: " + longArray/2);
        
        int[] nuevoArray=new int[5];
        
        for(int i=0;i<5;i++){
            nuevoArray[i]= i;
            System.out.println(nuevoArray[i]);
        }
    }
    
    char S = 'S';
}
