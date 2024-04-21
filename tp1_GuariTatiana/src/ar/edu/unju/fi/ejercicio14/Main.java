package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		 Scanner lector = new Scanner(System.in);
		
		 System.out.print("Ingrese un número entero entre 3 y 10: ");
		 
	        int tamañoArray = lector.nextInt();
	        
	        // Validar que el tamaño del array esté en el rango [3,10]
	        while (tamañoArray < 3 || tamañoArray > 10) {
	            System.out.print("El número ingresado está fuera del rango. Ingrese nuevamente: ");
	            tamañoArray = lector.nextInt();
	        }
	        
	        int[] numeros = new int[tamañoArray];
	        int suma = 0;
	        
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Ingrese un número entero: ");
	            numeros[i] = lector.nextInt();
	            suma += numeros[i];
	        }
	        
	        System.out.println("Valor de cada posición:");
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.println("Posición " + i + ": " + numeros[i]);
	        }
	        
	        System.out.println("Suma de todos los valores: " + suma);
	        
	        lector.close();
	}

}
