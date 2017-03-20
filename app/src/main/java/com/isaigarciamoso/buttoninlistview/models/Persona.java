package com.isaigarciamoso.buttoninlistview.models;

/**
 * Created by isaigarciamoso on 19/03/17.
 */

public class Persona {

    private int edad;
    private String nombre;
    private double peso;
    private double estura;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstura() {
        return estura;
    }

    public void setEstura(double estura) {
        this.estura = estura;
    }

    public Persona(int edad, String nombre, double peso, double estura) {
        this.edad = edad;
        this.nombre = nombre;
        this.peso = peso;
        this.estura = estura;
    }
}
