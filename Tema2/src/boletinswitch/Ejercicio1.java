package boletinswitch;

import java.util.Scanner;

public class Ejercicio1 {
	/*
	 * Pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma:
	 * insuficiente (de 0 a 4), suficiente (5), bien (6), notable (7 y 8) y
	 * sobresaliente (9 y 10).
	 */

	public static void main(String[] args) {
		// creamos una variable donde almacenar la nota introducido
		int nota;
		// creamos escaner
		Scanner sc = new Scanner(System.in);

		// pedimos al usuario la nota
		System.out.println("Introduce la nota");
		// guardamos el valor
		nota = sc.nextInt();
		// creamos un swtich mostrar un mensaje con cada valor
		switch (nota) {
		case 0, 1, 2, 3, 4 -> System.out.println("Suspenso");
		case 5->System.out.println("Suficiente");
		case 6->System.out.println("Bien");
		case 7,8->System.out.println("Notable");
		case 9,10->System.out.println("Sobresaliente");
		}
		sc.close();
	}
}
