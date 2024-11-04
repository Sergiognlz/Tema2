package examenest2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
	/*
	 * Escribe un programa que pida por teclado un número entero mayor o igual que 0
	 * y determine cuántas de sus cifras son pares y cuántas son impares:
	 */

	public static void main(String[] args) {
		// variable para guardar el número
		int num=1;
		//variable auxiliar
		int aux;
		//contadores pares e impares
		int pares=0;
		int impares=0;
		// booleano de control
		boolean error = false;
		// escaner
		Scanner sc = new Scanner(System.in);

		// controlamos rango de entrada
		do {
			try {
				// pedimos número al usuario
				System.out.println("Introduce un número entero superior a 0");
				// guardamos número
				num = sc.nextInt();
				assert (num > 0) : "El número introducido debe ser un entero superior a 0";
				error=false;
			} catch (AssertionError e) {
				System.out.println(e.getMessage());
				error=true;
			} catch (InputMismatchException e) {
				System.out.println("El valor introducido no es válido");
				error=true;
			} finally {
				sc.nextLine();
			}
		} while (error);
		
		while(num!=0) {
			aux=num%10;
			if(aux%2==0) {
				pares++;
			}else {
				impares++;
			}
			num=num/10;
			
		}
		System.out.println("Cifras pares: "+pares);
		System.out.println("Cifras impares: "+impares);
		sc.close();
	}
}
