package boletinfor;

import java.util.Scanner;

public class Ejercicio1 {
	/*
	 * Escribir una aplicación para aprender a contar, que pedirá un número n y
	 * mostrará todos los números del 1 al n.
	 */
	
	public static void main(String[] args) {
		//variable num
		int num;
		//escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos numero al usuario
		System.out.println("Introduce un número");
		//guardamos num
		num=sc.nextInt();
		//for para recorrer
		for(int i=1;i<=num;i++) {
			//imprimimos los números
			System.out.println(i);
			
		}
		//cerramos escaner
		sc.close();
	}
}
