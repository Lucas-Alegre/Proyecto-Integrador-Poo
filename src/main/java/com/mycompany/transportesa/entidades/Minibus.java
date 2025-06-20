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
public class Minibus extends Vehiculo {

    private boolean tieneBodega;
    private boolean aireAcondicionado;

    public Minibus(String patente, int capacidad, ArrayList<Viaje> viajeLista, boolean tieneBodega, boolean aireAcondicionado) {
        super(patente,capacidad, viajeLista);
        this.tieneBodega = tieneBodega;
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean getTieneBodega() {
        return this.tieneBodega;
    }

    public void setTieneBodega(boolean nuevoEstadoDeBodega) {
        this.tieneBodega = nuevoEstadoDeBodega;
    }

    public boolean getAireAconcicionado() {
        return this.aireAcondicionado;
    }

    public void setAireAcondicionado(boolean nuevoEstadoAireAcondicionado) {
        this.aireAcondicionado = nuevoEstadoAireAcondicionado;
    }
    
    public String getMinibusToUser(){
        return "Minibus [Patente: " + super.getPatente()+" ]";
    }

    @Override
    public String toString() {
        return "Minibus con " + super.toString() + ", Tiene Bodega? = " + getTieneBodega() + ", Tiene aire acondicionado? = " + getAireAconcicionado();
    }
}
