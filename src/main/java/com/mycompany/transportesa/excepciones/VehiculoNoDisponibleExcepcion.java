/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportesa.excepciones;

/**
 * Excepción que se lanza cuando un {@link com.mycompany.transportesa.entidades.Vehiculo}
 * no está disponible para ser asignado a un viaje.
 * 
 * @author Alegre
 * @author Aquino
 * @author Latour
 */
public class VehiculoNoDisponibleExcepcion extends Exception {
    public VehiculoNoDisponibleExcepcion(String mensaje) {
        super(mensaje);
    }
}
