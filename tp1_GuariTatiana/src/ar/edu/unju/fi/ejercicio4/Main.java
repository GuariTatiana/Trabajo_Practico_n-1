package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int num=entrada.nextInt();
		
		if (num >=0 && num <=10 ) {
			int factorial=1;
			while (num != 0) {
				factorial=factorial *num;
				num=num-1;
				
			}
			System.out.println("Su factorial es: "+ factorial);
		}
		else {
			System.out.println("El numero se encuentra fuera del rango de 0 a 10");
		}
		
		entrada.close();
	}

}
