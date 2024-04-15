package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;


public class Main {

	public static void main(String[] args) {
	Scanner lector= new Scanner (System.in); 
	 
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
	System.out.println("Los datos de la persona deben ingresarse en el siguiente orden: DNI, NOMBRE, FECHANAC., PROVINCIA");
	System.out.println("La fecha de nacimiento se ingresa xx/ss/yyyy");
	
	System.out.println("Ingrese los datos para la primera persona: ");
	String dni1= lector.nextLine();
	String nombre1= lector.nextLine();
	LocalDate fecnac1 =LocalDate.parse(lector.nextLine(), formatter);
	String provincia1= lector.nextLine();

	 Persona persona1 = new Persona(dni1, nombre1, provincia1, fecnac1);
	 persona1.mostrarDatos();
	 
	 System.out.println("Ingrese los datos para la segunda persona persona: ");
		String dni2= lector.nextLine();
		String nombre2= lector.nextLine();
		LocalDate fecnac2 =LocalDate.parse(lector.nextLine(), formatter);
		String provincia2= lector.nextLine();

		 Persona persona2 = new Persona(dni2, nombre2, provincia2, fecnac2);
		 persona2.mostrarDatos();
		 
		 System.out.println("Ingrese los datos para la tercera persona persona: ");
			String dni3= lector.nextLine();
			String nombre3= lector.nextLine();
			LocalDate fecnac3 =LocalDate.parse(lector.nextLine(), formatter);
			String provincia3= lector.nextLine();

			 Persona persona3 = new Persona(dni3, nombre3, provincia3, fecnac3);
			 persona3.mostrarDatos();
	 
	 lector.close();
			 
	}

}
