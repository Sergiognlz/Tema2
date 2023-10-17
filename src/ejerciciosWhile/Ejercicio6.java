package ejerciciosWhile;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		// creamos las variables
		int suma = 0, numero, introducidos = 0, mayorEdad = 0;
		double media = 0;
		// creamos escaner
		Scanner sc = new Scanner(System.in);
		// pedimos al usuario que introduzca su edad
		System.out.println("Introduce una edad.");
		// leemos el número
		numero = sc.nextInt();
		// creamos el while
		while (numero >= 0) {
			introducidos++;
			media = (double) (suma += numero) / introducidos;
			System.out.println("Introduce otra edad. Valor negativo para detener el proceso");
			numero = sc.nextInt();
			// ahora cramos un while para contar los mayores de edad
			if (numero >= 18) {
				mayorEdad++;
			}
		}
		// creamos el mensaje que se mostrará cuando salga del bucle
		System.out.println("La suma de las edades es: " + suma);
		System.out.println("La media de las edades es: " + media);
		System.out.println("El número de alumnos es de: " + introducidos);
		System.out.println("Hay " + mayorEdad + " alumnos mayores de edad.");

		// cerramos escaner
		sc.close();
	}
}
