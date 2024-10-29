package bucles;

import java.util.Scanner;

public class Ejercicio8 {
	/*
	 * Realiza un programa que lea y acepte únicamente aquellos que sean mayores que
	 * el último dado. La introducción de números finaliza con la introducción de un
	 * 0. Al final se mostrará: El total de números introducidos, excluido el 0. El
	 * total de números fallados.
	 */
	public static void main(String[] args) {
		// variable número
		int num;
		// variable dónde almacenar el número mayor
		int mayor = 0;
		// contador para saber números introducidos
		int cont = 0;
		// contador fallados
		int fallados = 0;
		// escaner
		Scanner sc = new Scanner(System.in);

		// do while para controlar control
		do {
			// pedimos números
			System.out.println("Introduce un número");
			// guardamos
			num = sc.nextInt();
			if (num >= mayor) {
				mayor = num;
			} else if (num == 0) {

			} else {
				fallados++;
			}
		} while (num != 0);

		System.out.println("A. Total de números introducidos: " + cont);
		System.out.println("B. Números fallados " + fallados);
		sc.close();
	}
}
