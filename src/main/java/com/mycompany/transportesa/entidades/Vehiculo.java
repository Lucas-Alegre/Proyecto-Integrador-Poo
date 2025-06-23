/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportesa.entidades;

import java.util.ArrayList;

/**
 * Clase abstracta que representa un vehículo del sistema, con información sobre
 * su patente, capacidad y la lista de {@link Viaje}s asignados. Es la clase
 * base para {@link Colectivo} y {@link Minibus}.
 *
 * @author Alegre
 * @author Aquino
 * @author Latour
 */
public abstract class Vehiculo {

    private String patente;
    private int capacidad;
    private ArrayList<Viaje> viajeLista;

    /**
     * Crea un nuevo vehículo con los datos especificados.
     *
     * @param patente la patente del vehículo
     * @param capacidad cantidad máxima de pasajeros
     * @param viajeLista lista de viajes asignados a este vehículo
     */
    public Vehiculo(String patente, int capacidad, ArrayList<Viaje> viajeLista) {
        this.patente = patente;
        this.capacidad = capacidad;
        this.viajeLista = viajeLista;
    }

    /**
     * Devuelve la patente del vehículo.
     *
     * @return la patente como {@code String}
     */
    public String getPatente() {
        return patente;
    }

    /**
     * Establece una nueva patente para el vehículo.
     *
     * @param patente nueva patente
     */
    public void setPatente(String patente) {
        this.patente = patente;
    }

    /**
     * Devuelve la lista de {@link Viaje}s asignados a este vehículo.
     *
     * @return lista de viajes
     */
    public ArrayList<Viaje> getViajeLista() {
        return viajeLista;
    }

    /**
     * Establece una nueva lista de {@link Viaje}s para este vehículo.
     *
     * @param viajeLista lista de viajes
     */
    public void setViajeLista(ArrayList<Viaje> viajeLista) {
        this.viajeLista = viajeLista;
    }

    /**
     * Devuelve una representación textual del vehículo.
     *
     * @return string con patente y capacidad
     */
    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", capacidad=" + capacidad + '}';
    }

}
