package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada =new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int num=entrada.nextInt();
		
		if (num >=1 && num <=9 ) {
			int resultado;
			for ( int i=0; i <=10 ; i++) {		
			resultado = num *i;	
			System.out.println(num + " x " + i + " = " + resultado);
			
			}
		}
		else {
			System.out.println("ERROR");
			System.out.println("Valores posibles de 1 a 9");
		}
		
		entrada.close();
	}

}
