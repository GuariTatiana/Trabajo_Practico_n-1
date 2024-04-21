package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner lector = new Scanner(System.in);
		
		 System.out.print("Ingrese un número entero entre 5 y 10: ");
		 
	        int tamañoArray = lector.nextInt();
	        
	        // Validar que el tamaño del array esté en el rango [5,10]
	        while (tamañoArray < 5 || tamañoArray > 10) {
	            System.out.print("El número ingresado está fuera del rango. Ingrese nuevamente: ");
	            tamañoArray = lector.nextInt();
	        }
	        
	        String[] nombres = new String [tamañoArray];
	       
	        
	        for (int i = 0; i < nombres.length; i++) {
	            System.out.print("Ingrese nombres de persona: ");
	            nombres[i] = lector.next();   
	        }
	        
	        System.out.println("VALORES DEL ARRAY COMENZANDO POR EL PRIMER INDICE:");
	        
	        for (int i = 0; i < nombres.length; i++) {
	            System.out.println("Posicion"+  i + ": " + nombres[i]);     
	            
	        }
	        
	        System.out.println("VALORES DEL ARRAY COMENZANDO POR EL ULTIMO INDICE:");
	        
	        for (int i= nombres.length -1; i >=0 ; i--) {
	           System.out.println( "Posicion "+  i + ": " + nombres[i]);     
	        }
	        
	        lector.close();
	}

}
