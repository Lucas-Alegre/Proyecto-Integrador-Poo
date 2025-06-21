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
 *
 * @author
 */
public class VehiculoService {

    private ArrayList<Vehiculo> vehiculoList;

    public VehiculoService() {
        vehiculoList = new ArrayList<>();
    }

    //Registrar un vehiculo
    public void registrarVehiculo(Vehiculo vehiculo) throws VehiculoNoDisponibleExcepcion {
        for (Vehiculo v : vehiculoList) {
            if (v.getPatente().equals(vehiculo.getPatente())) { //equals ignore case
                throw new VehiculoNoDisponibleExcepcion("Ya existe un vehículo registrado con la patente: " + vehiculo.getPatente());
            }
        }
        vehiculoList.add(vehiculo);
        System.out.println("El vehiculo se registro con exitoso");
    }

    //Imprimir la lista de vehiculos
    public void mostrarVehiculos() {
        System.out.println("Lista de vehículos:");
        for (Vehiculo v : vehiculoList) {
            System.out.println(v);
        }
    }

    public void mostrarVehiculosColectivos() {
        System.out.println("Lista de Colectivos:");
        for (Vehiculo v : vehiculoList) {
            if (v instanceof Colectivo) {
                System.out.println(((Colectivo) v).getColectivoToUser());
            }
        }
    }

    public void mostrarVehiculosMinibus() {
        System.out.println("Lista de Colectivos:");
        for (Vehiculo v : vehiculoList) {
            if (v instanceof Minibus) {
                System.out.println(((Minibus) v).getMinibusToUser());
            }
        }
    }

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
