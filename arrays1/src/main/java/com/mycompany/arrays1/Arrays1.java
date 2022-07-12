package com.mycompany.arrays1;

/**
 *
 * @author Profe
 */
public class Arrays1 {

    public static void main(String[] args) {
        // Arrays en Java tienen un número limitado de elementos
        // Arrays con número cambiante de elementos, son los ArrayList

        String[] listaCompra = new String[4];

        listaCompra[0] = "Zanahoria";
        listaCompra[1] = "Naranja";
        listaCompra[2] = "Colacao";
        listaCompra[3] = "Mandarinas";
//        listaCompra[4] = "Butifarra";
//        listaCompra[5] = "Agua";

        for (int i = 0; i < listaCompra.length; i++) {
            System.out.println("Elemento " + i + " es: " + listaCompra[i]);
        }

        System.out.println("");
        System.out.println("Con bucle for-each:");
        for (String x : listaCompra) {
            System.out.println("Elemento: " + x);
        }

        System.out.println("");
        //Crear array directo con el contenido
        String[] listaCompra2 = {"Palomitas", "Naranja", "Colacao", "Mandarinas", "Butifarra", "Agua"};

        for (String x : listaCompra2) {
            System.out.println("Elemento: " + x);
        }

        // cambiar de Colacao a bizcochos
        listaCompra2[2] = "bizcochos";

        // cambiar butifarra por jamón
        listaCompra2[4] = "jamón";

        for (String x : listaCompra2) {
            System.out.println("Nuevo elemento: " + x);
        }
        // crear o cambiar lista mediante for y entrada scanner
        // Si se crea, necesitas saber cuántos elementos [4]
        // Si se cambia, se recorre igual y se sobreescribe
        // listaCompra[i] = teclado.nextLine();

        listaCompra2[5] = "";

        for (String x : listaCompra2) {
            System.out.println("Nuevo elemento: " + x);
        }
        System.out.println("Dimensión de la array: " + listaCompra2.length);
    }
}
