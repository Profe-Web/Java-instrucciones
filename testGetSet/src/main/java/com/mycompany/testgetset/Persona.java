package com.mycompany.testgetset;

/**
 *
 * @author Profe
 */

public class Persona {

    //Atributos - normalmente son privados
    // para leer, y modificar, se necesitan los getters y setters
    private String nombre;
    private int edad;
    private String dni;

    //Constructor vacío
    public Persona() {

    }

    //Constructor standard
    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        System.out.println("Se ha creado la persona " + nombre);
    }

    //Crear getters y setters
    // getters = leer datos y te lo devuelve el valor
    // setters = establecen un dato. Si no existe, te lo crean nuevo. Si existe, te lo cambian
    
    //getters setters NOMBRE ***
    public String getNombre() { //busca nombre
        return nombre; // lo devuelve
    }

    public void setNombre(String nombre) { //pilla el nuevo nombre
        this.nombre = nombre; // lo cambia
    }
    

    //getters setters EDAD ***
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    

    //getters setters DNI ***
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    //Mostrar elemento
    @Override
    public String toString() {
        return "El nombre es " + nombre + ", la edad es " + edad + ", el DNI es " + dni;
    }
}
