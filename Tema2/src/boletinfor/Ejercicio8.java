package boletinfor;

import java.util.Scanner;

public class Ejercicio8 {
	/*
	 * Realiza un programa que pida dos números enteros A y B. Luego visualiza los
	 * números que hay entre A y B. Si A es menor que B, entonces debe mostrar los
	 * números desde A hasta B. Si B es menor que A, entonces debe mostrar los
	 * números desde B hasta A.
	 */
	
	public static void main(String[] args) {
		//creamos variables número A y número B
		int numA;
		int numB;
		int mayor;
		int menor;
		//escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos número A
		System.out.println("Introduce número A ");
		//guardamos 
		numA=sc.nextInt();
		//pedimos número B
		System.out.println("Introduce número B");
		//guardamos
		numB=sc.nextInt();
		
		//if para asignar el mayor y el menor
		if(numA>numB) {
			mayor=numA;
			menor=numB;
		}else if(numA<numB){
			mayor=numB;
			menor=numA;
		}else {
			mayor=numA;
			menor=numB;
		}
		System.out.println("Entre "+menor+" y "+mayor+" se encuentran los siguientes números: ");
		//for para recorrer
			for(int i=menor;i<=mayor;i++) {
				System.out.println(i);
		}
			//cerramos escaner
			sc.close();
	}
}
