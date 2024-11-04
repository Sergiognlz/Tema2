package bucles;

import java.util.Scanner;

public class Ejercicio4 {
	/*
	 * De forma similar a la actividad 4, realiza un programa que calcule el mínimo
	 * común múltiplo de dos números dados. En este caso, habrá que partir del
	 * máximo de los dos e ir incrementando hasta encontrar el primer número que sea
	 * múltiplo de los dos números.
	 */
	public static void main(String[] args) {

		// creamos variables para a y b
		int a;
		int b;
		// variable donde guardar el mayor y menor
		int mayor = 0;
		// varable donde guardar el divisor
		int multi = 1;
		boolean enc = false;

		// escaner
		Scanner sc = new Scanner(System.in);

		// control de rango
		do {
			// pedimos número A
			System.out.println("Introduce número A");
			// guardamos
			a = sc.nextInt();
		} while (a < 0);
		do {
			// pedimos número B
			System.out.println("Introduce número B");
			// guardamos
			b = sc.nextInt();
		} while (b < 0);

		mayor = Math.max(a, b);

		while (!enc) {
			if (mayor % a == 0 && mayor % b == 0) {
				multi = mayor;
				// mostramos por pantalla
				System.out.println("El máximo común múltiplo es " + multi);
				enc = true;
			}
			mayor++;
		}
		// cerramos escaner
		sc.close();
	}
}