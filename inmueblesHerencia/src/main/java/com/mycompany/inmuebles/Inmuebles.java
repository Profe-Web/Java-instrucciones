package com.mycompany.inmuebles;

/**
 *
 * @author Profe
 */
// VERSION HERENCIA ***
public class Inmuebles {

    public static void main(String[] args) {
        //Crear 3 tipos de inmuebles: casa, piso, trastero
        //crear una instancia: crear un objeto de la clase a partir del constructor
        Casa casa1 = new Casa(200, 300560.38, "Santa Coloma de Gramanet", false);
        System.out.println(casa1);

        Piso piso1 = new Piso(100, 200000, "Barcelona", "tercera", true);
        System.out.println(piso1);

        Trastero t1 = new Trastero(8, 10000, "Cornellà", false);
        System.out.println(t1);
    }
}
