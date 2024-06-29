package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Pais> paises = new ArrayList<>();
        paises.add(new Pais("001", "Argentina"));
        paises.add(new Pais("002", "Brasil"));
        paises.add(new Pais("003", "Chile"));

        List<DestinoTuristico> destinosTuristicos = new ArrayList<>();
        Scanner lector = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1 - Alta de destino turístico");
            System.out.println("2 - Mostrar todos los destinos turísticos");
            System.out.println("3 - Modificar el país de un destino turístico");
            System.out.println("4 - Limpiar el ArrayList de destinos turísticos");
            System.out.println("5 - Eliminar un destino turístico");
            System.out.println("6 - Mostrar los destinos turísticos ordenados por nombre");
            System.out.println("7 - Mostrar todos los países");
            System.out.println("8 - Mostrar los destinos turísticos que pertenecen a un país");
            System.out.println("9 - Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = lector.nextInt();

            switch (opcion) {
                case 1:
                    altaDestinoTuristico(destinosTuristicos, paises, lector);
                    break;
                case 2:
                    mostrarDestinosTuristicos(destinosTuristicos);
                    break;
                case 3:
                    modificarPaisDestinoTuristico(destinosTuristicos, paises, lector);
                    break;
                case 4:
                    destinosTuristicos.clear();
                    System.out.println("ArrayList de destinos turísticos limpiado con éxito.");
                    break;
                case 5:
                    eliminarDestinoTuristico(destinosTuristicos, lector);
                    break;
                case 6:
                    mostrarDestinosTuristicosOrdenados(destinosTuristicos);
                    break;
                case 7:
                    mostrarPaises(paises);
                    break;
                case 8:
                    mostrarDestinosPorPais(destinosTuristicos, lector);
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
            }
        } while (opcion != 9);

        lector.close();
    }

    private static void altaDestinoTuristico(List<DestinoTuristico> destinosTuristicos, List<Pais> paises, Scanner lector) {
        System.out.println("Ingrese datos del destino turístico:");
        System.out.print(" Código: ");
        String codigo = lector.next();
        System.out.print(" Nombre:");
        String nombre = lector.next();
        System.out.print("Precio:");
        double precio = lector.nextDouble();
        Pais pais = seleccionarPais(paises, lector);
        if (pais != null) {
            System.out.print("Cantidad de días: ");
            int cantidadDias = lector.nextInt();
            destinosTuristicos.add(new DestinoTuristico(codigo, nombre, precio, pais, cantidadDias));
            System.out.println("Se agrego el destino turistico correctamente");
        } else {
            System.out.println("no fue agregado correctamente el destino turistico");
        }
    }

    private static Pais seleccionarPais(List<Pais> paises, Scanner lector) {
        mostrarPaises(paises);
        System.out.print("Ingrese el código del país: ");
        String codigoPais = lector.next();
        for (Pais pais : paises) {
            if (pais.getCodigo().equalsIgnoreCase(codigoPais)) {
                return pais;
            }
        }
        System.out.println("No hay pais con ese codigo");
        return null;
    }

    private static void mostrarPaises(List<Pais> paises) {
        System.out.println("Lista de países: ");
        for (Pais pais : paises) {
            System.out.println(pais.getCodigo() + " - " + pais.getNombre());
        }
    }

    private static void mostrarDestinosTuristicos(List<DestinoTuristico> destinosTuristicos) {
        System.out.println(" Lista de destinos turísticos:");
        for (DestinoTuristico destino : destinosTuristicos) {
            System.out.println(destino);
        }
    }

    private static void modificarPaisDestinoTuristico(List<DestinoTuristico> destinosTuristicos, List<Pais> paises, Scanner lector) {
        System.out.print("Ingrese el código del destino turístico: ");
        String codigoDestino = lector.next();
        DestinoTuristico destinoTuristicoEncontrado = null;
        for (DestinoTuristico destino : destinosTuristicos) {
            if (destino.getCodigo().equalsIgnoreCase(codigoDestino)) {
                destinoTuristicoEncontrado = destino;
                break;
            }
        }
        if (destinoTuristicoEncontrado != null) {
            Pais nuevoPais = seleccionarPais(paises, lector);
            if (nuevoPais != null) {
                destinoTuristicoEncontrado.setPais(nuevoPais);
                System.out.println("Se modifico el pais correctamente");
            } else {
                System.out.println("La modificacion NO se realizo correctamente");
            }
        } else {
            System.out.println("Error. No hay destino turistiico con ese codigo");
        }
    }

    private static void eliminarDestinoTuristico(List<DestinoTuristico> destinosTuristicos, Scanner lector) {
        System.out.print("Ingrese el código del destino turístico a eliminar: ");
        String codigoDestino = lector.next();
        Iterator<DestinoTuristico> iter = destinosTuristicos.iterator();
        while (iter.hasNext()) {
            DestinoTuristico destino = iter.next();
            if (destino.getCodigo().equalsIgnoreCase(codigoDestino)) {
                iter.remove();
                System.out.println("Se elimino de forma correcta");
                return;
            }
        }
        System.out.println("Error. No hay destino turistiico con ese codigo");
    }

    private static void mostrarDestinosTuristicosOrdenados(List<DestinoTuristico> destinosTuristicos) {
        List<DestinoTuristico> destinosOrdenados = new ArrayList<>(destinosTuristicos);
        Collections.sort(destinosOrdenados, (d1, d2) -> d1.getNombre().compareToIgnoreCase(d2.getNombre()));
        System.out.println("Lista de destinos turísticos ordenados por nombre:");
        for (DestinoTuristico destino : destinosOrdenados) {
            System.out.println(destino);
        }
    }

    private static void mostrarDestinosPorPais(List<DestinoTuristico> destinosTuristicos, Scanner scanner) {
        System.out.print("Ingrese el código del país: ");
        String codigoPais = scanner.next();
        System.out.println("Destinos turísticos pertenecientes al país con código '" + codigoPais + "':");
        for (DestinoTuristico destino : destinosTuristicos) {
            if (destino.getPais().getCodigo().equalsIgnoreCase(codigoPais)) {
                System.out.println(destino);
            }
        }
    
	}

}
