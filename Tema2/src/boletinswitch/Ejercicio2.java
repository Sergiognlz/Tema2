package boletinswitch;

import java.util.Scanner;

public class Ejercicio2 {
	/*
	 * Idear un programa que solicite al usuario un número comprendido entre 1 y 7,
	 * correspondiente a un día de la semana. Se debe mostrar el nombre del día de
	 * la semana al que corresponde. Por ejemplo, el número 1 corresponde a “Lunes”
	 * y el 6 a “Sábado”.
	 */
	public static void main(String[] args) {
		//creamos variable día
		int dia;
		//creamos escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos el día al usuario
		System.out.println("Introduce un día de la semana comprendido entre 1 y 7");
		//guardamos el valor introducido
		dia=sc.nextInt();
		
		//creamos un switch para devolver un mensaje con el día de la semana
		switch(dia) {
		case 1->System.out.println("Lunes");
		case 2->System.out.println("Martes");
		case 3->System.out.println("Miércoles");
		case 4->System.out.println("Jueves");
		case 5->System.out.println("Viernes");
		case 6->System.out.println("Sábado");
		case 7->System.out.println("Domingo");
		default->System.out.println("Valor introducido incorrecto");
		}
		sc.close();
	}
}
