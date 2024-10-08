package boletin_if_else;

import java.util.Scanner;

public class Ejercicio7 {
	/*
	 * Escribir una aplicación que indique cuántas cifras tiene un número
	 * introducido por teclado, que está comprendido entre 0 y 99999.
	 */
	public static void main(String[] args) {
		// creamos una variable para almacenar el número
		int num;
		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		// pedimos al usuario un número
		System.out.println("Introduce un número");
		// guardamos el valor en num
		num = sc.nextInt();

		// creamos un if para comprobar si el número tiene una cifras
		if (num >= 0 && num <= 9) {
			// mensaje que indica las cifras
			System.out.println("El número tiene 1 cifra");
		} else if (num >= 10 && num <= 99) {
			// mensaje que indica las cifras
			System.out.println("El número tiene 2 cifras");
		} else if (num >= 100 && num <= 999) {
			// mensaje que indica las cifras
			System.out.println("El número tiene 3 cifras");
		}else if(num>=1000&&num<=9999) {
			//mensaje que indica las cifras
			System.out.println("El número tiene 4 cifras");
		}else if(num>=10000&&num<=99999){
			//mensaje indica cifras
			System.out.println("El número tiene 5 cifras");
		}else {
			//mensaje de error de demasiadas cifras
			System.out.println("El número tiene demasiadas crifras");
		}
		//cerramos escaner
		sc.close();
	}

}
