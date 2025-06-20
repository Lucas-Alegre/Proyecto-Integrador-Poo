package com.mycompany.transportesa.servicios;

import com.mycompany.transportesa.entidades.*;
import com.mycompany.transportesa.excepciones.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author
 */
public class ViajeService {

    private ArrayList<Viaje> listaViajes;

    public ViajeService() {
        listaViajes = new ArrayList<>();
    }

    //2. Planificar un viaje entre dos ciudades
    public Viaje planificarViaje(String fechaDeSalida, String horarioSalida,
            String fechaDeLlegada, String horarioLlegada,
            Ciudad origen, Ciudad destino,
            Chofer chofer, Vehiculo vehiculo)
            throws CiudadesIgualesExcepcion, ChoferOcupadoExcepcion, VehiculoNoDisponibleExcepcion, ICategoriaInvalidaException {

        if (origen.equals(destino)) {
            throw new CiudadesIgualesExcepcion("La ciudad de origen y destino no pueden ser la misma.");
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime nuevaSalida = LocalDateTime.parse(fechaDeSalida + " " + horarioSalida, formatter);
        LocalDateTime nuevaLlegada = LocalDateTime.parse(fechaDeLlegada + " " + horarioLlegada, formatter);

        // Validar chofer
        for (Viaje v : chofer.getViajeLista()) {
            LocalDateTime salida = LocalDateTime.parse(v.getFechaDeSalida() + " " + v.getHorarioSalida(), formatter);
            LocalDateTime llegada = LocalDateTime.parse(v.getFechaDeLlegada() + " " + v.getHorarioLlegada(), formatter);

            boolean seSuperpone = nuevaSalida.isBefore(llegada) && nuevaLlegada.isAfter(salida);
            if (seSuperpone) {
                throw new ChoferOcupadoExcepcion("El chofer ya tiene un viaje que se superpone.");
            }
        }

        CategoriaEnum categoriaNecesaria = null;

        // Determinar qué categoría requiere el vehículo
        if (vehiculo instanceof Colectivo) {
            categoriaNecesaria = CategoriaEnum.COLECTIVO;
        } else if (vehiculo instanceof Minibus) {
            categoriaNecesaria = CategoriaEnum.MICROBUS;
        }

        // Validar si el chofer tiene esa categoría
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

        // Validar vehículo
        for (Viaje v : vehiculo.getViajeLista()) {
            LocalDateTime salida = LocalDateTime.parse(v.getFechaDeSalida() + " " + v.getHorarioSalida(), formatter);
            LocalDateTime llegada = LocalDateTime.parse(v.getFechaDeLlegada() + " " + v.getHorarioLlegada(), formatter);

            if (nuevaSalida.isBefore(llegada) && nuevaLlegada.isAfter(salida)) {
                throw new VehiculoNoDisponibleExcepcion("El vehículo ya tiene un viaje en ese horario.");
            }
        }

        // Crear y asignar el nuevo viaje
        Viaje nuevoviaje = new Viaje(fechaDeSalida, fechaDeLlegada, horarioSalida, horarioLlegada,
                EstadoDeViajeEnum.PROGRAMADO,
                origen, destino, vehiculo, chofer);

        listaViajes.add(nuevoviaje);
        chofer.getViajeLista().add(nuevoviaje);
        vehiculo.getViajeLista().add(nuevoviaje);

        System.out.println("Viaje planificado correctamente: " + nuevoviaje);
        return nuevoviaje;
    }

    //4. Mostrar los viajes programados con informacion detallada
    public void mostrarViajesProgramadosDetallados() {

        for (Viaje viaje : listaViajes) {
            if (viaje.getEstadoDeViaje() == EstadoDeViajeEnum.PROGRAMADO) {
                System.out.println("Fecha: " + viaje.getFechaDeSalida());
                System.out.println("Fecha de llegada: " + viaje.getFechaDeLlegada());
                System.out.println("Horario de salida: " + viaje.getHorarioSalida());
                System.out.println("Desde: " + viaje.getCiudadOrigen().getNombre());
                System.out.println("Hasta: " + viaje.getCiudadDestino().getNombre());
                System.out.println("Chofer: " + viaje.getChofer().getNombre() + " " + viaje.getChofer().getApellido());
                System.out.println("Vehículo: Patente " + viaje.getVehiculo().getPatente());
                System.out.println("Estado: " + viaje.getEstadoDeViaje());
            }
        }
    }

    //5. Informe detallado de viajes que tiene que realizar un colectivo
    public void mostrarViajesPorColectivoDetallado(Colectivo colectivo) {
        System.out.println("Patente: " + colectivo.getPatente());

        boolean tieneViajesPendientes = false;

        for (Viaje viaje : listaViajes) {
            if (viaje.getVehiculo().equals(colectivo)
                    && viaje.getEstadoDeViaje() != EstadoDeViajeEnum.FINALIZADO) {

                tieneViajesPendientes = true;
                System.out.println("Fecha: " + viaje.getFechaDeSalida());
                System.out.println("Horario salida: " + viaje.getHorarioSalida());
                System.out.println("Fecha de llegada: " + viaje.getFechaDeLlegada());
                System.out.println("Ciudad origen: " + viaje.getCiudadOrigen().getNombre());
                System.out.println("Ciudad destino: " + viaje.getCiudadDestino().getNombre());
                System.out.println("Chofer: " + viaje.getChofer().getNombre() + " " + viaje.getChofer().getApellido());
                System.out.println("Estado: " + viaje.getEstadoDeViaje());
            }
        }

        if (!tieneViajesPendientes) {
            System.out.println("No hay viajes para este colectivo.");
        }

    }
}
