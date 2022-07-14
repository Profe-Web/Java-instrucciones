
package com.mycompany.testarraylistclass;

/**
 *
 * @author Profe
 */

public class TiendaChino {
    
    //Atributos
    private String name = "";
    private String section = "";
    private double price = 0.0;
    
    
    //Constructores
    public TiendaChino(String name, String section, double price) {
        this.name = name;
        this.section = section;
        this.price = price;
    }
    

    public TiendaChino() {
    }
    
    
    //Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    //toString
    @Override
    public String toString() {
        return "\nname=" + name + ", section=" + section + ", price=" + price;
    }
    
    
    
}
