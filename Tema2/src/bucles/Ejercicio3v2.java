package bucles;

import java.util.Scanner;

public class Ejercicio3v2 {
	/*
	 * Para dos números dados, a y b, es posible calcular el máximo común divisor
	 * (el número más grande que divide a ambos) mediante un algoritmo ineficiente
	 * pero sencillo: desde el menor de a y b, ir buscando, de forma decreciente
	 * (-1), el primer número que divide a ambos simultáneamente. Teniendo en cuenta
	 * lo que se acaba de explicar, realiza un programa que calcule el máximo común
	 * divisor de dos números.
	 */

	public static void main(String[] args) {
		// creamos variables para a y b
		int a;
		int b;
		// variable donde guardar el menor
		int menor = 0;
		// varable donde guardar el divisor
		int divi = 1;
		boolean enc=false;

		// escaner
		Scanner sc = new Scanner(System.in);

		// control de rango
		do {
			// pedimos número A
			System.out.println("Introduce número A");
			// guardamos
			a = sc.nextInt();
		} while (a < 0);
		do {
			// pedimos número B
			System.out.println("Introduce número B");
			// guardamos
			b = sc.nextInt();
		} while (b < 0);
// usamos un if else para definir cual es el mayor y el menor
		menor=Math.min(a, b);
		
		//hacemos un while que se repetirá hasta que lo encuentre y el booleano enc pase a ser true
		while (!enc) {
			//el if dividirá tanto el primer número como el segundo entre el menor de ellos y si es 0 entra.
			if(a%menor==0&&b%menor==0) {
				divi=menor;
				//imprimimos por pantalla
				System.out.println("El máximo común divisor es " + divi);
				enc=true;
			
			}
			menor--;
		}
		

		// cerramos escaner
		sc.close();
	}
}