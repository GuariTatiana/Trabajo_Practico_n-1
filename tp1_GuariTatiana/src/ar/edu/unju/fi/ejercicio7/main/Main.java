package ar.edu.unju.fi.ejercicio7.main;

import ar.edu.unju.fi.ejercicio7.model.Empleado; 

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	    Scanner lector = new Scanner(System.in);
	    
	    System.out.println("Ingrese los datos para el empleado:");
        System.out.println("En el siguiente orden:nombre, legajo y salario");
        String nombre = lector.nextLine();
        String legajo = lector.nextLine();
        double salario = lector.nextDouble();

        Empleado emp = new Empleado(nombre, legajo, salario);
        emp.mostrarDatos();
        emp.darAumento();
        emp.mostrarDatos();

        lector.close();
    
		
		
	}

}
