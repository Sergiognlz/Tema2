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
		int menor = 0;
		// varable donde guardar el divisor
		int multi = 1;

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
		// iuf else para ver cual es mayor y asignarlo
		if (a >= b) {
			mayor = a;
			menor = b;
		} else if (a < b) {
			mayor = b;
			menor = a;

		}
		//for para recorrer desde el mayor en adelante. creamos un bucle infinito para que no pare hasta encontrar el mcm
		for (int i = mayor; i > 0; i++) {
			// if con módulo de i entre el mayor y menor para calcular los múltiplos
			if ((i % mayor == 0) && (i % menor == 0)) {
				// asignamos el valor a multi
				multi = i;
				// salimos del bucle
				break;
			}

		}
		// mostramos por pantalla
		System.out.println("El máximo común múltiplo es " + multi);

		// cerramos escaner
		sc.close();
	}
}