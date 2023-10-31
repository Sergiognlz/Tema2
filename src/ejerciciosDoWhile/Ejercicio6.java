package ejerciciosDoWhile;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		// creamos constantes
		final String PIEDRA = "Piedra", PAPEL = "Papel", TIJERA = "Tijera",S="S";
		// creamos las variables no constantes para cada jugada
		String jugada1, jugada2, menu;
		// creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//creamos el bucle que permitirá reiniciar el juego cuando este acabe
	do {
		// presentamos el juego con el menú dentro del primer bucle
		System.out.println("Bienvenido al juego de Piedra, Papel, Tijeras");
	//creamos otro bucle para la primera jugada
			do {
				//la pantalla debe ir dentro del bucle junto con la captura del escaner
				System.out.println("Introduce tu jugada, jugador 1");
				jugada1 = sc.nextLine();
			}while (!jugada1.equalsIgnoreCase(PIEDRA) && !jugada1.equalsIgnoreCase(PAPEL)
				&& !jugada1.equalsIgnoreCase(TIJERA));
		
		

				//creamos el siguiente bucle de la segunda jugada igual que la primera
			do {
			
				System.out.println("Introduce tu jugada, jugador 2");
				jugada2 = sc.nextLine();

			}while (!jugada2.equalsIgnoreCase(PIEDRA) && !jugada2.equalsIgnoreCase(PAPEL)
					&& !jugada2.equalsIgnoreCase(TIJERA));
			

		
		System.out.println("Jugador 1 jugó "+jugada1+", Jugador 2 jugó "+jugada2);
		// A contrinuación creamos las condiciones para cada combinación de jugadas 
		if (jugada1.equalsIgnoreCase(PIEDRA)&& jugada1.equalsIgnoreCase(PAPEL)&&jugada1.equalsIgnoreCase(TIJERA)&&jugada2.equalsIgnoreCase(PIEDRA)&&jugada2.equalsIgnoreCase(PAPEL)&&jugada2.equalsIgnoreCase(TIJERA)){
			//Mostramos el resultado de la jugada
			System.out.println("¡El jugador 2 gana!");
		}else if(jugada1.equalsIgnoreCase(PIEDRA)&&jugada2.equalsIgnoreCase(TIJERA)) {
			System.out.println("¡El Jugador 1 gana!");
		}else if(jugada1.equalsIgnoreCase(PIEDRA)&&jugada2.equalsIgnoreCase(PIEDRA)) {
			System.out.println("¡Empate!");
		}else if(jugada1.equalsIgnoreCase(PAPEL)&&jugada2.equalsIgnoreCase(PIEDRA)) {
			System.out.println("¡El Jugador 1 gana!");
		}else if(jugada1.equalsIgnoreCase(PAPEL)&&jugada2.equalsIgnoreCase(PAPEL)) {
			System.out.println("¡Empate!");
		}else if(jugada1.equalsIgnoreCase(PAPEL)&&jugada2.equalsIgnoreCase(TIJERA)) {
			System.out.println("¡El Jugador 2 gana!");
		}else if(jugada1.equals(TIJERA)&&jugada2.equals(PIEDRA)) {
			System.out.println("¡El Jugador 2 gana!");
		}else if(jugada1.equalsIgnoreCase(TIJERA)&&jugada2.equalsIgnoreCase(TIJERA)) {
			System.out.println("¡Empate!");
		}else if(jugada1.equalsIgnoreCase(TIJERA)&&jugada2.equalsIgnoreCase(PAPEL)) { 
			System.out.println("¡El Jugador 2 gana!");
		}
			System.out.println("¿Quieres volver a jugar? Si(Introduce S)/No");
		menu=sc.nextLine();
		
		
	}while(menu.equalsIgnoreCase(S));
		
		sc.close();
		
	}}
