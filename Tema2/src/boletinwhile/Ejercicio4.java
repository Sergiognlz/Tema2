package boletinwhile;

import java.util.Scanner;

public class Ejercicio4 {
	/*
	 * Escribe un algoritmo que pida al usuario 10 números enteros (pueden ser
	 * positivos, negativos o cero). Cuando acabe de insertar los números, el
	 * algoritmo debe mostrar la suma de los números positivos, la media de los
	 * números negativos y el número de ceros que ha introducido el usuario.
	 */

	public static void main(String[] args) {
		// creamos una variable para almacenar los números introducidos
		int num;
		// creamos variable para contar los números
		int cont = 1;
		// creamos variable donde almacenar la suma
		int suma = 0;
		// variable para resta;
		int resta = 0;
		//variable para contar resta
		int contRes=0;
		// variable para la media de los negativos
		double media = 0;
		// variable para contar los ceros
		int ceros = 0;
		// creamos escaner
		Scanner sc = new Scanner(System.in);

	
		// creamos bucle while para que mientras los números sean negativos se repita
		// las operaciones
		while (cont <= 10) {
			// pedimos número al usuario
			System.out.println("Introduce 10 números ");
			// guardamos el número
			num = sc.nextInt();

			// creamos if para los negativos
			if (num < 0) {
				contRes++;
				// resta
				resta += num;
				// declaramos media
				media = (double) resta / contRes;
				// if para contar ceros
			} else if (num > 0) {
				// suma
				suma += num;
			} else {
				ceros++;
			}

			// incremento contador
			cont++;
		}
		// mostramos mensaje de fin de programa y mostrar operaciones
		System.out.println("Fin de programa. ");
		System.out.println("Suma positivos= " + suma);
		System.out.println("Media negativos= " + media);
		System.out.println("Número de ceros= " + ceros);
		// cerramos escaner
		sc.close();

	}
}
