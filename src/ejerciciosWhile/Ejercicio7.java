package ejerciciosWhile;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		// creamos las variables que vamos a usar
		int numeroSecreto = (int) (Math.random() * 100), numero = 0;
		Scanner sc = new Scanner(System.in);

		// damos las instruciones del juego al usuario y le pedimos que introduzca un
		// número.
		System.out.println("Bienvenido al Número Secrero. ");
		System.out.println("Adivina un número del 1 al 100.");
		System.out.println("Para rendirte introduce un número negativo");

		System.out.println("Introduce un número");
		// leemos el número
		numero = sc.nextInt();

		// creamos bucle

		while (numero != numeroSecreto && numero < 0) {
			System.out.println("Introduce un número");
			// leemos el número
			numero = sc.nextInt();
			if (numero < 1 || numero > 100) {
				System.out.println("Número no válido. Introduce un número entre 1 y 100");
			} else if (numeroSecreto < numero) {
				System.out.println("El número secreto es menor que el introducido.");
			} else if (numeroSecreto < numero) {
				System.out.println("El número secreto es mayor que el introducido");
			} else if (numero <= 0) {
				System.out.println("Te has rendido. El número secreto era el " + numeroSecreto);
			} else {
				System.out.println("Enhorabuena, has adivinado el número secreto.");
			}

			// cerramos escaner
			sc.close();
		}
	}
}