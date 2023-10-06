package tema2;

import java.util.Scanner;

public class Ejercicio9 {
public static void main(String[] args) {
	//creamos  constantes para cada figura
	final String PIEDRA="Piedra";
	final String PAPEL= "Papel";
	final String TIJERA= "Tijera"; 
	//creamos variables para cada jugador
	String jugada1, jugada2;
	// creamos escanner
	Scanner sc=new Scanner(System.in);
	
	//pedimnos al usuario que introduzca la primera jugada
	System.out.println("Jugador 1, introduce tu jugada");
	//leemos la jugada 1
	jugada1=sc.nextLine();
	//pedimos al usuario que introduzca la segunda jugada
	System.out.println("Jugador 2, introduce tu jugada");
	//leemos la jugada 2
	jugada2=sc.nextLine();
	//añadimos un texto informativo
	System.out.println("Jugador 1 jugó "+jugada1+", Jugador 2 jugó "+jugada2);
	// A contrinuación creamos las condiciones para cada combinación de jugadas
	if (jugada1.equals(PIEDRA)&& jugada2.equals(PAPEL)){
		//Mostramos el resultado de la jugada
		System.out.println("¡El jugador 2 gana!");
	}else if(jugada1.equals(PIEDRA)&&jugada2.equals(TIJERA)) {
		System.out.println("¡El Jugador 1 gana!");
	}else if(jugada1.equals(PIEDRA)&&jugada2.equals(PIEDRA)) {
		System.out.println("¡Empate!");
	}else if(jugada1.equals(PAPEL)&&jugada2.equals(PIEDRA)) {
		System.out.println("¡El Jugador 1 gana!");
	}else if(jugada1.equals(PAPEL)&&jugada2.equals(PAPEL)) {
		System.out.println("¡Empate!");
	}else if(jugada1.equals(PAPEL)&&jugada2.equals(TIJERA)) {
		System.out.println("¡El Jugador 2 gana!");
	}else if(jugada1.equals(TIJERA)&&jugada2.equals(PIEDRA)) {
		System.out.println("¡El Jugador 2 gana!");
	}else if(jugada1.equals(TIJERA)&&jugada2.equals(TIJERA)) {
		System.out.println("¡Empate!");
	}else if(jugada1.equals(TIJERA)&&jugada2.equals(PAPEL)) {
		System.out.println("¡El Jugador 2 gana!");
	}else {
		System.out.println("ERROR. Introduce Piedra, Papel o Tijeras");
		
		//cerramos escaner
		sc.close();
		
	}
	
	
	
	
	
}
}
