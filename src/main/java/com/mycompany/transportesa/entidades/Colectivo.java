/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportesa.entidades;

import java.util.ArrayList;

/**
 * Representa un vehículo del tipo colectivo, que puede ser de uno o dos pisos.
 * Extiende de {@link Vehiculo} y añade el atributo {@code pisoDoble}.
 *
 * @author Alegre
 * @author Aquino
 * @author Latour
 */
public class Colectivo extends Vehiculo {

    private boolean pisoDoble;

    /**
     * Crea un nuevo {@link Colectivo} con los datos especificados.
     *
     * @param patente la patente del colectivo
     * @param capacidad la capacidad de pasajeros
     * @param viajeLista lista de viajes asignados
     * @param pisoDoble indica si el colectivo tiene doble piso
     */
    public Colectivo(String patente, int capacidad, ArrayList<Viaje> viajeLista, boolean pisoDoble) {
        super(patente, capacidad, viajeLista);
        this.pisoDoble = pisoDoble;
    }

    /**
     * Indica si el colectivo es de doble piso.
     *
     * @return {@code true} si es de doble piso, {@code false} si no
     */
    public boolean getPisoDoble() {
        return this.pisoDoble;
    }

    /**
     * Establece si el colectivo es de doble piso.
     *
     * @param pisoDoble {@code true} para colectivo doble piso, {@code false} en
     * caso contrario
     */
    public void setPisoDoble(boolean pisoDoble) {
        this.pisoDoble = pisoDoble;
    }

    /**
     * Devuelve una representación simplificada del colectivo para mostrar al
     * usuario.
     *
     * @return string con información de patente
     */
    public String getColectivoToUser() {
        return "Colectivo [Patente: " + super.getPatente() + " ]";
    }

    /**
     * Devuelve una representación completa del colectivo, incluyendo si tiene
     * doble piso.
     *
     * @return string con todos los datos del colectivo
     */
    @Override
    public String toString() {
        return "Colectivo{" + super.toString() + ", pisoDoble=" + pisoDoble + '}';
    }
}
