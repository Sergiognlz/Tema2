package ejerciciosDoWhile;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
public static void main(String[] args) {
	//creamos el comando random que nos dará un número aleatorio
	Random rand=new Random();
	//creamos comando escaner
	Scanner sc=new Scanner(System.in);
	//definimos una variable número con un valor random entre 1 y 101(porque el comando genera un valor que no toma el último).
	int numero=rand.nextInt(1,101);
	//creamos variables con cadena
	String mayor="Mayor", menor="Menor", si="Si", respuesta;
//Ponemos las instrucciones del juego
	System.out.println("Vamos a jugar a un juego. Piensa un número. Voy a adivinarlo");
	//creamos el bucle
	do {
		System.out.println("¿Es el "+numero+"?");
		respuesta=sc.nextLine();
		if(respuesta.equalsIgnoreCase(mayor)) {
			numero=rand.nextInt((numero+1),101);
		System.out.println("¿Es el "+numero+"?");
		respuesta=sc.nextLine();}
		else if(respuesta.equalsIgnoreCase(menor)) {
			numero=rand.nextInt(1,(numero-1));
		System.out.println("¿Es el "+numero+"?");
		respuesta=sc.nextLine();}
	
	}while(!respuesta.equalsIgnoreCase(si));
	System.out.println("¡He acertado parguela!");
	sc.close();
	}
}
