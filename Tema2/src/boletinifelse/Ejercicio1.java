package boletinifelse;

import java.util.Scanner;

public class Ejercicio1 {

	/*
	 * Diseñar una aplicación que solicite al usuario un número e indique si es par
	 * o impar.
	 */

	public static void main(String[] args) {

		// creamos variable para guardar un número
		int num;
		// creamos escaner
		Scanner sc = new Scanner(System.in);

		// pedimos un número al usuario
		System.out.println("Introduce un número");
		// leemos el número
		num = sc.nextInt();

		// creamos un if else para comprobar si es par o impar

		if (num % 2 == 0) {
			// mensaje de número par

			System.out.println("El número introducido es par");
			// en caso contrario es impar
		} else {
			// mensaje de número impar

			System.out.println("El número es impar");
		}
		// cerramos escaner
		sc.close();
	}

}
