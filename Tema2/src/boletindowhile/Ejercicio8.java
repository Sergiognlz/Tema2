package boletindowhile;

import java.util.Scanner;

public class Ejercicio8 {
	/*
	 * Repetir el ejercicio de los dados del boletín de SWITCH. Mientras en la
	 * primera tirada no se introduzca un valor válido se le seguirá preguntando. Lo
	 * mismo con la segunda tirada.
	 */
	public static void main(String[] args) {
		// creamos variables para las dos tiradas de dados
		String tir1 = "";
		String tir2 = "";
		int num1;
		int num2;
		// creamos escaner
		Scanner sc = new Scanner(System.in);

		do {
			// pedimos al usuario su tirada de dados
			System.out.println("Introduce la primera tirada de dados");
			// guardamos el valor
			tir1 = sc.next();
		} while (!tir1.equalsIgnoreCase("uno") && !tir1.equalsIgnoreCase("dos") && !tir1.equalsIgnoreCase("tres")
				&& !tir1.equalsIgnoreCase("cuatro") && !tir1.equalsIgnoreCase("cinco") && !tir1.equalsIgnoreCase("seis"));
		// case con su tirada en cadena
		num1 = switch (tir1.toUpperCase()) {
		case "UNO" -> {
			yield 1;
		}
		case "DOS" -> {
			yield 2;
		}
		case "TRES" -> {
			yield 3;
		}
		case "CUATRO" -> {
			yield 4;
		}
		case "CINCO" -> {
			yield 5;
		}
		case "SEIS" -> {
			yield 6;
		}
		default -> {
			yield 0;
		}
		};
		do {
		// pedimos al usuario su tirada de dados
		System.out.println("Introduce la segunda tirada de dados");
		// guardamos el valor
		tir2 = sc.next();
		
			
		}while (!tir2.equalsIgnoreCase("uno") && !tir2.equalsIgnoreCase("dos") && !tir2.equalsIgnoreCase("tres")
				&& !tir2.equalsIgnoreCase("cuatro") && !tir2.equalsIgnoreCase("cinco") && !tir2.equalsIgnoreCase("seis"));
		// case con su tirada en cadena
		num2 = switch (tir2) {
		case "UNO" -> {
			yield 1;
		}
		case "DOS" -> {
			yield 2;
		}
		case "TRES" -> {
			yield 3;
		}
		case "CUATRO" -> {
			yield 4;
		}
		case "CINCO" -> {
			yield 5;
		}
		case "SEIS" -> {
			yield 6;
		}
		default -> {
			yield 0;
		}
		};
		
		// mostramos suma en formato numérico
		System.out.println("La suma de sus tiradas es: " + (num1 + num2));
		// cerramos escaner
		sc.close();
	}
}
