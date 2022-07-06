package com.mycompany.ordenata2;

/**
 *
 * @author Profe
 */
public class PCconstructor {

    String marca = "";
    String modelo = "";
    double precio = 0;
    
    //Sobrecarga de método constructor ***
    //constructor 1 (3 parametros)
    public PCconstructor(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    //constructor 1 (2 parametros)
    public PCconstructor(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return marca + " modelo " + modelo + ", y cuesta " + precio + " pesetas";
    }
}
