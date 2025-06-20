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
public class Colectivo extends Vehiculo {

    private boolean pisoDoble;

    public Colectivo(String patente,int anioFabricacion, double kilometraje, ArrayList<Viaje> viajeLista, boolean pisoDoble) {
        super(patente, anioFabricacion, kilometraje, viajeLista);
        this.pisoDoble = pisoDoble;
    }

    public boolean getPisoDoble() {
        return this.pisoDoble;
    }

    public void setPisoDoble(boolean pisoDoble) {
        this.pisoDoble = pisoDoble;
    }

    public String getColectivoToUser(){
        return "Colectivo [Patente: " + super.getPatente()+" ]";
    }
    
    @Override
    public String toString() {
        return "Colectivo{" + super.toString() + ", pisoDoble=" + pisoDoble + '}';
    }
}
