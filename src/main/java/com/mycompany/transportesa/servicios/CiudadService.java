/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportesa.servicios;

import com.mycompany.transportesa.entidades.Ciudad;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class CiudadService {

    private ArrayList<Ciudad> listaCiudad;

    public CiudadService() {
        this.listaCiudad = new ArrayList<>();
    }

    public void addCiudad(Ciudad ciudad) {
        //validar si ya esta agregado
        this.listaCiudad.add(ciudad);
    }

    public void mostraCiudades() {
        System.out.println("Lista de Ciudades:");
        for (Ciudad c : listaCiudad) {
            System.out.println(c);
        }
    }

    public ArrayList<Ciudad> getListadoCiudades() {
        return this.listaCiudad;
    }

    public Ciudad getCiudadSegunPostal(String codigoPostal) {
        Ciudad ciudad = null;
        for (Ciudad c : listaCiudad) {
            if (c.getCodigoPostal().equals(codigoPostal)) {
                ciudad = c;
            }
        }
        return ciudad;
    }
    
    public void getCiudadesToViaje(){
        for (Ciudad c : listaCiudad) {
            c.mostrarAlUsuario();
        }
    }
    

}
