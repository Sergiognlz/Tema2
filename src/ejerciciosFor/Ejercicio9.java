package ejerciciosFor;

import java.util.Scanner;

//Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no.
public class Ejercicio9 {
	public static void main(String[] args) {
		// creamos las variables
		int numero;
		boolean primo=true, noprimo=false;
		// creamos escaner
		Scanner sc = new Scanner(System.in);
		// pedimos un número al usuario
		System.out.println("Introduce un número");
		// guardamos el número introducido
		numero = sc.nextInt();
		if (numero != 1) {
			for (int i = 2; i <= numero / 2; i++) {
				if (numero % i == 0) {
					primo = true;
				} else {
					primo = false;
				}
			}
			if (primo==false) {
				System.out.println("No es primo");
			}

			else {
				System.out.println("Es primo");

			}
			sc.close();
		}
	}
}