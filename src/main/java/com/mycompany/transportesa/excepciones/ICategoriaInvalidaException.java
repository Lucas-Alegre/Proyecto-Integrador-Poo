/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportesa.excepciones;

/**
 * Excepción que se lanza cuando un
 * {@link com.mycompany.transportesa.entidades.Chofer} no posee la
 * {@link com.mycompany.transportesa.entidades.Categoria} requerida para
 * conducir el {@link com.mycompany.transportesa.entidades.Vehiculo} asignado.
 *
 * @author Alegre
 * @author Aquino
 * @author Latour
 */
public class ICategoriaInvalidaException extends Exception {

    public ICategoriaInvalidaException(String mensaje) {
        super(mensaje);
    }
}
