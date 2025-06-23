/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportesa.entidades;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Representa a un chofer del sistema, que extiende a {@link Persona}, y
 * contiene información sobre su número de licencia, sus categorías de
 * conducción y los viajes asignados.
 *
 * @author Alegre
 * @author Aquino
 * @author Latour
 */
public class Chofer extends Persona {

    private String nroLicencia;
    private List<ChoferCategoria> categorias;
    private List<Viaje> viajeLista;

    /**
     * Crea un nuevo chofer con los datos personales y laborales especificados.
     *
     * @param dni número de documento
     * @param nombre nombre del chofer
     * @param apellido apellido del chofer
     * @param nroLicencia número de licencia de conducir
     * @param categorias lista de categorías que posee el chofer
     * @param viajeLista lista de viajes que tiene asignados
     */
    public Chofer(long dni, String nombre, String apellido, String nroLicencia, List<ChoferCategoria> categorias, List<Viaje> viajeLista) {
        super(dni, nombre, apellido);
        this.nroLicencia = nroLicencia;
        this.categorias = categorias;
        this.viajeLista = viajeLista;
    }

    /**
     * Devuelve el número de licencia del chofer.
     *
     * @return número de licencia como cadena
     */
    public String getNroLicencia() {
        return this.nroLicencia;
    }

    /**
     * Establece un nuevo número de licencia para el chofer.
     *
     * @param nuevoNroLicencia nuevo número de licencia
     */
    public void setNroLicencia(String nuevoNroLicencia) {
        this.nroLicencia = nuevoNroLicencia;
    }

    /**
     * Devuelve la lista de categorías asociadas al chofer.
     *
     * @return lista de {@link ChoferCategoria}
     */
    public List<ChoferCategoria> getCategorias() {
        return this.categorias;
    }

    /**
     * Establece una nueva lista de categorías para el chofer.
     *
     * @param categorias lista de categorías
     */
    public void setCategorias(List<ChoferCategoria> categorias) {
        this.categorias = categorias;
    }

    /**
     * Devuelve la lista de viajes asignados al chofer.
     *
     * @return lista de {@link Viaje}
     */
    public List<Viaje> getViajeLista() {
        return viajeLista;
    }

    /**
     * Asigna una nueva lista de viajes al chofer.
     *
     * @param viajeLista lista de viajes
     */
    public void setViajeLista(List<Viaje> viajeLista) {
        this.viajeLista = viajeLista;
    }

    /**
     * Agrega una nueva relación categoría-chofer a la lista del chofer.
     *
     * @param categoria instancia de {@link ChoferCategoria} a agregar
     */
    public void agregarCategoria(ChoferCategoria categoria) {
        categorias.add(categoria);
    }

    /**
     * Verifica si el chofer está disponible para un viaje en una fecha y
     * horario determinados, considerando que debe haber al menos 8 horas entre
     * viajes.
     *
     * @param fecha fecha del nuevo viaje (formato dd-MM-yyyy)
     * @param horaSalida hora de salida del nuevo viaje
     * @param horaLlegada hora de llegada del nuevo viaje
     * @return {@code true} si el chofer está disponible, {@code false} si hay
     * superposición
     */
    public boolean estaDisponible(String fecha, String horaSalida, String horaLlegada) {
        //Transforma todo los String a tipo LocalDateTime para tratar fecha y hora en su conjunto
        //formatter es el nombre del formateador
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime nuevaSalida = LocalDateTime.parse(fecha + " " + horaSalida, formatter);
        LocalDateTime nuevaLlegada = LocalDateTime.parse(fecha + " " + horaLlegada, formatter);

        for (Viaje v : viajeLista) {
            LocalDateTime salidaExistente = LocalDateTime.parse(v.getFechaDeSalida() + " " + v.getHorarioSalida(), formatter);
            LocalDateTime llegadaExistente = LocalDateTime.parse(v.getFechaDeSalida() + " " + v.getHorarioLlegada(), formatter);

            if (nuevaSalida.isBefore(llegadaExistente.plusHours(8))) {
                return false;
            } else {
            }
        }
        return true;
    }

    /**
     * Devuelve una representación simplificada del chofer para mostrar en
     * listados.
     *
     * @return string con DNI, nombre y apellido
     */
    public String getChoferToUser() {
        return "[dni: " + super.getDni() + ", Nombre: " + super.getNombre() + ", Apellido: " + super.getApellido();
    }
}
