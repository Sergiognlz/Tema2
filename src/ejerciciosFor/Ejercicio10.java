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
	System.out.println("Introduce el primer número");
	//guardamos el primer número
		A=sc.nextInt();
		
//creamos un bucle con do 
	do{
		System.out.println("Introduce el segundo número");
		//guardamos el segundo número
		B=sc.nextInt();
		//si el primer número es mayor que el segundo se muestra el siguiente mensaje y se sigue en el bucle.
		if (A>B) {
			
		System.out.println("El número introducido no es válido.");
		}
	//cuando el segundo número introducido sea mayor que el primero (es decir, cuando la condición de que A>B sea falsa, pasará el bucle.
	}while(A>B);

	for(;A<=B;A++) {
	System.out.println( A );
			
	}
	//cerramos escaner
	sc.close();
			
	}

}

