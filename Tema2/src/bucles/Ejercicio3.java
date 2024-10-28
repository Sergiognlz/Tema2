package bucles;

import java.util.Scanner;

public class Ejercicio3 {
	/*
	 * Para dos números dados, a y b, es posible calcular el máximo común divisor
	 * (el número más grande que divide a ambos) mediante un algoritmo ineficiente
	 * pero sencillo: desde el menor de a y b, ir buscando, de forma decreciente
	 * (-1), el primer número que divide a ambos simultáneamente. Teniendo en cuenta
	 * lo que se acaba de explicar, realiza un programa que calcule el máximo común
	 * divisor de dos números.
	 */

	public static void main(String[] args) {
		// creamos variables para a y b
		int a;
		int b;
		// variable donde guardar el mayor y menor
		int mayor = 0;
		int menor = 0;
		// varable donde guardar el divisor
		int divi = 1;

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

		if (a >= b) {
			mayor = a;
			menor = b;
		} else if (a < b) {
			mayor = b;
			menor = a;

		}

		for (int i = menor; i > 0; i--) {
			if ((mayor % i == 0) && (menor % i == 0)) {
				divi = i;
				break;
			}

		}
		System.out.println("El máximo común divisor es " + divi);

		// cerramos escaner
		sc.close();
	}
}
