package ejerciciosFor;

import java.util.Scanner;

//Realiza un programa que pida dos números enteros A y B, siendo B mayor que A. Luego visualiza los números desde A hasta B.

public class Ejercicio10 {
public static void main(String[] args) {
	//creamos variables para los números que queremos guardar A y B, los inicializamos.
	int A=0,B=0;
	//creamos escanner
	Scanner sc=new Scanner(System.in);
	
	//pedimos al usuario dos números y explicamos las condiciones
	System.out.println("Introduce dos números. El primero debe ser menor que el segundo");
	
	
//creamos un condicional con if en caso que los números introducidos no cumplan la norma. 
	do {
		System.out.println("Introduce el primer número");
		A=sc.nextInt();
		if (A>B) {
		System.out.println("El número introducido no es válido.");
		}
	}while(B>A);
	
	do {
		System.out.println("Introduce el segundo número");
		B=sc.nextInt();
		System.out.println("El número introducido no es válido.");
	}while(B>A);

	for(;A<=B;A++) {
	System.out.println( A );
			
	}
	//cerramos escaner
	sc.close();
			
	}


}
