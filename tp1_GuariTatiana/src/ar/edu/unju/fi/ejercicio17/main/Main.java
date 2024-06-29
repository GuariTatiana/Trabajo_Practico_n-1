package ar.edu.unju.fi.ejercicio17.main;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    	
    	// TODO Auto-generated method stub
    	
        List<Jugador> jugadores = new ArrayList<>();
        Scanner lector = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1 - Alta de jugador");
            System.out.println("2 - Mostrar los datos del jugador");
            System.out.println("3 - Mostrar todos los jugadores ordenados por apellido");
            System.out.println("4 - Modificar los datos de un jugador");
            System.out.println("5 - Eliminar un jugador");
            System.out.println("6 - Mostrar la cantidad total de jugadores");
            System.out.println("7 - Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
            System.out.println("8 - Salir");
            
            System.out.print("Ingrese una opcion:");
            opcion = lector.nextInt();

            switch (opcion) {
                case 1:
                    altadeJugador(jugadores, lector);
                    break;
                case 2:
                    mostrarDatosdelJugador(jugadores, lector);
                    break;
                case 3:
                    mostrarJugadoresOrdenadosPorApellido(jugadores);
                    break;
                case 4:
                    modificarDatosJugador(jugadores, lector);
                    break;
                case 5:
                    eliminarJugador(jugadores, lector);
                    break;
                case 6:
                    mostrarCantidadTotalJugadores(jugadores);
                    break;
                case 7:
                    mostrarCantidadJugadoresPorNacionalidad(jugadores, lector);
                    break;
                case 8:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion != 8);

        lector.close();
    }

    private static void altadeJugador(List<Jugador> jugadores, Scanner lector) {
        System.out.println("Ingrese los datos del jugador:");
        System.out.print("Nombre: ");
        String nombre = lector.next();
        System.out.print("Apellido: ");
        String apellido = lector.next();
        System.out.print("Fecha de nacimiento (formato dd/mm/aaaa): ");
        String fechaNacimientoStr = lector.next();
        Date fechaNacimiento = null;
        try {
            fechaNacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(fechaNacimientoStr);
        } catch (ParseException e) {
           
            return;
        }
        System.out.print("Nacionalidad: ");
        String nacionalidad = lector.next();
        System.out.print("Estatura: ");
        double estatura = lector.nextDouble();
        System.out.print("Peso: ");
        double peso = lector.nextDouble();
        System.out.print("Ingrese la posición (delantero, medio, defensa, arquero): ");
        String posicion = lector.next();
        jugadores.add(new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion));
        System.out.println("Datos agregados correctamente");
    }

    private static void mostrarDatosdelJugador(List<Jugador> jugadores, Scanner lector) {
        System.out.print("Ingrese el nombre del jugador:");
        String nombre = lector.next();
        System.out.print("Ingrese el apellido del jugador: ");
        String apellido = lector.next();
        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                System.out.println(jugador);
                return;
            }
        }
        System.out.println("No existe tal jugador");
    }

    private static void mostrarJugadoresOrdenadosPorApellido(List<Jugador> jugadores) {
        List<Jugador> jugadoresOrdenados = new ArrayList<>(jugadores);
        jugadoresOrdenados.sort(Comparator.comparing(Jugador::getApellido));
        for (Jugador jugador : jugadoresOrdenados) {
            System.out.println(jugador);
        }
    }

    private static void modificarDatosJugador(List<Jugador> jugadores, Scanner lector) {
        System.out.print("Ingrese nombre del jugador:");
        String nombre = lector.next();
        System.out.print("Ingrese apellido del jugador:");
        String apellido = lector.next();
        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                System.out.println("Ingrese los nuevos datos del jugador:");
                System.out.print("Nombre:");
                jugador.setNombre(lector.next());
                System.out.print("Apellido:");
                jugador.setApellido(lector.next());
                System.out.print("Fecha de nacimiento (formato dd/mm/aaaa): ");
                String fechaNacimientoStr = lector.next();
                Date fechaNacimiento = null;
                try {
                    fechaNacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(fechaNacimientoStr);
                } catch (ParseException e) {
                    
                    return;
                }
                jugador.setFechaNacimiento(fechaNacimiento);

                System.out.print("Nacionalidad:");
                jugador.setNacionalidad(lector.next());
                System.out.print("Estatura:");
                jugador.setEstatura(lector.nextDouble());
                System.out.print("Peso:");
                jugador.setPeso(lector.nextDouble());
                System.out.print("Posición (delantero, medio, defensa, arquero): ");
                jugador.setPosicion(lector.next());
                return;
            }
        }
        System.out.println("No existe tal jugador");
    }

    private static void eliminarJugador(List<Jugador> jugadores, Scanner lector) {
        System.out.print("Ingrese nombre del jugador:");
        String nombre = lector.next();
        System.out.print("Ingrese apellido del jugador: ");
        String apellido = lector.next();
        Iterator<Jugador> iter = jugadores.iterator();
        while (iter.hasNext()) {
            Jugador jugador = iter.next();
            if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                iter.remove();
                System.out.println("Se elimino el jugador");
                return;
            }
        }
        System.out.println("No existe tal jugador");
    }

    private static void mostrarCantidadTotalJugadores(List<Jugador> jugadores) {
        System.out.println("Cantidad total de jugadores: " + jugadores.size());
    }

    private static void mostrarCantidadJugadoresPorNacionalidad(List<Jugador> jugadores, Scanner lector) {
        System.out.print("Ingrese la nacionalidad:");
        String nacionalidad = lector.next();
        int contador = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.getNacionalidad().equalsIgnoreCase(nacionalidad)) {
                contador++;
            }
        }
        System.out.println("Cantidad de jugadores de la nacionalidad '" + nacionalidad + "': " + contador);
  
    
    }
}