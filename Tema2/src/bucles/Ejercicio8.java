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
			//un if para actuar de distinta manera dependiendo del valor introducido
			if (num >= mayor) {
				//si el número introducido es mayor o igual que el mayor introducido hasta el momento se asigna como nuevo valor mayor
				mayor = num;
				//se incrementa el contador
				cont++;
			//si el número es 0 no se incrementa contador ni fallados, y sale del bucle
			} else if (num == 0) {
				//en cualquier otro caso (que número introducido sea menor que el valor mayor) se cuenta el número, y además se cuenta como fallado
			} else {
				cont++;
				fallados++;
			}
		} while (num != 0);
		//imprimimos resultados
		System.out.println("A. Total de números introducidos: " + cont);
		System.out.println("B. Números fallados " + fallados);
		//cerramos escaner
		sc.close();
	}
}
