/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportesa.entidades;

import java.util.ArrayList;

/**
 * Representa un vehículo del tipo minibus, que puede incluir bodega y aire
 * acondicionado. Extiende de {@link Vehiculo} y agrega atributos adicionales
 * específicos.
 *
 * @author Alegre
 * @author Aquino
 * @author Latour
 */
public class Minibus extends Vehiculo {

    private boolean tieneBodega;
    private boolean aireAcondicionado;

    /**
     * Crea un nuevo {@link Minibus} con las características especificadas.
     *
     * @param patente la patente del vehículo
     * @param capacidad capacidad máxima de pasajeros
     * @param viajeLista lista de viajes asignados
     * @param tieneBodega indica si el minibus tiene bodega
     * @param aireAcondicionado indica si el minibus tiene aire acondicionado
     */
    public Minibus(String patente, int capacidad, ArrayList<Viaje> viajeLista, boolean tieneBodega, boolean aireAcondicionado) {
        super(patente, capacidad, viajeLista);
        this.tieneBodega = tieneBodega;
        this.aireAcondicionado = aireAcondicionado;
    }

    /**
     * Indica si el minibus tiene bodega.
     *
     * @return {@code true} si tiene bodega, {@code false} si no
     */
    public boolean getTieneBodega() {
        return this.tieneBodega;
    }

    /**
     * Establece si el minibus tiene bodega.
     *
     * @param nuevoEstadoDeBodega {@code true} para indicar que tiene bodega
     */
    public void setTieneBodega(boolean nuevoEstadoDeBodega) {
        this.tieneBodega = nuevoEstadoDeBodega;
    }

    /**
     * Indica si el minibus tiene aire acondicionado.
     *
     * @return {@code true} si tiene aire acondicionado, {@code false} si no
     */
    public boolean getAireAconcicionado() {
        return this.aireAcondicionado;
    }

    /**
     * Establece si el minibus tiene aire acondicionado.
     *
     * @param nuevoEstadoAireAcondicionado {@code true} para indicar que tiene
     * aire acondicionado
     */
    public void setAireAcondicionado(boolean nuevoEstadoAireAcondicionado) {
        this.aireAcondicionado = nuevoEstadoAireAcondicionado;
    }

    /**
     * Devuelve una representación simplificada del minibus para mostrar al
     * usuario.
     *
     * @return string con la patente del minibus
     */
    public String getMinibusToUser() {
        return "Minibus [Patente: " + super.getPatente() + " ]";
    }

    /**
     * Devuelve una representación completa del minibus, incluyendo sus
     * características.
     *
     * @return string con todos los datos del minibus
     */
    @Override
    public String toString() {
        return "Minibus con " + super.toString() + ", Tiene Bodega? = " + getTieneBodega() + ", Tiene aire acondicionado? = " + getAireAconcicionado();
    }
}
