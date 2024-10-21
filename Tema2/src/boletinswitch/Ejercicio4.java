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
		String tir1="";
		String tir2="";
		int num1;
		int num2;
		// creamos escaner
		Scanner sc = new Scanner(System.in);

		// pedimos al usuario su tirada de dados
		System.out.println("Introduce tu tirada de dados");
		// guardamos el valor
		tir1 = sc.next();

		// case con su tirada en cadena
		num1=switch (tir1) {
		case "UNO" ->{ yield 1;}
		case "DOS" ->{ yield 2;}
		case "TRES" ->{ yield 3;}
		case "CUATRO" ->{ yield 4;}
		case "CINCO" ->{ yield 5;}
		case "SEIS" ->{ yield 6;}
		default-> { yield 0;}
		};
		// pedimos al usuario su tirada de dados
		System.out.println("Introduce tu tirada de dados");
		// guardamos el valor
		tir2 = sc.next();

		// case con su tirada en cadena
		num2=switch (tir2) {
		case "UNO" ->{ yield 1;}
		case "DOS" ->{ yield 2;}
		case "TRES" ->{ yield 3;}
		case "CUATRO" ->{ yield 4;}
		case "CINCO" ->{ yield 5;}
		case "SEIS" ->{ yield 6;}
		default-> { yield 0;}
		};
		//mostramos suma en formato numérico
		System.out.println("La suma de sus tiradas es: "+(num1+num2));
		//cerramos escaner
		sc.close();
	}
}
