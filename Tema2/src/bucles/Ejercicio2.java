package bucles;

import java.util.Scanner;

public class Ejercicio2 {
	/*
	 * Realiza un programa que nos pida un número n y nos diga cuántos números hay
	 * entre 1 y n que sean primos.
	 */
	public static void main(String[] args) {
		// variable número
		int num;
		// contador primos
		int primos = 0;
		//booleano de control de primos
		boolean primo = true;
		// escaner
		Scanner sc = new Scanner(System.in);

		// do while para controlar el rango entrada
		do {
			// pedimos número al usuario
			System.out.println("Introduce un número");
			// guardamos el valor
			num = sc.nextInt();
		} while (num <= 2);
		//usamos el primer for para contar del 2 al número insertado
		for (int i = 2; i <= num; i++) {
			//el segundo contará desde 2 hasta la iteracción del for anterior
			for (int j = 2; j < i; j++) {
				// if para que cuando el módulo del número a comprobar sea divisible 
				if (i % j == 0) {
					//si tiene divisor no será primo
					primo = false;
					//por lo tanto salimos del bucle
					break;
					//else cuando comprobemos que no es divisible por ningún número
				} else {
					//con lo que será primo
					primo = true;
				}
			}
			//si es primo
			if (primo) {
				//incrementamos
				primos++;
			}
		}
		// imprimimos resultado
		System.out.println("Hay " + primos + " números primos");
		// cerramos escaner
		sc.close();

	}
}
