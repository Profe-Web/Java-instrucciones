package com.mycompany.inmuebles;

/**
 *
 * @author Profe
 */
// VERSION SIMPLE
public class Inmuebles {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //crear una instancia: crear un objeto de la clase a partir del constructor
        Casa casa1 = new Casa(200, 300560.38, "Santa Coloma de Gramanet", false);
        System.out.println(casa1);
        
        Piso piso1 = new Piso(100, 200000, "Barcelona", "tercera", true);
        System.out.println(piso1);
        
        Trastero t1 = new Trastero(8, 10000, "Cornellà", false);
        System.out.println(t1);
    }

    //Crear 3 tipos de inmuebles: casa, piso, trastero
    public static class Casa {

        public int superficie;
        public double precio;
        public String ubicacion;
        public boolean adosada; //true or false

        //constructor
        public Casa(int superficie, double precio, String ubicacion, boolean adosada) {
            this.superficie = superficie;
            this.precio = precio;
            this.ubicacion = ubicacion;
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

    public static class Piso {

        public int superficie;
        public double precio;
        public String ubicacion;
        public String planta;
        public boolean ascensor;
        
        public Piso(int superficie, double precio, String ubicacion, String planta, boolean ascensor){
            this.superficie = superficie;
            this.precio = precio;
            this.ubicacion = ubicacion;
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
    
    public static class Trastero{
        public int superficie;
        public double precio;
        public String ubicacion;
        public boolean seguridad;
        
        public Trastero(int superficie, double precio, String ubicacion, boolean seguridad){
            this.superficie = superficie;
            this.precio = precio;
            this.ubicacion = ubicacion;
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
}
