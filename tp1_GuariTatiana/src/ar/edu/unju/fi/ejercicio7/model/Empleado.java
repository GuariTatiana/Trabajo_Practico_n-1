package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	
	private String nombre;
	private String legajo;
	private double salario;
	
	final double SALARIOMINIMO = 210000.00;
	final double AUMENTOPORMERITOS = 20000.00;
	
	//CONSTRUCTOR PARAMETRIZADO	
	public Empleado(String nombre, String legajo, double salario) {
		this.nombre = nombre;
		this.legajo =legajo;
		this.salario = salario >= SALARIOMINIMO ? salario : SALARIOMINIMO;
		
	}
		       
	    public void mostrarDatos() {
	        System.out.println("Nombre del empleado: " + this.nombre);
	        System.out.println("Legajo: " + this.legajo);
	        System.out.println("Salario $: " + this.salario);
	    }

	    public void darAumento() {
	        this.salario += AUMENTOPORMERITOS;
	    }

}
