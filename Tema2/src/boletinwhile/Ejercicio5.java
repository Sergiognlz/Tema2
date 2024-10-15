package boletinwhile;

import java.util.Scanner;

public class Ejercicio5 {
	/*
	 * Implementar una aplicación para calcular datos estadísticos de las edades de
	 * los alumnos de un centro educativo. Se introducirán datos hasta que uno de
	 * ellos sea negativo, y se mostrará: la suma de todas las edades introducidas,
	 * la media, el número de alumnos y cuántos son mayores de edad.
	 */

	public static void main(String[] args) {
		// creamos una variable para almacenar los números introducidos
		int num;
		// creamos variable para contar los números
		int cont = 0;
		// creamos variable donde almacenar la suma
		int suma = 0;
		// variable para la media de los negativos
		double media = 0;
		// variable para contar los mayores de edad
		int legal = 0;
		// creamos escaner
		Scanner sc = new Scanner(System.in);

		// pedimos número al usuario
		System.out.println("Introduce edades de los alumnos. Número negativo para finalizar el programa ");
		// guardamos el número
		num = sc.nextInt();
		// creamos bucle while para que mientras los números sean negativos se repita
		// las operaciones
		while (num >= 0) {
			// suma
			suma += num;
			// declaramos media
			media = (double) suma / cont;
			// if para contar ceros
			if(num>=18) {
				//contamos mayor de edad
				legal++;
			}

			// volvemos a pedir números al usuario
			System.out.println("Introduce edades de los alumnos. Número negativo para finalizar el programa ");
			// guardamos el número
			num = sc.nextInt();

			// incremento contador
			cont++;
		}
		// mostramos mensaje de fin de programa y mostrar operaciones
		System.out.println("Fin de programa. ");
		System.out.println("Suma edades= " + suma);
		System.out.println("Media edades= " + media);
		System.out.println("Mayores de edad= " + legal);
		// cerramos escaner
		sc.close();

	}
}
