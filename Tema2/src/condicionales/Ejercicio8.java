package condicionales;

import java.util.Scanner;

public class Ejercicio8 {
	/*
	 * Pedir al usuario el número de un mes y el año (comprobando si es o no
	 * bisiesto). Debe imprimir por pantalla el número de días que tiene el mes.
	 */
	public static void main(String[] args) {
		//creamos variable mes y año
		int mes;
		int año;
		int dia=0;
		//creamos escaner
		Scanner sc=new Scanner(System.in);
		
		
		//pedimos al usuario el mes y el año
		System.out.println("Introduce el mes y año");
		//guardamos mes y año
		mes=sc.nextInt();
		año=sc.nextInt();
		if(mes<1||mes>12) {
			System.out.println("El valor introducido no es válido");
			
		}else {
			switch(mes){
			case 1->dia=31;
			case 2->{
				if(año%4==0) {
				dia=29;	
				}else {
				dia=28;
			}
				
			}
			case 3->dia=31;
			case 4->dia=30;
			case 5->dia=31;
			case 6->dia=30;
			case 7->dia=31;
			case 8->dia=31;
			case 9->dia=30;
			case 10->dia=31;
			case 11->dia=30;
			case 12->dia=31;
			
		}
			System.out.println(dia);
	}
		sc.close();
}
}
