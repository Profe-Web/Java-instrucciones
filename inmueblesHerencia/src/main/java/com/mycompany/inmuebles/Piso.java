
package com.mycompany.inmuebles;

/**
 *
 * @author Profe
 */
 public class Piso extends PropiedadesGeneral{

        public String planta;
        public boolean ascensor;
        
        public Piso(int superficie, double precio, String ubicacion, String planta, boolean ascensor){
            super(superficie, precio, ubicacion);
            this.planta = planta;
            this.ascensor = ascensor;
        }
        
        @Override
        public String toString() {
            String tieneAscensor = "";

            if (ascensor) { //==true
                tieneAscensor= "tiene ascensor!";
            } else {
                tieneAscensor = "no tiene ascensor :-(";
            }

            return "Este piso tiene " + superficie + " metros cuadrados, y vale " + precio + " euros. Está ubicado en " + ubicacion + ", es la planta " + planta + " y " + tieneAscensor;
        }
    }
