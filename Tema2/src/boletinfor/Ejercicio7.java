package boletinfor;

import java.util.Scanner;

public class Ejercicio7 {
	/*
	 * Realiza un programa en java que pida un número entero positivo y nos diga si
	 * es primo o no.
	 */
	public static void main(String[] args) {
		//variable numero
		int num;
		//booleana que indique si es primo
		boolean primo=true;
		//escanner
		Scanner sc=new Scanner(System.in);
		
		//do while para evitar negativos
		do {
		//pedimos un número
		System.out.println("Introduce un número");
		//guardamos número
		num=sc.nextInt();
		
		}while(num<=0);
		//for para recorrer los números y saber si tiene múltiplos
		for(int i=2;i<num;i++) {
			//if cuando el número sea divisible por el número
			if(num%i==0) {
			primo=false;
			break;
			}
			
		}
		//añadimos excepción para el uno
		if(num==1) {
			System.out.println("No es primo");
		}else {
		//if con las dos soluciones
		if(primo) {
			//mensaje
			System.out.println("Es primo");
		}else {
			System.out.println("No es primo");
		}
		}
		//cerrar escaner
		sc.close();
	}
}
