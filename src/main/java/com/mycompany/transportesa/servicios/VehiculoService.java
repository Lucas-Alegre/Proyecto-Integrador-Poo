/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportesa.servicios;

import com.mycompany.transportesa.entidades.Colectivo;
import com.mycompany.transportesa.entidades.Minibus;
import com.mycompany.transportesa.entidades.Vehiculo;
import com.mycompany.transportesa.excepciones.VehiculoNoDisponibleExcepcion;
import java.util.ArrayList;

/**
 * Servicio que administra los vehículos del sistema, permitiendo registrar y
 * consultar {@link Vehiculo}s, ya sean {@link Colectivo}s o {@link Minibus}es.
 *
 * @author Alegre
 * @author Aquino
 * @author Latour
 */
public class VehiculoService {

    private ArrayList<Vehiculo> vehiculoList;

    /**
     * Crea una instancia del servicio con una lista vacía de vehículos.
     */
    public VehiculoService() {
        vehiculoList = new ArrayList<>();
    }

    /**
     * Registra un nuevo {@link Vehiculo} si su patente no fue registrada
     * previamente.
     *
     * @param vehiculo el vehículo a registrar
     * @throws VehiculoNoDisponibleExcepcion si ya existe un vehículo con la
     * misma patente
     */
    public void registrarVehiculo(Vehiculo vehiculo) throws VehiculoNoDisponibleExcepcion {
        for (Vehiculo v : vehiculoList) {
            if (v.getPatente().equals(vehiculo.getPatente())) { //equals ignore case
                throw new VehiculoNoDisponibleExcepcion("Ya existe un vehículo registrado con la patente: " + vehiculo.getPatente());
            }
        }
        vehiculoList.add(vehiculo);
        System.out.println("El vehiculo se registro con exitoso");
    }

    /**
     * Muestra por consola todos los {@link Vehiculo}s registrados usando su
     * método {@code toString()}.
     */
    public void mostrarVehiculos() {
        System.out.println("Lista de vehículos:");
        for (Vehiculo v : vehiculoList) {
            System.out.println(v);
        }
    }

    /**
     * Muestra por consola todos los {@link Colectivo}s registrados, utilizando
     * el método {@code getColectivoToUser()} para formato personalizado.
     */
    public void mostrarVehiculosColectivos() {
        System.out.println("Lista de Colectivos:");
        for (Vehiculo v : vehiculoList) {
            if (v instanceof Colectivo) {
                System.out.println(((Colectivo) v).getColectivoToUser());
            }
        }
    }

    /**
     * Muestra por consola todos los {@link Minibus}es registrados, utilizando
     * el método {@code getMinibusToUser()} para formato personalizado.
     */
    public void mostrarVehiculosMinibus() {
        System.out.println("Lista de Colectivos:");
        for (Vehiculo v : vehiculoList) {
            if (v instanceof Minibus) {
                System.out.println(((Minibus) v).getMinibusToUser());
            }
        }
    }

    /**
     * Busca un {@link Vehiculo} por su número de patente (ignora
     * mayúsculas/minúsculas).
     *
     * @param patente la patente del vehículo a buscar
     * @return el vehículo encontrado, o {@code null} si no existe
     */
    public Vehiculo vehiculoPorPatente(String patente) {
        Vehiculo vehiculoEncontrado = null;
        for (Vehiculo v : vehiculoList) {
            if (v.getPatente().equalsIgnoreCase(patente)) {
                vehiculoEncontrado = v;
            }
        }
        return vehiculoEncontrado;
    }
}
