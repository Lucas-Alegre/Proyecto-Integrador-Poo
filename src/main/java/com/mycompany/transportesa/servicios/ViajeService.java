package com.mycompany.transportesa.servicios;

import com.mycompany.transportesa.entidades.*;
import com.mycompany.transportesa.excepciones.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.List;

/**
 * Servicio que gestiona la planificación y consulta de {@link Viaje}s entre
 * {@link Ciudad}es. Valida la disponibilidad de {@link Chofer}es y
 * {@link Vehiculo}s antes de registrar un nuevo viaje.
 *
 * @author Alegre
 * @author Aquino
 * @author Latour
 */
public class ViajeService {

    private ArrayList<Viaje> listaViajes;

    /**
     * Inicializa el servicio con una lista vacía de viajes.
     */
    public ViajeService() {
        listaViajes = new ArrayList<>();
    }

    /**
     * Planifica un nuevo {@link Viaje} entre dos {@link Ciudad}es con
     * validaciones de chofer y vehículo.
     *
     * @param fechaDeSalida fecha en formato dd-MM-yyyy
     * @param horarioSalida hora de salida en formato HH:mm
     * @param fechaDeLlegada fecha de llegada en formato dd-MM-yyyy
     * @param horarioLlegada hora de llegada en formato HH:mm
     * @param origen ciudad de origen del viaje
     * @param destino ciudad de destino del viaje
     * @param chofer chofer asignado
     * @param vehiculo vehículo asignado
     * @return el viaje creado
     * @throws CiudadesIgualesExcepcion si la ciudad de origen y destino son
     * iguales
     * @throws VehiculoNoDisponibleExcepcion si el vehículo o chofer no están
     * disponibles en ese horario
     * @throws ICategoriaInvalidaException si el chofer no posee la categoría
     * requerida para el vehículo
     */
    public Viaje planificarViaje(String fechaDeSalida, String horarioSalida,
            String fechaDeLlegada, String horarioLlegada,
            Ciudad origen, Ciudad destino,
            Chofer chofer, Vehiculo vehiculo)
            throws CiudadesIgualesExcepcion, VehiculoNoDisponibleExcepcion, ICategoriaInvalidaException {

        if (origen.equals(destino)) {
            throw new CiudadesIgualesExcepcion("La ciudad de origen y destino no pueden ser la misma.");
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime nuevaSalida = LocalDateTime.parse(fechaDeSalida + " " + horarioSalida, formatter);
        LocalDateTime nuevaLlegada = LocalDateTime.parse(fechaDeLlegada + " " + horarioLlegada, formatter);

        // Validar disponibilidad del chofer
        for (Viaje v : chofer.getViajeLista()) {
            LocalDateTime salida = LocalDateTime.parse(v.getFechaDeSalida() + " " + v.getHorarioSalida(), formatter);
            LocalDateTime llegada = LocalDateTime.parse(v.getFechaDeLlegada() + " " + v.getHorarioLlegada(), formatter);

            boolean seSuperpone = nuevaSalida.isBefore(llegada) && nuevaLlegada.isAfter(salida);
            if (seSuperpone) {
                throw new VehiculoNoDisponibleExcepcion("El chofer ya tiene un viaje que se superpone.");
            }
        }

        CategoriaEnum categoriaNecesaria = null;

        // Validar categoría requerida
        if (vehiculo instanceof Colectivo) {
            categoriaNecesaria = CategoriaEnum.COLECTIVO;
        } else if (vehiculo instanceof Minibus) {
            categoriaNecesaria = CategoriaEnum.MICROBUS;
        }

        boolean tieneCategoria = false;
        for (ChoferCategoria cc : chofer.getCategorias()) {
            if (cc.getCategoria().getCategoria().equals(categoriaNecesaria)) {
                tieneCategoria = true;
                break;
            }
        }

        if (!tieneCategoria) {
            throw new ICategoriaInvalidaException("El chofer no tiene la categoría requerida para este vehículo.");
        }

        // Validar disponibilidad del vehículo
        for (Viaje v : vehiculo.getViajeLista()) {
            LocalDateTime salida = LocalDateTime.parse(v.getFechaDeSalida() + " " + v.getHorarioSalida(), formatter);
            LocalDateTime llegada = LocalDateTime.parse(v.getFechaDeLlegada() + " " + v.getHorarioLlegada(), formatter);

            if (nuevaSalida.isBefore(llegada) && nuevaLlegada.isAfter(salida)) {
                throw new VehiculoNoDisponibleExcepcion("El vehículo ya tiene un viaje en ese horario.");
            }
        }

        // Crear y asignar el nuevo viaje
        Viaje nuevoviaje = new Viaje(fechaDeSalida, fechaDeLlegada, horarioSalida, horarioLlegada,
                origen, destino, vehiculo, chofer);

        listaViajes.add(nuevoviaje);
        chofer.getViajeLista().add(nuevoviaje);
        vehiculo.getViajeLista().add(nuevoviaje);

        System.out.println("Viaje planificado correctamente: " + nuevoviaje);
        return nuevoviaje;
    }

    /**
     * Muestra todos los {@link Viaje}s programados con información detallada
     * por consola.
     */
    public void mostrarViajesProgramadosDetallados() {

        for (Viaje viaje : listaViajes) {

            System.out.println("Fecha de Salida: " + viaje.getFechaDeSalida());
            System.out.println("Fecha de llegada: " + viaje.getFechaDeLlegada());
            System.out.println("Horario de salida: " + viaje.getHorarioSalida());
            System.out.println("Horario de Llegada: " + viaje.getHorarioLlegada());
            System.out.println("Desde: " + viaje.getCiudadOrigen().getNombre());
            System.out.println("Hasta: " + viaje.getCiudadDestino().getNombre());
            System.out.println("Chofer: " + viaje.getChofer().getNombre() + " " + viaje.getChofer().getApellido());
            System.out.println("Vehículo: Patente " + viaje.getVehiculo().getPatente());

        }
    }

    /**
     * Muestra por consola un informe detallado de los {@link Viaje}s asignados
     * a un {@link Colectivo} específico.
     *
     * @param colectivo el colectivo cuyos viajes se desean consultar
     */
    public void mostrarViajesPorColectivoDetallado(Colectivo colectivo) {
        System.out.println("Patente: " + colectivo.getPatente());

        boolean tieneViajesPendientes = false;

        for (Viaje viaje : listaViajes) {
            if (viaje.getVehiculo().equals(colectivo)) {

                tieneViajesPendientes = true;
                System.out.println("Fecha de Salida: " + viaje.getFechaDeSalida());
                System.out.println("Horario salida: " + viaje.getHorarioSalida());
                System.out.println("Fecha de llegada: " + viaje.getFechaDeLlegada());
                System.out.println("Horario de Llegada: " + viaje.getHorarioLlegada());
                System.out.println("Ciudad origen: " + viaje.getCiudadOrigen().getNombre());
                System.out.println("Ciudad destino: " + viaje.getCiudadDestino().getNombre());
                System.out.println("Chofer: " + viaje.getChofer().getNombre() + " " + viaje.getChofer().getApellido());
            }
        }

        if (!tieneViajesPendientes) {
            System.out.println("No hay viajes para este colectivo.");
        }

    }
}
