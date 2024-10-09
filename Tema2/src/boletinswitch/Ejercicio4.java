package boletinswitch;

import java.util.Scanner;

public class Ejercicio4 {
	/*
	 * Escribe un algoritmo para sumar dos tiradas de un dado de seis caras que
	 * haría el usuario. El algoritmo pregunta al usuario cuánto ha sacado en la
	 * primera tirada y el usuario le dará esa información pero en formato cadena
	 * (“UNO”, “DOS” … “SEIS”). Después el algoritmo volverá a preguntar al usuario
	 * cuánto ha sacado en la segunda tirada y el usuario también dará esa
	 * información en formato cadena. Por último, el algoritmo mostrará por pantalla
	 * la suma de las dos tiradas en formato numérico.
	 */
	public static void main(String[] args) {
		// creamos variables para las dos tiradas de dados
		int tir1;
		int tir2;
		// creamos escaner
		Scanner sc = new Scanner(System.in);

		// pedimos al usuario su tirada de dados
		System.out.println("Introduce tu tirada de dados");
		// guardamos el valor
		tir1 = sc.nextInt();

		// case con su tirada en cadena
		switch (tir1) {
		case 1 -> System.out.println("UNO");
		case 2 -> System.out.println("DOS");
		case 3 -> System.out.println("TRES");
		case 4 -> System.out.println("CUATRO");
		case 5 -> System.out.println("CINCO");
		case 6 -> System.out.println("SEIS");
		}
		// pedimos al usuario su tirada de dados
		System.out.println("Introduce tu tirada de dados");
		// guardamos el valor
		tir2 = sc.nextInt();

		// case con su tirada en cadena
		switch (tir2) {
		case 1 -> System.out.println("UNO");
		case 2 -> System.out.println("DOS");
		case 3 -> System.out.println("TRES");
		case 4 -> System.out.println("CUATRO");
		case 5 -> System.out.println("CINCO");
		case 6 -> System.out.println("SEIS");
		}
		//mostramos suma en formato numérico
		System.out.println("La suma de sus tiradas es: "+(tir1+tir2));
		//cerramos escaner
		sc.close();
	}
}
