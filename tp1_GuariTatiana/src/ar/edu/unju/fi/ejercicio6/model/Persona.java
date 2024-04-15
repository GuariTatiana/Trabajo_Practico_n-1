package ar.edu.unju.fi.ejercicio6.model;
import java.time.LocalDate;
import java.time.Period;

public class Persona {

	private String dni;
	private String nombre;
	private LocalDate fecnac;
	private String provincia;
	
	public int calcularedad () {
		LocalDate fechaActual= LocalDate.now();
		Period edad = Period.between(fecnac, fechaActual);
		return edad.getYears();
	}
	
	public boolean mayoredad ( ) {
		int edad= calcularedad();
		return edad >=18;
	}
	
	public void mostrarDatos () {
		System.out.println("DNI: "+ dni);
		System.out.println("Nombre: "+ nombre);
		System.out.println("Fecha de nacimiento: "+ fecnac);
		System.out.println("La edad de la persona: "+ calcularedad());
		if (mayoredad()) {
			System.out.println("La persona es MAYOR de edad");
			
		}
		else {
			System.out.println("La persona NO es MAYOR de edad");
			
		}
		System.out.println("Provincia: "+ provincia);
		
		
		
	}
	public Persona() {
		
	}
	
	public Persona(String dni, String nombre, String provincia, LocalDate fecnac) {
		this.dni = dni;
		this.nombre = nombre;
		this.provincia = provincia;
		this.fecnac =fecnac;
		
	}
		
	//public Persona(String dni, String nombre, String provincia, LocalDate fecnac) {
		//this.dni = dni;
		//this.nombre = nombre;
		//this.provincia = "Jujuy";
		//this.fecnac =fecnac;
	//}

	
}