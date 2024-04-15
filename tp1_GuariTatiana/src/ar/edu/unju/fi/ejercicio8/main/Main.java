package ar.edu.unju.fi.ejercicio8.main;
import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial; 
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		        Scanner lector = new Scanner(System.in);
		        System.out.print("Ingrese el valor de n: ");
		        int n = lector.nextInt();

		        CalculadoraEspecial calculadora = new CalculadoraEspecial();
		        calculadora.setN(n);

		        int sumatoria = calculadora.calcularSumatoria();
		        int productoria = calculadora.calcularProductoria();

		        System.out.println("El resultado de la sumatoria es: " + sumatoria);
		        System.out.println("El resultado de la productoria es: " + productoria);
		        
		        lector.close();
		}
		
	}


