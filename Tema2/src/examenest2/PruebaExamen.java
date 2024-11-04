package examenest2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class PruebaExamen {
	/*
	 * Hacer pedir un número y generar otro de manera aleatoria y mediante un menú
	 * mostrar las siguientes operaciones A. Máximo común divisor B. Mínimo común
	 * múltiplo C. Si es o no capicúa D. Las cifras que tiene E. Salir (fin de
	 * programa). Añadir control de entrada con try catch y assert. Los parámetros
	 * de entrada son número entero mayor que 0
	 */

	public static void main(String[] args) {
		// variables que vamos a usar
		int num1 = 0;
		int num2 = 0;
		int mayor;
		int menor;
		int divi;

		String opcion;

		// booleano de control de entrada
		boolean error = false;
		boolean enc = false;
		// objeto random
		Random rand = new Random();
		// objeto escanner
		Scanner sc = new Scanner(System.in);

		// do while para controlar el rango de entrada
		do {
			// control de errores
			try {
				// pedimos número al usuario
				System.out.println("Introduce un número entero mayor que 0.");
				// lo guardamos
				num1 = sc.nextInt();
				// control de aserciones
				assert num1 > 0 : "El número debe ser un entero mayor de 0";
				// generamos un número aleatorio entre 1 y 100
				num2 = rand.nextInt(1, 101);
				// error es false
				error = false;
				// capturamos los posibles errores
			} catch (AssertionError e) {
				// mostramos mensaje de error
				System.out.println(e.getMessage());
				// error es true
				error = true;
			} catch (InputMismatchException e) {
				// mostramos otro mensaje de error
				System.out.println("El valor introducido no es correcto");
				// error es true
				error = true;
			} finally {
				// limpiamos escaner
				sc.nextLine();
			}

			// salimos del bucle
		} while (error);

		System.out.println("Seleciona un menú:");
		System.out.println("A. Máximo común divisor");
		System.out.println("B. Mínimo común múltiplo");
		System.out.println("C. Saber si el número es capicúa");
		System.out.println("D. Número de cifras del número");
		System.out.println("E. Salir");

		opcion = sc.nextLine();

		switch (opcion) {
		case "A" -> {
			menor = Math.min(num1, num2);
			
			
			while (!enc) {
				
				if(num1%menor==0&&num2%menor==0) {
					divi=menor;
					System.out.println("El máximo común divisor es: "+divi);
					enc=true;
				}
				menor--;
			}
			
		}
		}

		System.out.println(num1);
		System.out.println(num2);
		// cerramos escaner
		sc.close();

	}
}
