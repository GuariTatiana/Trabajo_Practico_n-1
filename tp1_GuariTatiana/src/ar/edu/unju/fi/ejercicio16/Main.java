package ar.edu.unju.fi.ejercicio16;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		
        String[] nombres = new String[5];
        
        // Ingresar los nombres de las personas en el arreglo
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese un nombre de persona: ");
            nombres[i] = lector.nextLine();
        }
        
        // Mostrar los valores del arreglo usando la estructura de control while
        int i = 0;
        while (i < nombres.length) {
            System.out.println("Valor en la posición " + i + ": " + nombres[i]);
            i++;
        }
        
        // Mostrar el tamaño del arreglo
        System.out.println("Tamaño del arreglo: " + nombres.length);
        
        // Eliminar un elemento del arreglo según el índice ingresado por el usuario
        byte indiceEliminar;
        do {
            System.out.print("Ingrese el índice del elemento a eliminar (0-4): ");
            indiceEliminar = lector.nextByte();
        } while (indiceEliminar < 0 || indiceEliminar >= nombres.length);
        
        for (int j = indiceEliminar; j < nombres.length - 1; j++) {
            nombres[j] = nombres[j + 1];
        }
        nombres[nombres.length - 1] = "";
        
        // Mostrar el arreglo nuevamente
        System.out.println("Arreglo después de eliminar el elemento:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        
        lector.close();
	}

}
