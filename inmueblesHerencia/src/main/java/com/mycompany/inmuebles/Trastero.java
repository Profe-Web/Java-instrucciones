
package com.mycompany.inmuebles;

/**
 *
 * @author Profe
 */
public class Trastero extends PropiedadesGeneral{
        
        public boolean seguridad;
        
        public Trastero(int superficie, double precio, String ubicacion, boolean seguridad){
            super(superficie, precio, ubicacion);
            this.seguridad = seguridad;
        }
        
        @Override
        public String toString(){
            String tieneSeguridad = "";

            if (seguridad) { //==true
                tieneSeguridad = "tiene seguridad";
            } else {
                tieneSeguridad = "no tiene seguridad";
            }

            return "Este trastero tiene " + superficie + " metros cuadrados, y vale " + precio + " euros. Está ubicado en " + ubicacion + ", y " + tieneSeguridad;
        }
        
    }