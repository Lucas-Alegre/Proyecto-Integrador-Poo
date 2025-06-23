/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportesa.servicios;

import com.mycompany.transportesa.entidades.Chofer;
import com.mycompany.transportesa.excepciones.ChoferNoDispinibleExcepcion;
import java.util.ArrayList;

/**
 * Servicio encargado de gestionar la lógica relacionada con los
 * {@link Chofer}es. Permite registrar, buscar y mostrar choferes.
 *
 * @author Alegre,Aquino y Latour
 */
public class ChoferService {

    private ArrayList<Chofer> choferList;

    /**
     * Crea una nueva instancia del servicio y inicializa la lista de choferes.
     */
    public ChoferService() {
        choferList = new ArrayList<>();
    }

    /**
     * Registra un nuevo {@link Chofer} en el sistema si no está previamente
     * registrado.
     *
     * @param chofer el chofer a registrar
     * @throws ChoferNoDispinibleExcepcion si el chofer ya está registrado (por
     * DNI)
     */
    public void registrarChofer(Chofer chofer) throws ChoferNoDispinibleExcepcion {
        for (Chofer c : choferList) {
            if (c.getDni() == chofer.getDni()) {
                throw new ChoferNoDispinibleExcepcion("Este chofer con Dni=" + chofer.getDni() + " ya ha sido registrado previamente");
            }
        }
        choferList.add(chofer);
        System.out.println("El chofer se ha registro con exitoso");
    }

    /**
     * Devuelve la lista de choferes registrados.
     *
     * @return una lista de objetos {@link Chofer}
     */
    public ArrayList<Chofer> listaChoferes() {
        return choferList;
    }

    /**
     * Muestra por consola todos los {@link Chofer}es registrados usando su
     * método {@code toString()}.
     */
    public void mostrarChoferes() {
        System.out.println("Lista de choferes:");
        for (Chofer c : choferList) {
            System.out.println(c);
        }
    }

    /**
     * Muestra por consola los {@link Chofer}es con un formato resumido para los
     * viajes, usando el método {@code getChoferToUser()}.
     */
    public void mostrarChoferesToViaje() {
        System.out.println("Lista de choferes:");
        for (Chofer c : choferList) {
            System.out.println(c.getChoferToUser());
        }
    }

    /**
     * Busca un {@link Chofer} por su número de DNI.
     *
     * @param dni el número de DNI del chofer a buscar
     * @return el chofer encontrado o {@code null} si no existe
     */
    public Chofer choferPorDni(Long dni) {
        Chofer choferEncontrado = null;
        for (Chofer c : choferList) {
            if (c.getDni() == dni) {
                choferEncontrado = c;
            }
        }
        return choferEncontrado;
    }

}
