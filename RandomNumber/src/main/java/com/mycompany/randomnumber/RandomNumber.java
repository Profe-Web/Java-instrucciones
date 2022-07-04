

package com.mycompany.randomnumber;

import java.util.Scanner;

/**
 *
 * @author Profe
 */
public class RandomNumber {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int randomNumber = (int) Math.ceil((Math.random()*10));
        int userNumber = 0;
        int tries = 0;
        
        while(userNumber!=randomNumber){
            tries = tries +1;
            System.out.println("introduce un número del 1 al 10");
            userNumber = keyboard.nextInt();
        }
        System.out.println("Enhorabuena, el número era " + randomNumber);
        System.out.println("Número de intentos: " + tries);
    }
}
