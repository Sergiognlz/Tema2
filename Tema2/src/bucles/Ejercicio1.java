package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
	/*
	 * Escribe un programa que incremente la hora de un reloj. Se pedirán por
	 * teclado: Hora Minutos Segundos Cantidad de segundos a incrementar La
	 * aplicación debe mostrar la nueva hora. Por ejemplo, si el usuario introduce
	 * hora=13, minutos=59 y segundos=51, y se desea incrementar en 10 segundos, el
	 * resultado a mostrar es 14:00:01.
	 */
	
	/*Pruebas
	 * Entrada			Esperado			Obtenido
	 * 23:59:59 10		0:0:9				0:0:9
	 * 
	 * 
	 * */

	public static void main(String[] args) {
		// variable horas, minutos y segundos
		int horas=0;
		int min=0;
		int seg=0;
		int inc=0;
		boolean error=false;
		// escaner
		Scanner sc = new Scanner(System.in);

		// do while para controlar que los valores introducidos estén dentro del rango
		// deseado
		do {
			try {
			// pedimos las horas al usuario
			System.out.println("Introduce las horas");
			// guardamos las horas
			horas = sc.nextInt();
			assert(horas > 0 && horas < 23):"La hora introducida está fuera de rango";
			error=false;
			}catch(AssertionError e) {
				System.out.println(e.getMessage());
			error=true;
			}catch(InputMismatchException e){
				System.out.println("El valor introducido no es válido");
				error=true;
			}finally {
			sc.nextLine();
			}
			// condición de salida
		} while (error);

		// otro do while para los minutos
		do {
			// pedimos las horas al usuario
			System.out.println("Introduce las minutos");
			// guardamos las minutos
			min = sc.nextInt();
			// condición de salida
		} while (min < 0 || min > 60);

		// otro do while para segundos
		do {
			// pedimos las horas al usuario
			System.out.println("Introduce las segundos");
			// guardamos las horas
			seg = sc.nextInt();
			// condición de salida
		} while (seg < 0 || seg > 60);

		// pedimos segundos a incrementar
		do {
			// pedimos las horas al usuario
			System.out.println("Introduce los segundos a incrementar");
			// guardamos las horas
			inc = sc.nextInt();
			// condición de salida
		} while (inc < 0 || inc > 60);

		// for para ir incrementando de uno en uno los segundos
		for (int i = 1; i <= inc; i++) {
			seg++;
			if (seg >= 60) {
				seg = 0;
				min++;
				if (min >= 60) {
					min = 0;
					horas++;
				}
				if (horas >= 24) {
					horas = 0;

				}
			}
		}
		// imprimimos resultado
		System.out.println(horas + ":" + min + ":" + seg);
		// cerramos escaner
		sc.close();
	}
}
