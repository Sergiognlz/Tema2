package condicionales;

import java.util.Scanner;

public class Ejercicio2 {
	/*
	 * Utiliza un operador ternario para calcular el valor absoluto de un número que
	 * se solicita al usuario por teclado.
	 */

	/*
	 * Putas pruebas
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// creamos una variable donde guardar el número que usaremos
		int num;
		// creamos escaner
		Scanner sc = new Scanner(System.in);

		// pedimos un número al usuario
		System.out.println("Introduce un número");
		// guardamos el número
		num = sc.nextInt();

		// nos montamos tremenda fumada imnecesaria para justificar el uso de
		// condicionales
		if (num < 0) {
			// imprimimos por pantalla el valor absoluto del número introducido y
			// brujería....
			System.out.println(Math.abs(num));

		}
		sc.close();
	}

}
