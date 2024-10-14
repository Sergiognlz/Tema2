package condicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
	/*
	 * Realiza el “juego de la suma”, que consiste en que aparezcan dos números
	 * aleatorios (comprendidos entre 1 y 99) y el usuario tiene que sumarlos. La
	 * aplicación le pedirá al usuario que introduzca el resultado de la suma. La
	 * aplicación le indicará si el resultado es correcto o no.
	 */

	public static void main(String[] args) {
		//clase random
		Random rand=new Random();
		// creamos dos variables para almacenar los números aleatorios mediante un
		// math.random. Es necesario castear porque genera double y sumar uno para eviar
		// el 0
		int num1 = rand.nextInt(1,100);
		int num2 = rand.nextInt(1,100);
		// creamos una variable donde almacenar el número que introducirá el usuario
		int respuesta;
		// creamos escaner
		Scanner sc = new Scanner(System.in);
		
		//pedimos al usuario que adivine la suma
		System.out.println("Adivina la suma de dos números al azar entre 1 y 99");
		//guardamos el número el usuario
		respuesta=sc.nextInt();
		//controlamos el rango
		if((num1<0&&num1>198)&& num2<0&&num1>198) {
			System.out.println("El número introducido está fuera de rango");
		}
		
		//si la respuesta coincide con la suma habrá acertado el juego
		if((num1+num2)==respuesta) {
			//mensaje
			System.out.println("Número 1: "+num1);
			System.out.println("Número 2: "+num2);
			System.out.println("¡Has acertado!");
			
		}else {
			//mensaje de fallo
			System.out.println("Número 1: "+num1);
			System.out.println("Número 2: "+num2);
			System.out.println("No has acerdado la suma de los números");
		}
	
		sc.close();
	}
}
