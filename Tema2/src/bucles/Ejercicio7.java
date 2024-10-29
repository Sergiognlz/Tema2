package bucles;

import java.util.Scanner;

public class Ejercicio7 {
	/*
	 * Escribe un programa que lea un número n e imprima una pirámide de números con
	 * n filas como en la siguiente figura: 1 121 12321 1234321
	 */

	public static void main(String[] args) {
		// variable número
		int num;
		// escaner
		Scanner sc = new Scanner(System.in);

		// do while
		do {
			// pedimos al usuario número
			System.out.println("Introduce un número");
			// guardamos el número
			num = sc.nextInt();
		} while (num <= 0);
		// for para recorrer desde el 1 hasta el número que introducimos
		for (int i = 1; i <= num; i++) {

			// otro for dentro que no sé muy bien que hace pero es necesario
			for (int j = 1; j < i; j++) {

				// imprimimos por pantalla
				System.out.print(j);
			
			}
			for (int k = i; k > 0; k--) {

				// imprimimos por pantalla
				System.out.print(k);
			}

			// aqui imprimimos i con tabulador
			System.out.println();

		}

		// cerramos escaner
		sc.close();

	}
}
