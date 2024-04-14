package ar.edu.unju.fi.ejercicio6.main;
import java.time.LocalDate;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio6.model.Persona;


public class Main {

	public static void main(String[] args) {
	 Scanner lector= new Scanner (System.in); 
	 
	 Persona a = new Persona();
	 
	 
	 System.out.println("Ingrese dni" + a);
	 
	 a.mostrarDatos();
			 
	}

}
