/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportesa.entidades;

/**
 * Clase abstracta que representa a una persona con información básica como DNI,
 * nombre y apellido. Es la clase base para entidades como {@link Chofer}.
 *
 * @author Alegre
 * @author Aquino
 * @author Latour
 */
public abstract class Persona {

    private long dni;
    private String nombre;
    private String apellido;

    /**
     * Crea una nueva persona con los datos proporcionados.
     *
     * @param dni documento nacional de identidad
     * @param nombre nombre de la persona
     * @param apellido apellido de la persona
     */
    public Persona(long dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * Devuelve el nombre de la persona.
     *
     * @return nombre
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Devuelve el apellido de la persona.
     *
     * @return apellido
     */
    public String getApellido() {
        return this.apellido;
    }

    /**
     * Devuelve el número de documento de la persona.
     *
     * @return DNI
     */
    public long getDni() {
        return this.dni;
    }

    /**
     * Establece un nuevo número de documento.
     *
     * @param dni nuevo DNI
     */
    public void setDni(long dni) {
        this.dni = dni;
    }

    /**
     * Establece un nuevo nombre para la persona.
     *
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece un nuevo apellido para la persona.
     *
     * @param apellido nuevo apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Devuelve una representación en texto de la persona.
     *
     * @return string con DNI, nombre y apellido
     */
    @Override
    public String toString() {
        return "Persona{" + "dni=" + this.getDni() + ", nombre=" + this.getNombre() + ", apellido=" + this.getApellido() + '}';
    }
}
