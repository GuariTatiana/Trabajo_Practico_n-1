package ar.edu.unju.fi.ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//para ingresar cadena y declarar
	
		Scanner lector =new Scanner(System.in);
		
		String namp= "Argentina";
		int edad= 18;
		int altura= 239;
		double precio= 1035.99; //punto decimal
		String telefono= "388 666 789";
		double coseno= 0.87758256189037;
		
		System.out.println("El nombre de un pais: " + namp);
		System.out.println("Edad de una persona: " + edad);
		System.out.println("La altura del edificio Alvear Tower: " + altura +"m");
		System.out.println("El precio de la galleta oreo: " + precio);
		System.out.println("Numero de telefono: " + telefono);
		System.out.println("El calculo de coseno de 0.5: " + coseno);
		
		lector.close();	
	}

}
