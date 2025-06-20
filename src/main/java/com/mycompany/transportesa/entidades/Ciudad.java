/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportesa.entidades;

import java.util.ArrayList;

/**
 *
 * @author
 */
public class Ciudad {

    private String nombre;
    private ProvinciaEnum provincia;
    private String codigoPostal;
    private ArrayList<Viaje> OrigenLista;
    private ArrayList<Viaje> DestinoLista;

    public Ciudad(String nombre, ProvinciaEnum provincia, String codigoPostal) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.codigoPostal = codigoPostal;
        this.OrigenLista = new ArrayList<>();
        this.DestinoLista = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public ProvinciaEnum getProvincia() {
        return provincia;
    }

    public void setProvincia(ProvinciaEnum provincia) {
        this.provincia = provincia;
    }

    public ArrayList<Viaje> getOrigenLista() {
        return OrigenLista;
    }

    public void setOrigenLista(ArrayList<Viaje> OrigenLista) {
        this.OrigenLista = OrigenLista;
    }

    public ArrayList<Viaje> getDestinoLista() {
        return DestinoLista;
    }

    public void setDestinoLista(ArrayList<Viaje> DestinoLista) {
        this.DestinoLista = DestinoLista;
    }
    public String mostrarAlUsuario(){
        return "[Codigo=" + codigoPostal + ", ciudad=" + nombre + ", provincia=" + provincia +"]";
    }

    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", provincia=" + provincia + ", codigoPostal=" + codigoPostal + ", OrigenLista=" + OrigenLista + ", DestinoLista=" + DestinoLista + '}';
    }
}
