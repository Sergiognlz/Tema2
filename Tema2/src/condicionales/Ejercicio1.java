package condicionales;

import java.util.Scanner;

public class Ejercicio1 {
	/*
	 * Escribe una aplicación que solicite al usuario un número comprendido entre 0
	 * y 9999. La aplicación tendrá que indicar si el número introducido es capicúa.
	 * Un número es capicúa si se lee igual de izquierda a derecha que de derecha a
	 * izquierda.
	 */

	/*
	 * Putas pruebas Entrada Esperado Resultado 10000 fuera rango fuera rango 1
	 * capicúa capicúa 21 no capicúa no capicúa 212 capicúa capicúa 3212 no capicúa
	 * no capicúa 2882 capicúa capicúa
	 */

	public static void main(String[] args) {

		// vamos a crear variables para unidades, decenas, centenas y millares
		int unidades;
		int decenas;
		int centenas;
		int millares;
		// una variable para guardar el número
		int num;
		// creamos escaner
		Scanner sc = new Scanner(System.in);

		// pediremos un número al usuario
		System.out.println("Introduce un número en 0 y 9999");
		// recogermos el número
		num = sc.nextInt();
		// vamos a controlar el rango de números de entrada con un if else
		if (num >= 0 && num <= 9999) {

			// vamos a comprobar que el número solo tenga una cifra con un if que regule el
			// rango de entrada
			if (num >= 0 && num <= 9) {
				// el número tiene una cifra y por tanto es capicúa
				System.out.println("El número es capicúa");
				// comprobamos con un else if que controle el rango si el dos cifras
			} else if (num >= 10 && num <= 99) {

				// hacemos el módulo 10 del número para obtener las unidades
				unidades = num % 10;
				// dividimos el número por 10 para obtener las decenas
				decenas = num / 10;
				// comprobamos si ambos son iguales con otro if interior
				if (unidades == decenas) {
					// el número es capicúa por lo tanto lo mostramos por mensaje
					System.out.println("El número es capicúa");
					// en caso contrario no será capicúa
				} else {
					// mensaje de no es capicúa
					System.out.println("No es capicúa");
				}
				// comprobamos que el número tenga 3 cifras con otro else if que controle el
				// rango de entrada
			} else if (num >= 100 && num <= 999) {
				// sacamos las unidades con módulo de 10 al número
				unidades = num % 10;
				// sacamos las centenas dividiendo número por 100
				centenas = num / 100;

				// ahora con otro if interior comprobamos si coinciden unidades y centenas
				if (unidades == centenas) {
					// si coinciden es capicúa
					System.out.println("Es capicúa");
					// en caso contrario no lo es
				} else {
					// mesanje no es capicúa
					System.out.println("No es capicúa");
				}
				// comprobamos que el número tiene 4 cifras
			} else if (num >= 1000 && num <= 9999) {
				// obtenemos las unidades
				unidades = num % 10;
				// obtenemos las decenas haciendo un módulo de 100 y dividiendo el resultado por
				// 10 para quedarnos con la primera cifra
				decenas = num % 100 / 10;
				// obtenemos las centenas dividiendo por 100 y luego haciendo el módulo de 10
				// para quedarnos con la última cifra
				centenas = (num / 100) % 10;
				// obtenemos los millares dividiendo por 1000
				millares = num / 1000;
				// mediante un if interior comprobamos que unidades y millares sean iguales y
				// que decenas y centenas también.
				if (unidades == millares && decenas == centenas) {
					// si cumple la condición el número será capicúa
					System.out.println("El número es capicúa");
				} else {
					// sino cumple no lo será
					System.out.println("El número no es capicúa");
				}

			} else {
				// mensaje de error
				System.out.println("El número introducido está fuera del rango permitido");

			}
		}
	}
}
