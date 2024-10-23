package boletinfor;

import java.util.Scanner;

public class Ejercicio5 {
	/*
	 * Pedir un número y calcular su factorial. Por ejemplo, el factorial de 5 se
	 * denota 5! y es igual a 5x4x3x2x1 = 120.
	 */
	public static void main(String[] args) {
		//creamos variable donde almacenar el número
		int num;
		//creamos variable para el resultado
		int fact=1;
		//escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos un número
		System.out.println("Inntroduce un número para calcular su factorial");
		//guardamos el número
		num=sc.nextInt();
		
		//for para recorrer inversamente el número
		for(int i=num;i>0;i--) {
			//factorial es igual a factorial multiplicado por la i;
			fact*=i;
		}
		//mostramos resultado por pantalla
		System.out.println("Factorial:" +fact);
		//cerramos escaner
		sc.close();
	}
	
}
