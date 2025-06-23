/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportesa.excepciones;

/**
 * Excepción que se lanza cuando se intenta planificar un viaje en el que la ciudad de origen
 * y la ciudad de destino son la misma.
 * 
 * @author Alegre
 * @author Aquino
 * @author Latour
 */

public class CiudadesIgualesExcepcion extends Exception {
    public CiudadesIgualesExcepcion(String mensaje) {
        super(mensaje);
    }
}

