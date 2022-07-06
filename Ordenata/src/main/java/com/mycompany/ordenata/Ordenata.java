

package com.mycompany.ordenata;

/**
 *
 * @author Profe
 */

public class Ordenata {

    public static void main(String[] args) {
        int x = 11;
        int y = 5;
        calculo(x, y); //ENTERO
        String res = calculo(11.0f, 5.0f); //FLOAT
        calculo(42, 86, 78); //3 PARAMETROS
        
        System.out.println(res);
    }
    
    //SOBRECARCARGA DE METODOS
    static void calculo(int pepito, int pepita){
        System.out.println("la division de dos enteros es: " + pepito/pepita);
    }
    
    static String calculo(float num1, float num2){
        return "la division de dos floats es: " + num1/num2;
    }
    
    static void calculo(int num1, int num2, int num3){
        System.out.println("la suma de los tres números es: " + (num1+num2+num3));
    }
}
