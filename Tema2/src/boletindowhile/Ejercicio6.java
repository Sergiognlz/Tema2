package boletindowhile;

import java.util.Scanner;

public class Ejercicio6 {
	/*
	 * Repetir el juego de PIEDRA - PAPEL - TIJERA pero con las siguientes
	 * consideraciones: Al jugador 1 se le pedirá que introduzca una opción válida:
	 * PIEDRA, PAPEL o TIJERA. Mientras no introduzca un valor válido se le seguirá
	 * preguntando. Al jugador 2 se le pedirá que introduzca una opción válida:
	 * PIEDRA, PAPEL o TIJERA. Mientras no introduzca un valor válido se le seguirá
	 * preguntando. Al terminar una partida se preguntará si se quiere seguir
	 * jugando. Mientras se pulse “S” se volverá a iniciar la partida.
	 */
	public static void main(String[] args) {

		// creamos dos variables para las jugadas
		String jugador1;
		String jugador2;
		// creamos constantes para piedra, papel y tijera
		final String PIEDRA = "Piedra";
		final String PAPEL = "Papel";
		final String TIJERA = "Tijera";
		// creamos char
		char respuesta = 'S';
		// creamos escaner
		Scanner sc = new Scanner(System.in);

		do {
			// creamos do while para regular el valor de entrada.
			do {
				// pedimos la jugada al jugar 1
				System.out.println("Jugador 1: Piedra, Papel, Tijera. Elije tu jugada.");
				// guardamos la jugada
				jugador1 = sc.nextLine();
			} while (!jugador1.equalsIgnoreCase(TIJERA) && !jugador1.equalsIgnoreCase(PAPEL)
					&& !jugador1.equalsIgnoreCase(PIEDRA));

			// repetimos
			do {
				// pedimos la jugada al jugar 1
				System.out.println("Jugador 2: Piedra, Papel, Tijera. Elije tu jugada.");
				// guardamos la jugada
				jugador2 = sc.nextLine();
			} while (!jugador2.equalsIgnoreCase(TIJERA) && !jugador2.equalsIgnoreCase(PAPEL)
					&&  !jugador2.equalsIgnoreCase(PIEDRA));

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

			// preguntamos si quiere seguir jugando
			System.out.println("¿Quieres seguir jugando? (S para repetir");
		} while (respuesta == 'S');
		sc.close();
	}
}
