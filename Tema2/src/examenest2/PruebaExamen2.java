package examenest2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class PruebaExamen2 {
	/*
	 * Juego de adivinar el número entero 1 y 100. Piensas un número y la máquina te
	 * lo intenta adivinar. Tu le vas diciendo si es mayor, menor o ha acertado.
	 * Además tienes que controlar el valor de entrada
	 */
	public static void main(String[] args) {
		// creamos variable donde almacenar el número generado aleatoriamente
		int num;
		// variables auxiliares para mayor y menor
		int mayor = 101;
		int menor = 1;
		// variable respuesta
		String res = "";
		// booleano de control de errores
		boolean error = false;
		// booleano encontrado
		boolean enc = false;
		// creamos objeto random
		Random rand = new Random();
		// creamos objeto escaner
		Scanner sc = new Scanner(System.in);

		// mostramos instrucciones de juego por pantalla
		System.out.println("Hola vamos a jugar a adivinar el número.");
		System.out.println("Piensa un número entero entre 1 y 100 y yo intentaré adivinarlo");
		System.out.println("Te sugeriré un número y tendrás que indicarme si es mayor, menor o he acertado.");
		System.out.println("¡Vamos a jugar!");

		// do while para repetir las operaciones hasta que lo adivine
		do {
			// generamos un número aleatorio
			num = rand.nextInt(menor, mayor);
			// do while para controlar valores de entrada

			// mostramos por pantalla el número
			System.out.println("Es este tu número: " + num);
			System.out.println("(Mayor/Menor/Correcto)");
			// guardamos la respuesta
			res = sc.next();

			// comprobamos resultados
			if (res.equalsIgnoreCase("Mayor")) {
				// si el número es mayor, le decimos que el nuevo menor será igual al número
				// generado más 1
				menor = num + 1;
			} else if (res.equalsIgnoreCase("Menor")) {
				// si el número es menor, le decimos que el nuevo mayor será igual al número
				// generado
				mayor = num;
			} else if (res.equalsIgnoreCase("Correcto")) {
				// en caso contrario habremos acertado. Ponemos enc a true
				enc = true;
			} else {
				System.out.println("Has introducido una respuesta incorrecta. ");
			}
			sc.nextLine();
		} while (!enc);
		System.out.println("¡He acertado! El número es: " + num);
		sc.close();
	}
}
