package boletindowhile;

import java.util.Scanner;

public class Ejercicio3 {
	/*
	 * Realiza un programa que sume los números desde el 1 hasta un número N que se
	 * introducirá por teclado. Si el usuario introduce un 5, el programa debe
	 * devolver la suma de 1+2+3+4+5.
	 */
	public static void main(String[] args) {
		//creamos un contador
		int cont=1;
		//creamos variable numero
		int num;
		//variable sumatorio
		int suma=0;
		//escaner
		Scanner sc=new Scanner(System.in);
		
		//preguntamos al usuario el número objetivo
		System.out.println("Introduce un número para mostrar sumatorios hasta dicho número");
		//guardamos
		num=sc.nextInt();
		//creamos do while para controlar las iteraciones
		do {
		suma+=cont;	
		cont++;
		}while(cont<=num);
		//mostramos resultado
		System.out.println(suma);
	
		sc.close();
	}
	
}
