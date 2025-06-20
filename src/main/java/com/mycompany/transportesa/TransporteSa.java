package com.mycompany.transportesa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.mycompany.transportesa.entidades.*;
import com.mycompany.transportesa.excepciones.ChoferOcupadoExcepcion;
import com.mycompany.transportesa.excepciones.ChoferSinCategorias;
import com.mycompany.transportesa.excepciones.CiudadesIgualesExcepcion;
import com.mycompany.transportesa.excepciones.VehiculoYaRegistradoExcepcion;
import com.mycompany.transportesa.excepciones.ChoferYaRegistradoExcepcion;
import com.mycompany.transportesa.excepciones.ExcesoDePasajerosException;
import com.mycompany.transportesa.excepciones.NotTipoDeVehiculoDisponibleException;

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
    public static void main(String[] args) throws ExcesoDePasajerosException {

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
        Chofer chofer7 = new Chofer(55555555, "Jorge", "Sánchez", "LIC005", new ArrayList<>(), new ArrayList<>());
        Chofer chofer8 = new Chofer(66666666, "Sofía", "Ramírez", "LIC006", new ArrayList<>(), new ArrayList<>());
        Chofer chofer9 = new Chofer(77777777, "Tomás", "García", "LIC007", new ArrayList<>(), new ArrayList<>());
        Chofer chofer10 = new Chofer(88888888, "Lucía", "Morales", "LIC008", new ArrayList<>(), new ArrayList<>());

        /*try {
            //choferService.registrarChofer(chofer1);
            //choferService.registrarChofer(chofer2);
            choferService.registrarChofer(chofer3);
            choferService.registrarChofer(chofer4);
            choferService.registrarChofer(chofer5);
            choferService.registrarChofer(chofer6);
            choferService.registrarChofer(chofer7);
            choferService.registrarChofer(chofer8);
            choferService.registrarChofer(chofer9);
            choferService.registrarChofer(chofer10);
        } catch (ChoferYaRegistradoExcepcion e) {
            System.out.println("Error al registrar chofer: " + e.getMessage());
        }*/

        // Crear colectivos
        Colectivo col1 = new Colectivo("AAA111", 50, 2020, 150000, new ArrayList<>(), true);
        Colectivo col2 = new Colectivo("BBB222", 55, 2019, 140000, new ArrayList<>(), false);
        Colectivo col3 = new Colectivo("CCC333", 60, 2021, 160000, new ArrayList<>(), true);
        Colectivo col4 = new Colectivo("DDD444", 75, 2022, 170000, new ArrayList<>(), false);
        Colectivo col5 = new Colectivo("EEE555", 40, 2018, 130000, new ArrayList<>(), true);

        // Crear minibuses
        Minibus minibus1 = new Minibus("ABA212", 10, 2010, 450000, new ArrayList<>(), true, true); // si anda mal rompe acàs no sigue abajo y va al swirch
        Minibus minibus2 = new Minibus("XCD242", 15, 2011, 350000, new ArrayList<>(), false, true);
        Minibus minibus3 = new Minibus("LAM864", 20, 2012, 430000, new ArrayList<>(), true, false);
        Minibus minibus4 = new Minibus("PQY936", 25, 2014, 290000, new ArrayList<>(), false, false);
        Minibus minibus5 = new Minibus("PLAE23", 30, 2016, 310000, new ArrayList<>(), true, true);

        /*try {
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
        } catch (VehiculoYaRegistradoExcepcion e) {
            System.out.println("Error al registrar vehículo: " + e.getMessage());
        }*/

        // Crear ciudades (una por provincia)
        Ciudad ciudad1 = new Ciudad("La Plata", ProvinciaEnum.BUENOS_AIRES,"1");
        Ciudad ciudad2 = new Ciudad("Resistencia", ProvinciaEnum.CHACO,"2");
        Ciudad ciudad3 = new Ciudad("Córdoba", ProvinciaEnum.CORDOBA,"3");
        Ciudad ciudad4 = new Ciudad("Rawson", ProvinciaEnum.CHUBUT,"4");
        Ciudad ciudad5 = new Ciudad("Mendoza", ProvinciaEnum.MENDOZA,"5");
        Ciudad ciudad6 = new Ciudad("Posadas", ProvinciaEnum.MISIONES,"6");
        Ciudad ciudad7 = new Ciudad("Salta", ProvinciaEnum.SALTA,"7");
        Ciudad ciudad8 = new Ciudad("Ushuaia", ProvinciaEnum.TIERRA_DEL_FUEGO,"8");
        Ciudad ciudad9 = new Ciudad("Santa Rosa", ProvinciaEnum.LA_PAMPA,"9");
        Ciudad ciudad10 = new Ciudad("Paraná", ProvinciaEnum.ENTRE_RIOS,"10");

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
                            
                            for(Ciudad c : ciudadService.getListadoCiudades()){
                                if(c.getCodigoPostal().equalsIgnoreCase(codigoPostal)){ 
                                    throw new CiudadesIgualesExcepcion("Esta Ciudad ya Existe con este codigo Postal.");
                                }
                                if(c.getNombre().equalsIgnoreCase(nombreCiudad)&&c.getProvincia()==provinciaConvertida){
                                    throw new CiudadesIgualesExcepcion("Esta Ciudad ya Existe en esta provincia");
                                }
                            }
                            
                            Ciudad ciudadToRegistrar = new Ciudad(nombreCiudad,provinciaConvertida, codigoPostal);
                            
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
                                throw new ChoferSinCategorias("Error: El chofer debe tener al menos una categoría para manjerar un Vehiculo (Colectivo o Microbus).");
                            }

                            //Ahora se asignan las categorías al chofer
                            chofer.setCategorias(listaCategorias);

                            //Intentamos registrar
                            choferService.registrarChofer(chofer);

                        } catch (ChoferYaRegistradoExcepcion e) {
                            System.out.println("Chofer ya registrado: " + e.getMessage());

                        } catch (ChoferSinCategorias e) {
                            System.out.println(e.getMessage());
                            //scanner.nextLine(); // limpiar buffer
                        }
                        if (registroExitoso) {
                            System.out.print("¿Desea ingresar otro chofer? (s/n): ");
                            continuar = scanner.nextLine().trim().toLowerCase();
                        } else {
                            System.out.print("No lograste Carcar un Chofer, ¿Deseas intentarlo nuevamente e ingresar otro chofer? (s/n): ");
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

                            System.out.print("Capacidad: ");
                            int capacidad = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Año de Fabricación: ");
                            int anioFabricacion = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Kilometraje: ");
                            double kilometraje = scanner.nextDouble();
                            scanner.nextLine();

                            ArrayList<Viaje> viajes = new ArrayList<>(); // Lista vacía

                            boolean vehiculoConPisoDoble = false;
                            boolean tieneBodega = false;
                            boolean tieneAireAcondicionado = false;
                            
                            System.out.print("¿El Vehiculo es Colectivo? (s/n): ");
                            String colectivo = scanner.nextLine().trim().toLowerCase();
                            
                            if (colectivo.equals("s")) {
                                tipoDeVehiculo = "colectivo";

                                System.out.print("Tiene Piso doble? (s/n): ");
                                String tienePisoDoble = scanner.nextLine().trim().toLowerCase();

                                if (tienePisoDoble.equals("s")) {
                                    vehiculoConPisoDoble = true;
                                }
                            }else{
                               
                                System.out.print("¿El Vehiculo es Minibus? (s/n): ");
                                String minibus = scanner.nextLine().trim().toLowerCase();
                                if (minibus.equals("s")) {
                                    tipoDeVehiculo = "minibus";

                                    System.out.print("Tiene Bodega? (s/n): ");
                                    String tieneUnaBodega = scanner.nextLine().trim().toLowerCase();

                                    if (tieneUnaBodega.equals("s")) {
                                        tieneBodega = true;
                                    }

                                    System.out.print("Tiene Aire Acondicionado? (s/n): ");
                                    String tieneUnAireAcondicionado = scanner.nextLine().trim().toLowerCase();

                                    if (tieneUnAireAcondicionado.equals("s")) {
                                        tieneAireAcondicionado = true;
                                    }
                                }else{
                                    throw new NotTipoDeVehiculoDisponibleException("Error: No tenes un Vehiculo para ser Registrado. Necesitas un (Colectivo o Minibus)");
                                }
                            }

                            

                            //Primero se crea el Vehiculo.
                            if (tipoDeVehiculo.equals("colectivo")) {
                                Vehiculo vehiculoColectivo = new Colectivo(patente, capacidad, anioFabricacion, kilometraje, viajes, vehiculoConPisoDoble);
                                vehiculoService.registrarVehiculo(vehiculoColectivo);
                                VehiculosExitoso = true;
                            } else {
                                Vehiculo vehiculoMinibus = new Minibus(patente, capacidad, anioFabricacion, kilometraje, viajes, tieneBodega, tieneAireAcondicionado);
                                vehiculoService.registrarVehiculo(vehiculoMinibus);
                                VehiculosExitoso = true;
                            }
                        } catch (VehiculoYaRegistradoExcepcion e) {
                            System.out.println("Vehiculo ya registrado: " + e.getMessage());
                        } catch (NotTipoDeVehiculoDisponibleException e) {
                            System.out.println(e.getMessage());
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
                    System.out.println("Planificar viaje...");
                    // planificarViajeConsola(viajeService, choferService, vehiculoService);
                    break;

                case 5:
                    System.out.println("Mostrar viajes programados detalladamente...");
                    viajeService.mostrarViajesProgramadosDetallados();
                    break;

                case 6:
                    System.out.println("Mostrar viajes por colectivo...");
                    // mostrarViajesPorColectivo(viajeService);
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

        Colectivo colectivo1 = new Colectivo("AAA111", 45, 2018, 150000.5, new ArrayList<>(), true);
        Colectivo colectivo2 = new Colectivo("BBB222", 30, 2020, 90000, new ArrayList<>(), false);

        //TEST DE PRUEBA DE IMPLEMENTACION DE QUE NO SUPERPONGAN VIAJES A UN MISMO CHOFER Y UN CHOFER DEBA DESCANSAR AL MENOS 8 HORAS
        System.out.println("----------------------------------------------------------------------");
        System.out.println("        Informe de viajes a realizar de un colectivo determinado");
        System.out.println("----------------------------------------------------------------------");
        viajeService.mostrarViajesPorColectivoDetallado(colectivo1);

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
