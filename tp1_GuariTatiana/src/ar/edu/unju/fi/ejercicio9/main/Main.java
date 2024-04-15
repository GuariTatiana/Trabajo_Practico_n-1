package ar.edu.unju.fi.ejercicio9.main;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

public static void main(String[] args) {
		
	        Scanner scanner = new Scanner(System.in);
	        Producto[] productos = new Producto[3];

	        for (int i = 0; i <3; i++) {
	            productos[i] = new Producto();
	            System.out.println("Ingrese el nombre del producto " + (i + 1) + ": ");
	            productos[i].setNombre(scanner.nextLine());
	            System.out.println("Ingrese el código del producto " + (i + 1) + ": ");
	            productos[i].setCodigo(scanner.nextLine());
	            System.out.println("Ingrese el precio del producto " + (i + 1) + ": ");
	            productos[i].setPrecio(scanner.nextDouble());
	            System.out.println("Ingrese el descuento del producto (entre 0 y 50): ");
	            productos[i].setDescuento(scanner.nextInt());
	            scanner.nextLine(); // consume el salto de línea
	        }

	        for (Producto producto : productos) {
	            System.out.println("Nombre: " + producto.getNombre());
	            System.out.println("Código: " + producto.getCodigo());
	            System.out.println("Precio: " + producto.getPrecio());
	            System.out.println("Descuento: " + producto.getDescuento());
	            System.out.println("Precio con descuento: " + producto.calcularDescuento());
	            System.out.println();
	        }

	        scanner.close();
	}

}
