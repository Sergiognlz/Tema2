package boletinwhile;

import java.util.Scanner;

public class Ejercicio2 {
	/*
	 * Escribe un programa que vaya pidiendo al usuario números enteros positivos que
	 * debe ir contando. Cuando el usuario no quiera insertar más números,
	 * introducirá un número negativo y el algoritmo, antes de acabar, mostrará la
	 * cantidad de números positivos introducidos por el usuario.
	 */
	
	public static void main(String[] args) {
		//creamos una variable para almacenar los números introducidos
		int num;
		//creamos variable para contar los positivos
		int posit=0;
		//creamos escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos número al usuario
		System.out.println("Introduce un número positivo  o uno negativo para acabar el programa ");
		//guardamos el número
		num=sc.nextInt();
		//creamos bucle while para que mientras los números sean negativos se repita las operaciones
		while(num>=0) {
			posit++;
			//volvemos a pedir números al usuario
			System.out.println("Introduce un número positivo o uno negativo para acabar el programa ");
			//guardamos el número
			num=sc.nextInt();
		}
		//mostramos mensaje de fin de programa y suma
		System.out.println("Fin de programa. Números positivos introducidos= "+posit);
		//cerramos escaner
		sc.close();
	}
}
