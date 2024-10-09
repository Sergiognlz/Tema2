package boletinifelse;

import java.util.Scanner;

public class Ejercicio2 {

	/* Pedir dos números enteros y decir si son iguales o no. */

	public static void main(String[] args) {

		// creamos variable num1 y num2
		int num1;
		int num2;
		// creamos escaner
		Scanner sc = new Scanner(System.in);

		// pedimos primer número al usuario
		System.out.println("Introduce el primer número");
		// leemos el número
		num1 = sc.nextInt();
		// pedimos el segundo número
		System.out.println("Introduce el segundo número");
		// leemos el segundo número
		num2 = sc.nextInt();

		// creamos un if else para comprobar que el número sea igual
		if (num1 == num2) {
			// mensaje de son iguales
			System.out.println("Los números son iguales");
			// en caso contrario
		} else {
			// mensaje de no son iguales
			System.out.println("Los números no son iguales");

		}
		// cerramos escaner
		sc.close();
	}

}
