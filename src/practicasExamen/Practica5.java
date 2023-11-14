package practicasExamen;

import java.util.InputMismatchException;
import java.util.Scanner;
/*cuadrado silueta*/
public class Practica5 {
		public static void main(String[] args) {
			// variable número
			int numero =1;
			// escaner
			Scanner sc = new Scanner(System.in);
			// creo do whiel para hacer el try catch
			do {
				try {
					// pido número al usuario
					System.out.println("Introduce un número para la altura y base de la figura.");
					// guardo número
					numero = sc.nextInt();
					// pongo excepción
				} catch (InputMismatchException e) {
					// mensaje error
					System.out.println("El valor introducido no es válido.");
					// limpio escaner
					sc.nextLine();
				}
				// while de salida del bucle
			} while (numero <= 0);

			// creo el primer for
			for (int a = 0; a < numero; a++) {

				for (int b = 0; b < numero; b++) {
					
					if (a == 0 || a == numero - 1 || b == 0 || b == numero - 1) {
						System.out.print("*");
						System.out.print(" ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			sc.close();
		}
	}

