/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportesa.servicios;

import com.mycompany.transportesa.entidades.Ciudad;
import java.util.ArrayList;

/**
 * Servicio que gestiona una colección de objetos {@link Ciudad}. Permite
 * agregarlas, listarlas y buscarlas por código postal.
 *
 * @author Lucas
 */
public class CiudadService {

    private ArrayList<Ciudad> listaCiudad;

    /**
     * Crea una nueva instancia del servicio con una lista vacía de ciudades.
     */
    public CiudadService() {
        this.listaCiudad = new ArrayList<>();
    }

    /**
     * Agrega una nueva {@link Ciudad} a la lista.
     *
     * @param ciudad la ciudad a agregar
     */
    public void addCiudad(Ciudad ciudad) {
        //validar si ya esta agregado
        this.listaCiudad.add(ciudad);
    }

    /**
     * Muestra por consola todas las {@link Ciudad}es registradas usando su
     * método {@code toString()}.
     */
    public void mostraCiudades() {
        System.out.println("Lista de Ciudades:");
        for (Ciudad c : listaCiudad) {
            System.out.println(c);
        }
    }

    /**
     * Devuelve la lista completa de ciudades registradas.
     *
     * @return lista de objetos {@link Ciudad}
     */
    public ArrayList<Ciudad> getListadoCiudades() {
        return this.listaCiudad;
    }

    /**
     * Busca una {@link Ciudad} por su código postal.
     *
     * @param codigoPostal el código postal a buscar
     * @return la ciudad correspondiente, o {@code null} si no se encuentra
     */
    public Ciudad getCiudadSegunPostal(String codigoPostal) {
        Ciudad ciudad = null;
        for (Ciudad c : listaCiudad) {
            if (c.getCodigoPostal().equals(codigoPostal)) {
                ciudad = c;
            }
        }
        return ciudad;
    }

    /**
     * Muestra por consola todas las {@link Ciudad}es utilizando su método
     * {@code mostrarAlUsuario()}.
     */
    public void getCiudadesToViaje() {
        for (Ciudad c : listaCiudad) {
            c.mostrarAlUsuario();
        }
    }

}
