package condicionales;

import java.util.Scanner;

public class Ejercicio2 {
	/*
	 * Utiliza un operador ternario para calcular el valor absoluto de un número que
	 * se solicita al usuario por teclado.
	 */

	/*
	 * Putas pruebas
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// creamos una variable donde guardar el número que usaremos
		int num;
		// creamos escaner
		Scanner sc = new Scanner(System.in);

		// pedimos un número al usuario
		System.out.println("Introduce un número");
		// guardamos el número
		num = sc.nextInt();

		// comprobamos que el número sea distinto de 0, porque con 0 no sé por qué no funciona
		if (num != 0) {
			// imprimimos por pantalla el valor absoluto del número introducido y
			// brujería....
			System.out.println(Math.abs(num));

		}else {
			System.out.println("La distancia a 0 de 0 es 0.");
		}
		sc.close();
	}

}
