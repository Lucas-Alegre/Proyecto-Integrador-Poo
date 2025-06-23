/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportesa.excepciones;

/**
 * Excepción que se lanza cuando un
 * {@link com.mycompany.transportesa.entidades.Chofer} no está disponible para
 * ser registrado o asignado a un nuevo viaje (por ejemplo, si ya existe un
 * chofer con el mismo DNI).
 *
 * @author Alegre
 * @author Aquino
 * @author Latour
 */
public class ChoferNoDispinibleExcepcion extends Exception {

    /**
     * Crea una nueva excepción indicando que el chofer no está disponible.
     *
     * @param mensaje descripción del motivo por el cual el chofer no está
     * disponible
     */
    public ChoferNoDispinibleExcepcion(String mensaje) {
        super(mensaje);
    }
}
