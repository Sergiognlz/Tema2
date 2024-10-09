package boletinifelse;

import java.util.Scanner;

public class Ejercicio9 {
	/*
	 * Escribir un programa que simule el juego de PIEDRA, PAPEL, TIJERA, pidiendo a
	 * cada jugador que escriba PIEDRA, PAPEL o TIJERA. El juego debe mostrar por
	 * pantalla quién ha ganado el juego tras jugar una partida. Hay que contemplar
	 * el caso de que empaten.
	 */

	public static void main(String[] args) {

		// creamos dos variables para las jugadas
		String jugador1;
		String jugador2;
		// creamos constantes para piedra, papel y tijera
		final String PIEDRA = "Piedra";
		final String PAPEL = "Papel";
		final String TIJERA = "Tijera";
		// creamos escaner
		Scanner sc = new Scanner(System.in);

		// pedimos la jugada al jugar 1
		System.out.println("Jugador 1: Piedra, Papel, Tijera. Elije tu jugada.");
		// guardamos la jugada
		jugador1 = sc.nextLine();
		// pedimos la jugada al jugar 1
		System.out.println("Jugador 2: Piedra, Papel, Tijera. Elije tu jugada.");
		// guardamos la jugada
		jugador2 = sc.nextLine();

		// creamos concatenación de if else para cada resultado.
		if (jugador1.equalsIgnoreCase(PIEDRA) && jugador2.equalsIgnoreCase(PIEDRA)) {
			System.out.println("Jugador 1: " + jugador1);
			System.out.println("Jugador 2: " + jugador2);
			System.out.println("¡Empate!");
		} else if (jugador1.equalsIgnoreCase(PAPEL) && jugador2.equalsIgnoreCase(PAPEL)) {
			System.out.println("Jugador 1: " + jugador1);
			System.out.println("Jugador 2: " + jugador2);
			System.out.println("¡Empate!");
		} else if (jugador1.equalsIgnoreCase(TIJERA) && jugador2.equalsIgnoreCase(TIJERA)) {
			System.out.println("Jugador 1: " + jugador1);
			System.out.println("Jugador 2: " + jugador2);
			System.out.println("¡Empate!");
		} else if (jugador1.equalsIgnoreCase(PIEDRA) && jugador2.equalsIgnoreCase(PAPEL)) {
			System.out.println("Jugador 1: " + jugador1);
			System.out.println("Jugador 2: " + jugador2);
			System.out.println("¡Jugador 2 gana!");
		} else if (jugador1.equalsIgnoreCase(PIEDRA) && jugador2.equalsIgnoreCase(TIJERA)) {
			System.out.println("Jugador 1: " + jugador1);
			System.out.println("Jugador 2: " + jugador2);
			System.out.println("¡Jugador 1 gana!");
		} else if (jugador1.equalsIgnoreCase(PAPEL) && jugador2.equalsIgnoreCase(PIEDRA)) {
			System.out.println("Jugador 1: " + jugador1);
			System.out.println("Jugador 2: " + jugador2);
			System.out.println("¡Jugador 1 gana!");
		} else if (jugador1.equalsIgnoreCase(PAPEL) && jugador2.equalsIgnoreCase(TIJERA)) {
			System.out.println("Jugador 1: " + jugador1);
			System.out.println("Jugador 2: " + jugador2);
			System.out.println("¡Jugador 2 gana!");
		} else if (jugador1.equalsIgnoreCase(TIJERA) && jugador2.equalsIgnoreCase(PIEDRA)) {
			System.out.println("Jugador 1: " + jugador1);
			System.out.println("Jugador 2: " + jugador2);
			System.out.println("¡Jugador 2 gana!");
		} else if (jugador1.equalsIgnoreCase(TIJERA) && jugador2.equalsIgnoreCase(PAPEL)) {
			System.out.println("Jugador 1: " + jugador1);
			System.out.println("Jugador 2: " + jugador2);
			System.out.println("¡Jugador 1 gana!");
		}
		sc.close();
	}
}
