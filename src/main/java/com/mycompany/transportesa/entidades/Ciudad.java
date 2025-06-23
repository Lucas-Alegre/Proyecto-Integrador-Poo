/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportesa.entidades;

import java.util.ArrayList;

/**
 * Representa una ciudad del sistema, con su nombre, provincia, código postal y
 * listas de viajes donde participa como ciudad de origen o destino.
 *
 * @author Alegre
 * @author Aquino
 * @author Latour
 */
public class Ciudad {

    private String nombre;
    private ProvinciaEnum provincia;
    private String codigoPostal;
    private ArrayList<Viaje> OrigenLista;
    private ArrayList<Viaje> DestinoLista;

    /**
     * Crea una nueva ciudad con el nombre, provincia y código postal indicados.
     * Inicializa las listas de viajes como origen y destino.
     *
     * @param nombre nombre de la ciudad
     * @param provincia provincia a la que pertenece
     * @param codigoPostal código postal de la ciudad
     */
    public Ciudad(String nombre, ProvinciaEnum provincia, String codigoPostal) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.codigoPostal = codigoPostal;
        this.OrigenLista = new ArrayList<>();
        this.DestinoLista = new ArrayList<>();
    }

    /**
     * Devuelve el nombre de la ciudad.
     *
     * @return nombre de la ciudad
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para la ciudad.
     *
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el código postal de la ciudad.
     *
     * @return código postal
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Establece un nuevo código postal para la ciudad.
     *
     * @param codigoPostal nuevo código postal
     */
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    /**
     * Devuelve la provincia a la que pertenece la ciudad.
     *
     * @return provincia como {@link ProvinciaEnum}
     */
    public ProvinciaEnum getProvincia() {
        return provincia;
    }

    /**
     * Establece la provincia de la ciudad.
     *
     * @param provincia nueva provincia
     */
    public void setProvincia(ProvinciaEnum provincia) {
        this.provincia = provincia;
    }

    /**
     * Devuelve la lista de {@link Viaje}s donde esta ciudad figura como origen.
     *
     * @return lista de viajes como ciudad de origen
     */
    public ArrayList<Viaje> getOrigenLista() {
        return OrigenLista;
    }

    /**
     * Establece la lista de viajes en los que esta ciudad es origen.
     *
     * @param OrigenLista lista de viajes como ciudad de origen
     */
    public void setOrigenLista(ArrayList<Viaje> OrigenLista) {
        this.OrigenLista = OrigenLista;
    }

    /**
     * Devuelve la lista de {@link Viaje}s donde esta ciudad figura como
     * destino.
     *
     * @return lista de viajes como ciudad de destino
     */
    public ArrayList<Viaje> getDestinoLista() {
        return DestinoLista;
    }

    /**
     * Establece la lista de viajes en los que esta ciudad es destino.
     *
     * @param DestinoLista lista de viajes como ciudad de destino
     */
    public void setDestinoLista(ArrayList<Viaje> DestinoLista) {
        this.DestinoLista = DestinoLista;
    }

    /**
     * Devuelve una representación simplificada de la ciudad para mostrar al
     * usuario.
     *
     * @return string con código postal, ciudad y provincia
     */
    public String mostrarAlUsuario() {
        return "[Codigo=" + codigoPostal + ", ciudad=" + nombre + ", provincia=" + provincia + "]";
    }

    /**
     * Devuelve una representación completa de la ciudad, incluyendo listas de
     * viajes.
     *
     * @return string con todos los atributos de la ciudad
     */
    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", provincia=" + provincia + ", codigoPostal=" + codigoPostal + ", OrigenLista=" + OrigenLista + ", DestinoLista=" + DestinoLista + '}';
    }
}
