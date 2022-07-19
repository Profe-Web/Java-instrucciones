package com.mycompany.camaras;

/**
 *
 * @author Profe
 */
public class Camara {

    private String marca = "";
    private String modelo = "";
    private String tipoObjetivo = "";
    private int megapixels = 0;
    private boolean reflex = true;
    private float precio = 0.0f;

    public Camara(String marca, String modelo, String tipoObjetivo, int megapixels, boolean reflex, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoObjetivo = tipoObjetivo;
        this.megapixels = megapixels;
        this.reflex = reflex;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoObjetivo() {
        return tipoObjetivo;
    }

    public void setTipoObjetivo(String tipoObjetivo) {
        this.tipoObjetivo = tipoObjetivo;
    }

    public int getMegapixels() {
        return megapixels;
    }

    public void setMegapixels(int megapixels) {
        this.megapixels = megapixels;
    }

    public boolean isReflex() {
        return reflex;
    }

    public String getReflex() {
        String esReflex = "";
        if (reflex) {
            esReflex = " es reflex";
        } else {
            esReflex = " no es reflex";
        }
        return esReflex;
    }

    public void setReflex(boolean reflex) {
        this.reflex = reflex;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        String esReflex = "";
        if (reflex) {
            esReflex = "es reflex";
        } else {
            esReflex = "no es reflex";
        }
        return "marca: " + marca + ", modelo: " + modelo + ", tipo de objetivo: " + tipoObjetivo + ", megapixels: " + megapixels + ", reflex: " + esReflex;
    }
}
