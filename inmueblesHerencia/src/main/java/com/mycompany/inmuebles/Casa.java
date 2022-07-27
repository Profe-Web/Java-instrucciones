
package com.mycompany.inmuebles;

/**
 *
 * @author Profe
 */
public class Casa extends PropiedadesGeneral{
       
        public boolean adosada; //true or false

        //constructor
        public Casa(int superficie, double precio, String ubicacion, boolean adosada) {
            super(superficie, precio, ubicacion);
            this.adosada = adosada;
        }

        //Mostrar objeto
        @Override
        public String toString() {
            String estaAdosada = "";

            if (adosada) { //==true
                estaAdosada = "está adosada";
            } else {
                estaAdosada = "no está adosada";
            }
         
            return "Esta casa tiene " + superficie + " metros cuadrados, y vale " + precio + " euros. Está ubicada en " + ubicacion + " y " + estaAdosada;
        }
    }
