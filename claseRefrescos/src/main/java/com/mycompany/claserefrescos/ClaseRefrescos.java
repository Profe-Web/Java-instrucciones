package com.mycompany.claserefrescos;

/**
 *
 * @author Profe
 */
public class ClaseRefrescos {

    public static void main(String[] args) {
        //desde aquí se llama al método constructor, para crar nuevos objetos enviandole parametros
        System.out.println("");

        //Llamar método constructor para crear nuevo objeto
        BebidasConGas bebida1 = new BebidasConGas("Coca-Cola", "zarzaparrilla", 1.67f);
        BebidasConGas bebida2 = new BebidasConGas("Fanta", "naranja", 1.55f);
        System.out.println("");
        System.out.println(bebida1.mostrarBebida());
        System.out.println(bebida1); //Llama a toString() por defecto!
        System.out.println("");
        System.out.println(bebida2.mostrarBebida());
        System.out.println(bebida2); //Llama a toString()
        System.out.println("");
        System.out.println("Atributos sueltos bebida 1");
        System.out.println("Marca: " + bebida1.marca);
        System.out.println("Sabor: " + bebida1.sabor);
        System.out.println("Precio: " + bebida1.precio);
        System.out.println("");
        System.out.println("Atributos sueltos bebida 2");
        System.out.println("Marca: " + bebida2.marca);
        System.out.println("Sabor: " + bebida2.sabor);
        System.out.println("Precio: " + bebida2.precio);
    }

    public static class BebidasConGas {  //PascalCase

        //Indicarle atributos del objeto
        public String marca; //OJO, normalmente atributos son PRIVATE
        public String sabor;
        public float precio;

        //METODOS CONSTRUCTOR ******************
        //Metodos suelen ser publicos y atributos suelen ser privados***
        //MODO 1: los parámetros se llaman igual a los atributos. Es más frecuente:
        public BebidasConGas(String marca, String sabor, float precio) {
            this.marca = marca;
            this.sabor = sabor;
            this.precio = precio;
        }

        //MODO 2: los parámetros se llaman diferente a los atributos:
//       public BebidasConGas(String newMarca, String newSabor, float newPrecio){
//           marca = newMarca;
//           sabor = newSabor;
//           precio = newPrecio;
//       }
        
        public String mostrarBebida() {
            return "Esta bebida con gas está buenísima y yo soy Perico de los Palotes";
        }
        
        
        @Override //sobreescribe el método interno toString
        public String toString() { //Lo habitual para mostrar los atributos es toString()
            return "Esta bebida con gas se llama " + marca + " y tiene un sabor a " + sabor + ", y vale " + precio + " euros";
        }

    }

}
