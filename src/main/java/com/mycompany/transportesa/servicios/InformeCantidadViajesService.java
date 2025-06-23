/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportesa.servicios;

import com.mycompany.transportesa.entidades.Chofer;
import com.mycompany.transportesa.entidades.Colectivo;
import com.mycompany.transportesa.entidades.Viaje;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Servicio que genera informes relacionados con la cantidad de viajes
 * realizados por cada {@link Chofer}, específicamente aquellos realizados con
 * vehículos del tipo {@link Colectivo}.
 *
 * @author Alegre
 * @author Aquino
 * @author Latour
 */
public class InformeCantidadViajesService {

    /**
     * Calcula cuántos viajes en {@link Colectivo} realizó cada {@link Chofer}
     * de la lista recibida. Solo cuenta viajes en los que el chofer haya sido
     * efectivamente el asignado al viaje.
     *
     * @param choferLista lista de choferes a analizar
     * @return un {@link HashMap} donde la clave es el chofer y el valor es la
     * cantidad de viajes en colectivo realizados
     */
    public HashMap<Chofer, Integer> cantidadViajesChofer(ArrayList<Chofer> choferLista) {

        HashMap<Chofer, Integer> choferesMap = new HashMap<>();
        ArrayList<Long> dniProcesado = new ArrayList<>();

        for (Chofer chofer : choferLista) {
            if (!dniProcesado.contains(chofer.getDni())) {
                int cantidad = 0;
                for (Viaje viaje : chofer.getViajeLista()) {

                    if (viaje.getVehiculo() instanceof Colectivo) {
                        if (viaje.getVehiculo() instanceof Colectivo && viaje.getChofer().getDni() == chofer.getDni()) {
                            cantidad++;
                        }
                    }
                }
                choferesMap.put(chofer, cantidad);
                dniProcesado.add(chofer.getDni());
            }
        }
        return choferesMap;
    }

    /**
     * Muestra por consola un informe con la cantidad de viajes en colectivo
     * realizados por cada {@link Chofer}.
     *
     * @param informe un {@link HashMap} con choferes y sus respectivas
     * cantidades de viajes
     */
    public void mostrarInformeCantidadViajes(HashMap<Chofer, Integer> informe) {
        for (Chofer chofer : informe.keySet()) {
            int cantidad = informe.get(chofer);
            System.out.println("Chofer " + chofer.getNombre() + " " + chofer.getApellido() + " realizó " + cantidad + " viaje en colectivo.");
        }
    }

}
