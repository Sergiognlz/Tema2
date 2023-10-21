package ejerciciosDoWhile;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
public static void main(String[] args) {
	//creamos el comando random que nos dará un número aleatorio
	Random rand=new Random();
	//creamos comando escaner
	Scanner sc=new Scanner(System.in);
	int min=1, max=101,numero;
	//definimos una variable número con un valor random entre 1 y 101(porque el comando genera un valor que no toma el último).
	
	//creamos variables con cadena
	String mayor="Mayor", menor="Menor", si="Si", respuesta;
//Ponemos las instrucciones del juego
	System.out.println("Vamos a jugar a un juego. Piensa un número del 1 al 100. Voy a adivinarlo, así que indícame si es mayor o menor si no lo acierto.");
	//creamos el bucle
	do {
		numero=rand.nextInt(min,max);
		System.out.println("¿Es el "+numero+"?");
		respuesta=sc.nextLine();
		if(respuesta.equalsIgnoreCase(mayor)) {
			
			min=numero+1;
		}
		else if(respuesta.equalsIgnoreCase(menor)) {
			
			max=numero;
			
		}
	
	}while(!respuesta.equalsIgnoreCase(si)&& min!=max);
	System.out.println("¡He acertado!");
	sc.close();
	}
}
