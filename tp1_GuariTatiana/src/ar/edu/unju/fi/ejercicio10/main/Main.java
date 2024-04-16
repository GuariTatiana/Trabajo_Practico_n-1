package ar.edu.unju.fi.ejercicio10.main;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio10.model.Pizza;


public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		 for (int i = 1; i <= 3; i++) {
	            System.out.println("* Pizza " + i + " *");
	            Pizza pizza = new Pizza();
	            
	            System.out.print("Diámetro: ");
	            int diametro = scanner.nextInt();
	            pizza.setDiametro(diametro);
	            
	            System.out.print("Ingredientes especiales (true/false): ");
	            boolean ingredientesEspeciales = scanner.nextBoolean();
	            pizza.setIngredientesEspeciales(ingredientesEspeciales);
	            
	            pizza.calcularPrecio();
	            pizza.calcularArea();
	            
	            System.out.println("Precio Pizza = " + pizza.getPrecio() + "$");
	            System.out.println("Área de la pizza = " + pizza.getArea());
	        }
		 scanner.close();

	}

}
