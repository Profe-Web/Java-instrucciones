

package com.mycompany.ordenata2;

/**
 *
 * @author Profe
 */

public class Ordenata2 {

    public static void main(String[] args) {
        
        PCconstructor pc1 = new PCconstructor("HP", null, 25000);
        System.out.println(pc1);
        
        PCconstructor pc2 = new PCconstructor("HP", 25000);
        System.out.println(pc2);
    }
}
