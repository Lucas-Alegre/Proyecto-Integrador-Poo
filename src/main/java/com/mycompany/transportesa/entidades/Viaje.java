/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportesa.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class Viaje {

    private String fechaDeSalida;
    private String fechaDeLlegada;
    private String horarioSalida;
    private String horarioLlegada;
    private Ciudad ciudadOrigen;
    private Ciudad ciudadDestino;
    private Vehiculo vehiculo;
    private Chofer chofer;

    public Viaje(String fechaDeSalida, String fechaDeLlegada, String horarioSalida, String horarioLlegada, Ciudad ciudadOrigen, Ciudad ciudadDestino, Vehiculo vehiculo, Chofer chofer) {
        this.fechaDeSalida = fechaDeSalida;
        this.fechaDeLlegada = fechaDeLlegada;
        this.horarioSalida = horarioSalida;
        this.horarioLlegada = horarioLlegada;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.vehiculo = vehiculo;
        this.chofer = chofer;
    }

    public String getFechaDeSalida() {
        return fechaDeSalida;
    }

    public void setFechaDeSalida(String fechaDeSalida) {
        this.fechaDeSalida = fechaDeSalida;
    }

    public String getFechaDeLlegada() {
        return fechaDeLlegada;
    }

    public void setFechaDeLlegada(String fechaDeLlegada) {
        this.fechaDeLlegada = fechaDeLlegada;
    }

    public String getHorarioSalida() {
        return horarioSalida;
    }

    public void setHorarioSalida(String horarioSalida) {
        this.horarioSalida = horarioSalida;
    }

    public String getHorarioLlegada() {
        return horarioLlegada;
    }

    public void setHorarioLlegada(String horarioLlegada) {
        this.horarioLlegada = horarioLlegada;
    }

    public Ciudad getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(Ciudad ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public Ciudad getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(Ciudad ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Chofer getChofer() {
        return chofer;
    }

    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }

    @Override
    public String toString() {
        return "Viaje{" + "fechaDeSalida=" + fechaDeSalida + ", fechaDeLlegada=" + fechaDeLlegada + ", horarioSalida=" + horarioSalida + ", horarioLlegada=" + horarioLlegada + ", ciudadOrigen=" + ciudadOrigen + ", ciudadDestino=" + ciudadDestino + ", vehiculo=" + vehiculo + ", chofer=" + chofer + '}';
    }

}
