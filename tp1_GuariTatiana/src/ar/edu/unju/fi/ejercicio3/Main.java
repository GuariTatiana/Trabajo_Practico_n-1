package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner entrada =new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int num=entrada.nextInt();
		if (num % 2 == 0) {
			num =num *3;
			System.out.println("El numero es par y su triple es: "+ num);
		}
		else {
			num =num *2;
			System.out.println("El numero es impar y su doble es: "+ num);
		}
		
		entrada.close();
	}

}
