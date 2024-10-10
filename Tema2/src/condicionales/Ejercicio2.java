package condicionales;

import java.util.Scanner;

public class Ejercicio2 {
	/*
	 * Utiliza un operador ternario para calcular el valor absoluto de un número que
	 * se solicita al usuario por teclado.
	 */

	/*
	 * Putas pruebas
	 * Entrada 		Esperado 		Resultado
	 * 0				0				0
	 * -15				15				15
	 * 30				30				30
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

		// comprobamos que el número sea distinto de 0 y si es negativo le hacemos el absoluto, de no ser así cogemos el número tal cual
		System.out.println(num=num<0?Math.abs(num):num);
		
		sc.close();
	}

}
