
package com.mycompany.programaradio;

/**
 *
 * @author Profe
 */

public class Podcast {
    
    String nombre = "";
    String genero = "";
    int duracion = 0;
    String canal ="";

    public Podcast(String nombre, String genero, int duracion, String canal) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.canal = canal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    @Override
    public String toString() {
        return "\nnombre=" + nombre + ", genero=" + genero + ", duracion=" + duracion + ", canal=" + canal;
    }
    
}
