package boletindowhile;

import java.util.Scanner;

public class Ejercicio7 {
	/*
	 * Repetir el ejercicio de la calculadora del boletín de SWITCH de forma que se
	 * añada una opción más al menú, quedando el menú así: SUMAR LOS NÚMEROS RESTAR
	 * LOS NÚMEROS MULTIPLICAR LOS NÚMEROS DIVIDIR LOS NÚMEROS SALIR De forma que se
	 * vuelva a pedir los dos números y la operación a realizar hasta que se pulse
	 * la letra E para salir del programa.
	 */
	public static void main(String[] args) {
		// creamos dos variables donde guardar los números introducidos
		int num1;
		int num2;
		// creamos una variable donde guardar el carácter que se usará en el menú
		char menu;
		// creamos variables para cada operación
		int suma;
		int resta;
		int multi;
		double divi;
		// creamos escaner
		Scanner sc = new Scanner(System.in);
		//do while para que repita el proceso hasta salir del programa
		do {
		// pedimos al usuario los números
		System.out.println("Introduce el primer número");
		// guardamos el valor
		num1 = sc.nextInt();
		// segundo número
		System.out.println("Introduce el segundo número");
		// guardamos
		num2 = sc.nextInt();

		// definimos las operaciones
		suma = num1 + num2;
		resta = num1 - num2;
		multi = num1 * num2;
		divi = num1 / num2;

		// mostramos la selección del menú
		System.out.println("A. Sumar los números");
		System.out.println("B. Restar los números");
		System.out.println("C. Multiplicar los números");
		System.out.println("D. Dividir los números");
		System.out.println("E. Salir");
		// guardamos la opción introducida
		menu = sc.next().charAt(0);
		// creamos un menú con switch
		switch (menu) {
		case 'A' -> {
			System.out.println(suma);
		}
		case 'B' -> {
			System.out.println(resta);
		}
		case 'C' -> {
			System.out.println(multi);
		}
		case 'D' -> {
			System.out.println(divi);
		}
		case 'E' -> {
			
		}
		default -> {
			System.out.println("La opción elegida no existe");
		}
		};
		
		}while(menu!='E');
		//mensaje fin de programa
		System.out.println("Fin de programa");
		sc.close();
	}
}
