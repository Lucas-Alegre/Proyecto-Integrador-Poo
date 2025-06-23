/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportesa.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un viaje dentro del sistema de transporte. Contiene la información
 * sobre fechas, horarios, ciudades de origen y destino, el {@link Vehiculo}
 * asignado y el {@link Chofer}.
 *
 * @author Alegre
 * @author Aquino
 * @author Latour
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

    /**
     * Crea un nuevo viaje con todos los datos necesarios.
     *
     * @param fechaDeSalida fecha de salida (formato dd-MM-yyyy)
     * @param fechaDeLlegada fecha de llegada (formato dd-MM-yyyy)
     * @param horarioSalida horario de salida (formato HH:mm)
     * @param horarioLlegada horario de llegada (formato HH:mm)
     * @param ciudadOrigen ciudad desde donde parte el viaje
     * @param ciudadDestino ciudad a la que llega el viaje
     * @param vehiculo vehículo asignado al viaje
     * @param chofer chofer asignado al viaje
     */
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

    /**
     * @return la fecha de salida del viaje
     */

    public String getFechaDeSalida() {
        return fechaDeSalida;
    }

    /**
     * @param fechaDeSalida nueva fecha de salida
     */

    public void setFechaDeSalida(String fechaDeSalida) {
        this.fechaDeSalida = fechaDeSalida;
    }

    /**
     * @return la fecha de llegada del viaje
     */

    public String getFechaDeLlegada() {
        return fechaDeLlegada;
    }

    /**
     * @param fechaDeLlegada nueva fecha de llegada
     */

    public void setFechaDeLlegada(String fechaDeLlegada) {
        this.fechaDeLlegada = fechaDeLlegada;
    }

    /**
     * @return el horario de salida del viaje
     */

    public String getHorarioSalida() {
        return horarioSalida;
    }

    /**
     * @param horarioSalida nuevo horario de salida
     */

    public void setHorarioSalida(String horarioSalida) {
        this.horarioSalida = horarioSalida;
    }

    /**
     * @return el horario de llegada del viaje
     */

    public String getHorarioLlegada() {
        return horarioLlegada;
    }

    /**
     * @param horarioLlegada nuevo horario de llegada
     */

    public void setHorarioLlegada(String horarioLlegada) {
        this.horarioLlegada = horarioLlegada;
    }

    /**
     * @return ciudad de origen del viaje
     */

    public Ciudad getCiudadOrigen() {
        return ciudadOrigen;
    }

    /**
     * @param ciudadOrigen nueva ciudad de origen
     */
    public void setCiudadOrigen(Ciudad ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    /**
     * @return ciudad de destino del viaje
     */
    public Ciudad getCiudadDestino() {
        return ciudadDestino;
    }

    /**
     * @param ciudadDestino nueva ciudad de destino
     */
    public void setCiudadDestino(Ciudad ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    /**
     * @return vehículo asignado al viaje
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * @param vehiculo nuevo vehículo asignado
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * @return chofer asignado al viaje
     */
    public Chofer getChofer() {
        return chofer;
    }

    /**
     * @param chofer nuevo chofer asignado
     */
    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }

    /**
     * Devuelve una representación completa del viaje, incluyendo sus atributos
     * principales.
     *
     * @return cadena con la información del viaje
     */
    @Override
    public String toString() {
        return "Viaje{" + "fechaDeSalida=" + fechaDeSalida + ", fechaDeLlegada=" + fechaDeLlegada + ", horarioSalida=" + horarioSalida + ", horarioLlegada=" + horarioLlegada + ", ciudadOrigen=" + ciudadOrigen + ", ciudadDestino=" + ciudadDestino + ", vehiculo=" + vehiculo + ", chofer=" + chofer + '}';
    }

}
