package boletinfor;

import java.util.Scanner;

public class Ejercicio2 {
	/*
	 * Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número
	 * que introducimos por teclado.
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
			//if  módulo de 3 igual a 0 para regular que solo muestre los múltiplos de 3
			if(i%3==0) {
			//imprimimos los números
			System.out.println(i);
			}
			
		}
		//cerramos escaner
		sc.close();
	}

}
