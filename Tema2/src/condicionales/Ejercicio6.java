package condicionales;

import java.util.Scanner;

public class Ejercicio6 {
	/*
	 * Dada una hora por teclado, (horas, minutos y segundos) realiza un algoritmo
	 * que muestre la hora después de incrementar un segundo.
	 */
	public static void main(String[] args) {
		//creamos variables para hora, minutos y segundos
		int hora;
		int min;
		int seg;
		//creamos escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos hora al usuario
		System.out.println("Introduce horas");
		//guardamos
		hora=sc.nextInt();
		//pedimos minutos
		System.out.println("Introduce minutos");
		//guardamos minutos
		min=sc.nextInt();
		//pedimos segundos
		System.out.println("Introduce segundos");
		//guardamos segundos
		seg=sc.nextInt();
		//controlamos rango entrada
		if((hora<0&&hora>23)||(min<0&&min>59)||(seg<0&&seg>59)) {
		//mensaje error
			System.out.println("El valor introducido está fuera del rango");
			
		}else {
			//si el rango es el correcto incrementamos un segundo
			seg++;
			//cuando los segundos son 59 se incrementan los minutos y se reinician los segundos
			if(seg>=59) {
				seg=0;
				min++;
			}
			//cuandos los minutos son 59 se incrementan las horas y se reinician los minutos
			if(min>=59) {
				min=0;
				hora++;
			}
			//cuando las horas son 23 se reinician minutos y horas 
			if(hora>=23) {
				hora=0;
				min=0;
			}
			//imprimimos horas, minutos y segundos
			System.out.println(hora+":"+min+":"+seg);
			
		}
		//cerramos escaner
		sc.close();
	}
}
