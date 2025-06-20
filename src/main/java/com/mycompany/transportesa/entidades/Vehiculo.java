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
    private int capacidad;
    private ArrayList<Viaje> viajeLista;

    public Vehiculo(String patente, int capacidad, ArrayList<Viaje> viajeLista) {
        this.patente = patente;
        this.capacidad = capacidad;
        this.viajeLista = viajeLista;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

     public ArrayList<Viaje> getViajeLista() {
       return viajeLista;
    }

    public void setViajeLista(ArrayList<Viaje> viajeLista) {
        this.viajeLista = viajeLista;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", capacidad=" + capacidad + ", viajeLista=" + viajeLista + '}';
    }

}
