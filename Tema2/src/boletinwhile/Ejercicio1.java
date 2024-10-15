package boletinwhile;

import java.util.Scanner;

public class Ejercicio1 {
	/*
	 * Escribe un programa que vaya pidiendo al usuario números enteros positivos
	 * que debe ir sumando. Cuando el usuario no quiera insertar más números,
	 * introducirá un número negativo y el algoritmo, antes de acabar, mostrará la
	 * suma de los números positivos introducidos por el usuario.
	 */
	
	public static void main(String[] args) {
		//creamos variable donde guardaremos el número introducido
		int num;
		//creamos una variable para almacenar la suma
		int suma=0;
		//creamos escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos número al usuario
		System.out.println("Introduce un número positivo para sumar o uno negativo para acabar el programa y mostrar resultado");
		//guardamos el número
		num=sc.nextInt();
		//creamos bucle while para que mientras los números sean negativos se repita las operaciones
		while(num>=0) {
			//sumamos los números
			suma+=num;
			//volvemos a pedir números al usuario
			System.out.println("Introduce un número positivo para sumar o uno negativo para acabar el programa y mostrar resultado");
			//guardamos el número
			num=sc.nextInt();
		}
		//mostramos mensaje de fin de programa y suma
		System.out.println("Fin de programa. Suma= "+suma);
		//cerramos escaner
		sc.close();
	}
}
