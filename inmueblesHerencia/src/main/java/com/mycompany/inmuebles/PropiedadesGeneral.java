package com.mycompany.inmuebles;

/**
 *
 * @author Profe
 */
public class PropiedadesGeneral {

    public int superficie;
    public double precio;
    public String ubicacion;

    public PropiedadesGeneral(int superficie, double precio, String ubicacion) {
        this.superficie = superficie;
        this.precio = precio;
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "PropiedadesGeneral{" + "superficie=" + superficie + ", precio=" + precio + ", ubicacion=" + ubicacion + '}';
    }
    
    

}
