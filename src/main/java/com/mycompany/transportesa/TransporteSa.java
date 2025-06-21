package com.mycompany.transportesa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.mycompany.transportesa.entidades.*;
import com.mycompany.transportesa.excepciones.ChoferNoDispinibleExcepcion;
import com.mycompany.transportesa.excepciones.CiudadesIgualesExcepcion;
import com.mycompany.transportesa.excepciones.ICategoriaInvalidaException;
import com.mycompany.transportesa.excepciones.VehiculoNoDisponibleExcepcion;

import com.mycompany.transportesa.servicios.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 **
 * @author
 */
public class TransporteSa {

    //commit prueba caro
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Crear servicios

        ChoferService choferService = new ChoferService();
        VehiculoService vehiculoService = new VehiculoService();
        ViajeService viajeService = new ViajeService();
        InformeCantidadViajesService informe = new InformeCantidadViajesService();
        CiudadService ciudadService = new CiudadService();

        // Crear choferes
        Chofer chofer1 = new Chofer(12345678, "Carlos", "Pérez", "ABC123", new ArrayList<>(), new ArrayList<>());
        Chofer chofer2 = new Chofer(87654321, "María", "Gómez", "XYZ789", new ArrayList<>(), new ArrayList<>());
        Chofer chofer3 = new Chofer(11111111, "Luis", "Martínez", "LIC001", new ArrayList<>(), new ArrayList<>());
        Chofer chofer4 = new Chofer(22222222, "Ana", "López", "LIC002", new ArrayList<>(), new ArrayList<>());
        Chofer chofer5 = new Chofer(33333333, "Diego", "Ruiz", "LIC003", new ArrayList<>(), new ArrayList<>());
        Chofer chofer6 = new Chofer(44444444, "Laura", "Fernández", "LIC004", new ArrayList<>(), new ArrayList<>());
        Chofer chofer7 = new Chofer(34834834, "Jorge", "Sánchez", "LIC005", new ArrayList<>(), new ArrayList<>());
        Chofer chofer8 = new Chofer(66666666, "Sofía", "Ramírez", "LIC006", new ArrayList<>(), new ArrayList<>());
        Chofer chofer9 = new Chofer(77777777, "Tomás", "García", "LIC007", new ArrayList<>(), new ArrayList<>());
        Chofer chofer10 = new Chofer(88888888, "Lucía", "Morales", "LIC008", new ArrayList<>(), new ArrayList<>());

        try {
            choferService.registrarChofer(chofer1);
            choferService.registrarChofer(chofer2);
            choferService.registrarChofer(chofer3);
            choferService.registrarChofer(chofer4);
            choferService.registrarChofer(chofer5);
            choferService.registrarChofer(chofer6);
            choferService.registrarChofer(chofer7);
            choferService.registrarChofer(chofer8);
            choferService.registrarChofer(chofer9);
            choferService.registrarChofer(chofer10);
        } catch (ChoferNoDispinibleExcepcion e) {
            System.out.println("Error al registrar chofer: " + e.getMessage());
        }
        // Crear colectivos
        Colectivo col1 = new Colectivo("AAA111", 60, new ArrayList<>(), true);
        Colectivo col2 = new Colectivo("BBB222", 20, new ArrayList<>(), false);
        Colectivo col3 = new Colectivo("CCC333", 30, new ArrayList<>(), true);
        Colectivo col4 = new Colectivo("DDD444", 15, new ArrayList<>(), false);
        Colectivo col5 = new Colectivo("EEE555", 50, new ArrayList<>(), true);

        // Crear minibuses
        Minibus minibus1 = new Minibus("ABA212", 10, new ArrayList<>(), true, true); // si anda mal rompe acàs no sigue abajo y va al swirch
        Minibus minibus2 = new Minibus("XCD242", 20, new ArrayList<>(), false, true);
        Minibus minibus3 = new Minibus("LAM864", 20, new ArrayList<>(), true, false);
        Minibus minibus4 = new Minibus("PQY936", 10, new ArrayList<>(), false, false);
        Minibus minibus5 = new Minibus("PLAE23", 15, new ArrayList<>(), true, true);

        try {
            vehiculoService.registrarVehiculo(col1);
            vehiculoService.registrarVehiculo(col2);
            vehiculoService.registrarVehiculo(col3);
            vehiculoService.registrarVehiculo(col4);
            vehiculoService.registrarVehiculo(col5);

            vehiculoService.registrarVehiculo(minibus1);
            vehiculoService.registrarVehiculo(minibus2);
            vehiculoService.registrarVehiculo(minibus3);
            vehiculoService.registrarVehiculo(minibus4);
            vehiculoService.registrarVehiculo(minibus5);
        } catch (VehiculoNoDisponibleExcepcion e) {
            System.out.println("Error al registrar vehículo: " + e.getMessage());
        }
        // Crear ciudades (una por provincia)
        Ciudad ciudad1 = new Ciudad("La Plata", ProvinciaEnum.BUENOS_AIRES, "1");
        Ciudad ciudad2 = new Ciudad("Resistencia", ProvinciaEnum.CHACO, "2");
        Ciudad ciudad3 = new Ciudad("Córdoba", ProvinciaEnum.CORDOBA, "3");
        Ciudad ciudad4 = new Ciudad("Rawson", ProvinciaEnum.CHUBUT, "4");
        Ciudad ciudad5 = new Ciudad("Mendoza", ProvinciaEnum.MENDOZA, "5");
        Ciudad ciudad6 = new Ciudad("Posadas", ProvinciaEnum.MISIONES, "6");
        Ciudad ciudad7 = new Ciudad("Salta", ProvinciaEnum.SALTA, "7");
        Ciudad ciudad8 = new Ciudad("Ushuaia", ProvinciaEnum.TIERRA_DEL_FUEGO, "8");
        Ciudad ciudad9 = new Ciudad("concordia", ProvinciaEnum.ENTRE_RIOS, "3200");
        Ciudad ciudad10 = new Ciudad("Parana", ProvinciaEnum.ENTRE_RIOS, "4200");
        
       ciudadService.addCiudad(ciudad1);
       ciudadService.addCiudad(ciudad2);
       ciudadService.addCiudad(ciudad3);
       ciudadService.addCiudad(ciudad4);
       ciudadService.addCiudad(ciudad5);
       ciudadService.addCiudad(ciudad9);
       ciudadService.addCiudad(ciudad10);
       

        // Menú interactivo
        int opcion;
        do {
            System.out.println("-------------------------------------------------------------------");
            System.out.println("------------------BIENVENIDO A TRANSPORTE S.A--------------------");
            System.out.println("-------------------------------MENU------------------------------");
            System.out.println("-------------------------------------------------------------------");
            System.out.println("                 " + "1. Cargar ciudad ");
            System.out.println("                 " + "2. Cargar choferes ");
            System.out.println("                 " + "3. Cargar vehiculos ");
            System.out.println("                 " + "4. Planificar viaje");
            System.out.println("                 " + "5. Mostrar viajes programados detalladamente");
            System.out.println("                 " + "6. Mostrar viajes por colectivo");
            System.out.println("                 " + "7. Informe de cantidad de viajes por chofer");
            System.out.println("                 " + "0. Salir");
            System.out.println("-------------------------------------------------------------------");
            System.out.print("Ingrese opción: ");

            //scanner.nextLine();
            while (!scanner.hasNextInt()) {
                System.out.print("Por favor ingrese un número válido: ");
                scanner.next();
            }

            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Registrar Ciudad manualmente");
                    boolean CiudadExitoso = false; // Ver si toda esta logica se la puede sacar hacia una funcion, y tener un Min mas ordenado
                    String continuarRegistrRegistroCiudad;
                    do {
                        try {
                            System.out.print("Nombre: ");
                            String nombreCiudad = scanner.nextLine();

                            System.out.print("Provincia: ");
                            String provincia = scanner.nextLine();

                            System.out.print("Codigo Postal: ");
                            String codigoPostal = scanner.nextLine();

                            //logica para validad la provincia a un enum
                            String nombreProvinciaEnum = provincia.toUpperCase().replace(" ", "_");
                            ProvinciaEnum provinciaConvertida = ProvinciaEnum.valueOf(nombreProvinciaEnum);

                            for (Ciudad c : ciudadService.getListadoCiudades()) {
                                if (c.getCodigoPostal().equalsIgnoreCase(codigoPostal)) {
                                    throw new CiudadesIgualesExcepcion("Esta Ciudad ya Existe con este codigo Postal.");
                                }
                                if (c.getNombre().equalsIgnoreCase(nombreCiudad) && c.getProvincia() == provinciaConvertida) {
                                    throw new CiudadesIgualesExcepcion("Esta Ciudad ya Existe en esta provincia");
                                }
                            }

                            Ciudad ciudadToRegistrar = new Ciudad(nombreCiudad, provinciaConvertida, codigoPostal);

                            ciudadService.addCiudad(ciudadToRegistrar);;
                            CiudadExitoso = true;

                        } catch (CiudadesIgualesExcepcion e) {
                            System.out.println("Error: " + e.getMessage());
                        }

                        if (CiudadExitoso) {
                            System.out.print("¿Desea ingresar otra Ciudad? (s/n): ");
                            continuarRegistrRegistroCiudad = scanner.nextLine().trim().toLowerCase();
                        } else {
                            System.out.print("No lograste Registrar una Ciudad, ¿Deseas intentarlo nuevamente e ingresar otra Ciudad? (s/n): ");
                            continuarRegistrRegistroCiudad = scanner.nextLine().trim().toLowerCase();
                        }

                    } while (continuarRegistrRegistroCiudad.equals("s"));

                    break;
                case 2:
                    System.out.println("Registrar chofer manualmente");
                    boolean registroExitoso = false; // Ver si toda esta logica se la puede sacar hacia una funcion, y tener un Min mas ordenado
                    String continuar;
                    do {
                        try {
                            System.out.print("DNI: ");
                            long dni = scanner.nextLong();
                            scanner.nextLine();

                            System.out.print("Nombre: ");
                            String nombre = scanner.nextLine();

                            System.out.print("Apellido: ");
                            String apellido = scanner.nextLine();

                            System.out.print("Número de licencia: ");
                            String nroLicencia = scanner.nextLine();

                            List<Viaje> viajes = new ArrayList<>(); // Lista vacía

                            //Primero se crea el Chofer SIN las categorías aún
                            Chofer chofer = new Chofer(dni, nombre, apellido, nroLicencia, new ArrayList<>(), viajes);

                            List<ChoferCategoria> listaCategorias = new ArrayList<>();

                            //Preguntar si tiene categoría MICROBUS
                            System.out.print("¿Tiene licencia para MICROBUS? (s/n): ");
                            String microbus = scanner.nextLine().trim().toLowerCase();
                            if (microbus.equals("s")) {
                                Categoria categoriaMicrobus = new Categoria(CategoriaEnum.MICROBUS, new ArrayList<>());
                                System.out.print("Ingrese fecha de vencimiento de la licencia MICROBUS (dd-MM-yyyy): ");
                                String fechaVto = scanner.nextLine();
                                ChoferCategoria choferCategoria = new ChoferCategoria(fechaVto, chofer, categoriaMicrobus);
                                listaCategorias.add(choferCategoria);
                                registroExitoso = true;
                            }

                            //Preguntar si tiene categoría COLECTIVO
                            System.out.print("¿Tiene licencia para COLECTIVO? (s/n): ");
                            String colectivo = scanner.nextLine().trim().toLowerCase();
                            if (colectivo.equals("s")) {
                                Categoria categoriaColectivo = new Categoria(CategoriaEnum.COLECTIVO, new ArrayList<>());
                                System.out.print("Ingrese fecha de vencimiento de la licencia COLECTIVO (dd-MM-yyyy): ");
                                String fechaVto = scanner.nextLine();
                                ChoferCategoria choferCategoria = new ChoferCategoria(fechaVto, chofer, categoriaColectivo);
                                listaCategorias.add(choferCategoria);
                                registroExitoso = true;
                            }

                            //Validación: debe tener al menos una categoría // agregar una nueva excepcion
                            if (listaCategorias.isEmpty()) {
                                throw new ChoferNoDispinibleExcepcion("Error: El chofer debe tener al menos una categoría para manjerar un Vehiculo (Colectivo o Microbus).");
                            }

                            //Ahora se asignan las categorías al chofer
                            chofer.setCategorias(listaCategorias);

                            //Intentamos registrar
                            choferService.registrarChofer(chofer);

                        } catch (ChoferNoDispinibleExcepcion e) {
                            System.out.println("Chofer ya registrado: " + e.getMessage());

                        }
                        if (registroExitoso) {
                            System.out.print("¿Desea ingresar otro chofer? (s/n): ");
                            continuar = scanner.nextLine().trim().toLowerCase();
                        } else {
                            System.out.print("No lograste Cargar el Chofer, ¿Deseas intentarlo nuevamente e ingresar otro chofer? (s/n): ");
                            continuar = scanner.nextLine().trim().toLowerCase();

                        }

                    } while (continuar.equals("s"));

                    break;
                case 3:
                    System.out.println("Registrar Vehiculos manualmente");
                    boolean VehiculosExitoso = false; // Ver si toda esta logica se la puede sacar hacia una funcion, y tener un Min mas ordenado
                    String continuarRegistrRegistroVehiculo;
                    String tipoDeVehiculo = "";
                    do {
                        try {
                            System.out.print("Patente: ");
                            String patente = scanner.nextLine();

                            System.out.print("Capacidad del Vehiculo: ");
                            int capacidad = scanner.nextInt();
                            scanner.nextLine();

                            ArrayList<Viaje> viajes = new ArrayList<>(); // Lista vacía

                            boolean vehiculoConPisoDoble = false;
                            boolean tieneBodega = false;
                            boolean tieneAireAcondicionado = false;

                            System.out.print("Seleccione 1 si es Colectivo o 2 si es Minibus: ");
                            Integer tipo = scanner.nextInt();
                            scanner.nextLine(); // Limpia el salto de línea pendiente

                            if (tipo == 1) {
                                tipoDeVehiculo = "colectivo";

                                System.out.print("¿Tiene Piso doble? (s/n): ");
                                String tienePisoDoble = scanner.nextLine().trim().toLowerCase();

                                if (tienePisoDoble.equals("s")) {
                                    vehiculoConPisoDoble = true;
                                }

                            } else if (tipo == 2) {
                                tipoDeVehiculo = "minibus";

                                System.out.print("¿Tiene Bodega? (s/n): ");
                                String tieneUnaBodega = scanner.nextLine().trim().toLowerCase();
                                if (tieneUnaBodega.equals("s")) {
                                    tieneBodega = true;
                                }

                                System.out.print("¿Tiene Aire Acondicionado? (s/n): ");
                                String tieneUnAireAcondicionado = scanner.nextLine().trim().toLowerCase();
                                if (tieneUnAireAcondicionado.equals("s")) {
                                    tieneAireAcondicionado = true;
                                }

                            } else {
                                throw new VehiculoNoDisponibleExcepcion("Error: No hay un tipo de vehículo válido. Debe ser Colectivo o Minibus.");
                            }

                            //Primero se crea el Vehiculo.
                            if (tipoDeVehiculo.equals("colectivo")) {
                                Vehiculo vehiculoColectivo = new Colectivo(patente, capacidad, viajes, vehiculoConPisoDoble);
                                vehiculoService.registrarVehiculo(vehiculoColectivo);
                                VehiculosExitoso = true;
                            } else {
                                Vehiculo vehiculoMinibus = new Minibus(patente, capacidad, viajes, tieneBodega, tieneAireAcondicionado);
                                vehiculoService.registrarVehiculo(vehiculoMinibus);
                                VehiculosExitoso = true;
                            }
                        } catch (VehiculoNoDisponibleExcepcion e) {
                            System.out.println("Vehiculo ya registrado: " + e.getMessage());
                        }

                        if (VehiculosExitoso) {
                            System.out.print("¿Desea ingresar otro Vehiculo? (s/n): ");
                            continuarRegistrRegistroVehiculo = scanner.nextLine().trim().toLowerCase();
                        } else {
                            System.out.print("No lograste Carcar un Chofer, ¿Deseas intentarlo nuevamente e ingresar otro vehiculo? (s/n): ");
                            continuarRegistrRegistroVehiculo = scanner.nextLine().trim().toLowerCase();
                        }

                    } while (continuarRegistrRegistroVehiculo.equals("s"));

                    break;

                case 4:
                    System.out.println("Planificar viaje Manualmente...");
                    boolean viajeExitoso = false;
                    String continuarRegistrarViaje;
                    do {
                        try {
                            System.out.print("Fecha de Salida del viaje: ");
                            String fechaDeSalida = scanner.nextLine();
                            System.out.print("Fecha de Llegada del viaje: ");
                            String fechaDeLlegada = scanner.nextLine();
                            System.out.print("Horario de salida: ");
                            String horarioDeSalida = scanner.nextLine();
                            System.out.print("Horario de llegada: ");
                            String horarioDeLlegada = scanner.nextLine();

                            ciudadService.getCiudadesToViaje();
                            System.out.print("Codigo postal de la Ciudad-Origen: ");
                            String ciudadOrigen = scanner.nextLine();
                            System.out.print("Codigo postal de la Ciudad-Destino: ");
                            String ciudadDestino = scanner.nextLine();

                            choferService.mostrarChoferesToViaje();
                            System.out.print("Dni del chofer para asignarlo al viaje");
                            Long dniChofer = scanner.nextLong();
                            scanner.nextLine();

                            System.out.print("Queres Asignar un Vehiculo de tipo (colectivo | minibus ?");
                            String vehiculoSeleccionado = scanner.nextLine().trim().toLowerCase();
                            String patenteDeVehiculo = "";
                            if (vehiculoSeleccionado.equalsIgnoreCase("colectivo")) {
                                vehiculoService.mostrarVehiculosColectivos();
                                System.out.print("Patente del colectivo para asignarlo al viaje: ");
                                patenteDeVehiculo = scanner.nextLine();

                            } else if (vehiculoSeleccionado.equalsIgnoreCase("minibus")) {
                                vehiculoService.mostrarVehiculosMinibus();
                                System.out.print("Patente del Minibus para asignarlo al viaje: ");
                                patenteDeVehiculo = scanner.nextLine();
                            }

                            Ciudad ciudadDeOrigen = ciudadService.getCiudadSegunPostal(ciudadOrigen);
                            Ciudad ciudadDeDestino = ciudadService.getCiudadSegunPostal(ciudadDestino);

                            Chofer chofer = choferService.choferPorDni(dniChofer);

                            Vehiculo vehiculoToViaje = vehiculoService.vehiculoPorPatente(patenteDeVehiculo);

                            viajeService.planificarViaje(fechaDeSalida, horarioDeSalida, fechaDeLlegada, horarioDeLlegada, ciudadDeOrigen, ciudadDeDestino, chofer, vehiculoToViaje);

                            viajeExitoso = true;

                        } catch (CiudadesIgualesExcepcion e) {
                            System.out.println("Error: " + e.getMessage());
                        } catch (VehiculoNoDisponibleExcepcion e) {
                            System.out.println("Error: " + e.getMessage());
                        } catch (ICategoriaInvalidaException e) {
                            System.out.println("Error: " + e.getMessage());
                        }

                        if (viajeExitoso) {
                            System.out.print("¿Desea Crear otro Viaje? (s/n): ");
                            continuarRegistrarViaje = scanner.nextLine().trim().toLowerCase();
                        } else {
                            System.out.print("No lograste Registrar una Viaje, ¿Deseas intentarlo nuevamente e ingresar otro Viaje? (s/n): ");
                            continuarRegistrarViaje = scanner.nextLine().trim().toLowerCase();
                        }

                    } while (continuarRegistrarViaje.equals("s"));

                    break;

                case 5:
                    System.out.println("Mostrar viajes programados detalladamente...");
                    viajeService.mostrarViajesProgramadosDetallados();
                    break;

                case 6:
                    boolean vehiculoToConsultaExitoso = false;
                    String continuarConsultaViaje = "";

                    System.out.println("Listado de colectivo...");
                    do {

                        vehiculoService.mostrarVehiculosColectivos();
                        System.out.print("Ingresa una patente para consultar un viaje detallado: ");
                        String patenteVehiculoDetallado = scanner.nextLine();

                        Vehiculo vehiculoParaConsultar = vehiculoService.vehiculoPorPatente(patenteVehiculoDetallado);

                        if (vehiculoParaConsultar != null) {
                            vehiculoToConsultaExitoso = true;
                        } else {
                            System.out.println("Vehiculo No encontrado");
                        }

                        if (vehiculoParaConsultar instanceof Colectivo) {
                            Colectivo colectivo = (Colectivo) vehiculoParaConsultar;
                            viajeService.mostrarViajesPorColectivoDetallado(colectivo);
                        } else {
                            System.out.println("La patente ingresada no corresponde a un colectivo.");
                        }
                        if (vehiculoToConsultaExitoso) {
                            System.out.print("¿Desea Consultar otro Colectivo? (s/n): ");
                            continuarConsultaViaje = scanner.nextLine().trim().toLowerCase();
                        } else {
                            System.out.print("No lograste consultar los Viajes de vehiculo, ¿Deseas intentarlo nuevamente e ingresar otra consulta? (s/n): ");
                            continuarConsultaViaje = scanner.nextLine().trim().toLowerCase();
                        }
                    } while (continuarConsultaViaje.equals("s"));
                    break;

                case 7:
                    System.out.println("Informe de cantidad de viajes por chofer...");
                    HashMap<Chofer, Integer> cantidad = informe.cantidadViajesChofer(choferService.listaChoferes());
                    informe.mostrarInformeCantidadViajes(cantidad);
                    break;

                case 0:
                    System.out.println("¡Hasta luego! Gracias por usar Transporte S.A.");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }

        } while (opcion != 0);

        scanner.close();

        scanner.close();

        //TEST DE PRUEBA DE IMPLEMENTACION DE QUE NO SUPERPONGAN VIAJES A UN MISMO CHOFER Y UN CHOFER DEBA DESCANSAR AL MENOS 8 HORAS
        System.out.println("----------------------------------------------------------------------");
        System.out.println("        Informe de viajes a realizar de un colectivo determinado");
        System.out.println("----------------------------------------------------------------------");
        viajeService.mostrarViajesPorColectivoDetallado(col1);

        //TEST DE PRUEBA CHOFERES AGREGADOS CORRECTAMENTE
        System.out.println("----------------------------------------------------------------------");
        System.out.println("        LISTADO de CHOFERES AGREGADOS CORRECTAMENTE");
        System.out.println("----------------------------------------------------------------------");
        choferService.mostrarChoferes();

        //TEST DE PRUEBA Vehiculos AGREGADOS CORRECTAMENTE
        System.out.println("----------------------------------------------------------------------");
        System.out.println("        LISTADO DE VEHICULOS AGREGADOS CORRECTAMENTE");
        System.out.println("----------------------------------------------------------------------");
        vehiculoService.mostrarVehiculos();

        //TEST DE PRUEBA CIUDADES AGREGADAS CORRECTAMENTE
        System.out.println("----------------------------------------------------------------------");
        System.out.println("        LISTADO DE CIUDADES AGREGADOS CORRECTAMENTE");
        System.out.println("----------------------------------------------------------------------");
        ciudadService.mostraCiudades();

    }
}