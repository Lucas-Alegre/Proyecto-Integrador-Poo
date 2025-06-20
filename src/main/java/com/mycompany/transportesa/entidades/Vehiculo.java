/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportesa.entidades;

import java.util.ArrayList;

/**
 *
 * @author
 */
public abstract class Vehiculo {

    private String patente;
    private int anioFabricacion;
    private double kilometraje;
    private ArrayList<Viaje> viajeLista;

    public Vehiculo(String patente, int anioFabricacion, double kilometraje, ArrayList<Viaje> viajeLista) {
        this.patente = patente;
        this.anioFabricacion = anioFabricacion;
        this.kilometraje = kilometraje;
        this.viajeLista = viajeLista;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public ArrayList<Viaje> getViajeLista() {
        return viajeLista;
    }

    public void setViajeLista(ArrayList<Viaje> viajeLista) {
        this.viajeLista = viajeLista;
    }


    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + this.getPatente() + ", anioFabricacion=" + this.getAnioFabricacion() + ", kilometraje=" + this.getKilometraje() + ", viajeLista=" + this.getViajeLista() + '}';
    }

}
