package com.mycompany.testgetset;

/**
 *
 * @author Profe
 */
public class TestGetSet {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Angel", 51, "56895245K");
        System.out.println(persona1);

        Persona persona2 = new Persona("Rosa", 25, "458695841P");
        System.out.println(persona2);

        Persona persona3 = new Persona();

        //System.out.println(persona1.edad);  *Habria que cambiarlo por getEdad()
        //persona1.edad = 52;  *Habria que cambiarlo por setEdad()
        //System.out.println(persona1.edad);
        //System.out.println(persona2.edad);
        System.out.println(persona3);
        //persona3.edad = 40;
        System.out.println(persona3);
        System.out.println("ejemplo retorno get nombre: " + persona1.getNombre());
        //System.out.println("ejemplo sin retorno de nombre: " + persona1.nombre);
        persona1.setNombre("Yerba");
        System.out.println("cambio con set Nombre: " + persona1.getNombre());
        
        persona3.setNombre("Gerardo");
        persona3.setEdad(56);
        persona3.setDni("4586598K");
        
        System.out.println(persona3.getNombre());
            String p3n = persona3.getNombre();
        System.out.println(persona3.getEdad());
            int p3e = persona3.getEdad();
        System.out.println(persona3.getDni());
            String p3d = persona3.getDni();
            
        System.out.println("Resultado con la variables guardadas: ");
        System.out.println("Nombre: " + p3n);
        System.out.println("Edad: " + p3e);
        System.out.println("DNI: " + p3d);
    }
}
