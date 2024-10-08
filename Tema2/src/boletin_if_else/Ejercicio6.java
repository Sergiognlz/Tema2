package boletin_if_else;

import java.util.Scanner;

public class Ejercicio6 {
	/*
	 * Pedir los coeficientes de una ecuación de segundo grado y mostrar sus
	 * soluciones reales. Si no existen, habrá que indicarlo. Hay que tener en
	 * cuenta que las soluciones de una ecuación de segundo grado ax2 + bx + c = 0
	 * se calculan de la siguiente forma:
	 * 
	 */

	public static void main(String[] args) {
		// creamos varible para a, b y c
		int a;
		int b;
		int c;
		// creamos una variable para el discriminenta
		double dis;
		// creamos dos variables para cada resultado de x
		double x1;
		double x2;
		// creamos escaner
		Scanner sc = new Scanner(System.in);

		// pedimos al usuario a
		System.out.println("Introduce el valor de a");
		// guardamos el valor
		a = sc.nextInt();
		// pedimos al usuario b
		System.out.println("Introduce el valor de b");
		// guardamos el valor
		b = sc.nextInt();
		// pedimos al usuario c
		System.out.println("Introduce el valor de c");
		// guardamos el valor
		c = sc.nextInt();

		// definimos el discriminante
		dis = (b * b) - 4 * a * c;
		// creamos una excepción para cuando a vale 0 con un if else
		if (a == 0) {
			// definimos el valor de x
			x1 = -c / (double)b;
			// imprimimos por pantalla el resultado
			System.out.println("Resultado: " + x1);
		} else {
			if (dis > 0) {

				// definimos x1
				x1 = (-b + Math.sqrt(dis)) /( 2 * a);
				// definimos x2
				x2 = (-b - Math.sqrt(dis)) / (2 * a);
				// mostramos por pantalla las dos soluciones
				System.out.println("x1=" + x1);
				System.out.println("x2=" + x2);
			} else {
				// mensaje de error
				System.out.println("La ecuación no tiene solución");
			}
			// cerramos escaner
			sc.close();

		}
	}
}
