package ar.edu.unju.fi.ejercicio12.main;

import java.util.GregorianCalendar;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		
		 Scanner lector = new Scanner(System.in);

	        System.out.println("Ingrese el nombre de la persona:");
	        String nombre = lector.nextLine();

	        System.out.println("Ingrese la fecha de nacimiento de la persona (DD/MM/YYYY):");
	        String[] fecha = lector.nextLine().split("/");
	        int dia = Integer.parseInt(fecha[0]);
	        int mes = Integer.parseInt(fecha[1]) - 1; // Los meses en Calendar empiezan en 0
	        int año = Integer.parseInt(fecha[2]);
	        

	        Persona persona = new Persona(nombre, new GregorianCalendar(año, mes, dia));

	        System.out.println(persona); 
	        
	        lector.close();	
	}

}
