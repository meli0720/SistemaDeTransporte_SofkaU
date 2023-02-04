package com.exercise.TerminalTransportes.SistemaTerminalTransporte;

import com.exercise.TerminalTransportes.SistemaTerminalTransporte.models.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.stream.IntStream;

@SpringBootApplication
public class SistemaTerminalTransporteApplication {

    public static void main(String[] args) {
        SpringApplication.run(SistemaTerminalTransporteApplication.class, args);
        SistemaTerminalTransporteApplication app = new SistemaTerminalTransporteApplication();
        app.Menu();
    }

    public void Menu() {

        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Destino> destinos = new ArrayList<>();

        ArrayList<Registro_Viajes> registros = new ArrayList<>();

        buses.add(new Bus("1", "Mercedes", 50));
        buses.add(new Bus("2", "Rapido Ochoa", 40));
        buses.add(new Bus("3", "Express", 30));

        destinos.add(new Destino("Medellin-Antioquia"));
        destinos.add(new Destino("Bogota-Cundinamarca"));
        destinos.add(new Destino("Cali-Valle del Cauca"));

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        String destinoElegido = "";
        Horario horarioElegido = null;

        do {
            System.out.println("--- Menu ---");
            System.out.println("1.Registrar un Destino");
            System.out.println("2.Registrar un Bus ");
            System.out.println("3. Comprar viaje");
            System.out.println("4. Ver registro de viajes");
            System.out.println("5. Registrar un pasajero en el Sistema");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();


            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el nombre del destino: ");
                    String nombreDestino = sc.nextLine();
                    destinos.add(new Destino(nombreDestino));
                    break;

                case 2:
                    System.out.print("Ingrese el ID del bus: ");
                    String idBus = sc.nextLine();
                    System.out.print("Ingrese el modelo del bus: ");
                    String modeloBus = sc.nextLine();
                    System.out.print("Ingrese la capacidad del bus: ");
                    int capacidadBus = sc.nextInt();
                    sc.nextLine();
                    buses.add(new Bus(idBus, modeloBus, capacidadBus));
                    break;
                case 3:

                    System.out.println("--- Destinos disponibles ---");
                    if (!destinos.isEmpty()) {
                        destinos.stream().forEach(d -> System.out.println((destinos.indexOf(d) + 1) + ". " + d.getNombre()));
                        System.out.print("Seleccione un destino: ");
                        int destinoElegidoIndex = sc.nextInt();
                        if (destinoElegidoIndex > 0 && destinoElegidoIndex <= destinos.size()) {
                            destinoElegido = destinos.get(destinoElegidoIndex - 1).getNombre();
                        } else {
                            System.out.println("El destino seleccionado no es válido.");
                        }
                    } else {
                        System.out.println("No hay destinos disponibles.");
                    }
                    if (destinoElegido.isEmpty()) {
                        System.out.println("No se ha seleccionado destino");
                        break;
                    }


                    System.out.println("--- Horarios disponibles ---");
                    System.out.println("1. 8:00 am - 12:00 pm");
                    System.out.println("2. 1:00 pm - 5:00 pm");
                    System.out.println("3. 6:00 pm - 10:00 pm");
                    System.out.print("Seleccione un horario: ");

                    int horarioElegidoIndex = sc.nextInt();
                    Horario horario = new Horario();
                    switch (horarioElegidoIndex) {
                        case 1:
                            horario = new Horario(new Date(2023, 2, 2, 8, 0), new Date(2023, 2, 2, 12, 0));
                            break;
                        case 2:
                            horario = new Horario(new Date(2023, 2, 2, 13, 0), new Date(2023, 2, 2, 17, 0));
                            break;
                        case 3:
                            horario = new Horario(new Date(2023, 2, 2, 13, 0), new Date(2023, 2, 27, 17, 0));
                            break;

                    }

                    System.out.println("Buses disponibles: ");
                    IntStream.range(0, buses.size())
                            .forEach(i -> System.out.println((i + 1) + ". " + buses.get(i).getModelo()));
                    System.out.print("Seleccione bus: ");
                    int bus_id = sc.nextInt();
                    Bus bus_elegido = buses.get(bus_id - 1);
                    bus_elegido.setCapacidad(bus_elegido.getCapacidad() - 1);

                    System.out.println("Usted ha seleccionado el bus: " + bus_elegido.getModelo());
                    System.out.println("Cupos disponibles en este bus elegido: " + bus_elegido.getCapacidad());



                    guardarRegistro(registros, destinoElegido, horario, bus_elegido);


                    System.out.println("Compra realizada con éxito, felicidades por tu viaje ;)");

                    break;

                case 4:

                    mostrarRegistros(registros);

                    break;

                case 5:
                    System.out.print("Ingrese nombre del pasajero: ");
                    String nombrePasajero = sc.next();

                    System.out.print("Ingrese edad del pasajero: ");
                    int edadPasajero = sc.nextInt();

                    Pasajeros pasajero = new Pasajeros(nombrePasajero, edadPasajero);
                    System.out.println("Pasajero registrado con éxito: " + pasajero.getNombre() + " " + pasajero.getEdad());
                    break;
                case 6:
                    System.out.println("Saliendo del sistema... Hasta pronto");
                    break;
                default:
                    System.out.println("Opcion incorrecta :(");
                    break;
            }
        } while (opcion != 6);
    }

    public static void guardarRegistro(ArrayList<Registro_Viajes> registros, String destinoElegido, Horario horarioElegido, Bus busElegido) {
        Registro_Viajes registro = new Registro_Viajes(destinoElegido, horarioElegido, busElegido);
        registros.add(registro);
    }


    private static void mostrarRegistros(ArrayList<Registro_Viajes> registros) {
        if (registros.isEmpty()) {
            System.out.println("No hay registros de viajes disponibles.");
        } else {
            System.out.println("--- Registro de viajes ---");
            IntStream.range(0, registros.size())
                    .forEach(i -> {
                        Registro_Viajes registro = registros.get(i);
                        System.out.println((i + 1) + ". Destino: " + registro.getDestino() + ", Horario: " + registro.getHorario().toString() + ", Bus: " + registro.getBus().toString());
                    });
        }
    }
    }






