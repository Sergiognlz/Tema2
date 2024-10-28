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
		// contador
		int primos =1;
		boolean primo=false;
		// escaner
		Scanner sc = new Scanner(System.in);

		// do while para controlar el rango entrada
		do {
			// pedimos número al usuario
			System.out.println("Introduce un número");
			// guardamos el valor
			num = sc.nextInt();
		} while (num <= 2);
		for (int i = 3; i <= num; i++) {
			
			
			
			
			for (int j = 1; j < i; ) {
				j++;
				// if cuando el número sea divisible por el número
				if (i % j == 0) {
					primo=false;
				
				}else {
				primo=true;	
				}
					
			
				
			}
			if(primo) {
				primos++;
			}
		}
		// imprimimos resultado
		System.out.println("Hay " + primos + " números primos");
		// cerramos escaner
		sc.close();

	}
}
