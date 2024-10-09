package boletinifelse;

import java.util.Scanner;

public class Ejercicio10 {
	/*
	 * Escribir un programa que pida al usuario tres números enteros, y que muestre
	 * por pantalla si la suma de dos de esos números da como resultado el otro
	 * número.
	 */
	public static void main(String[] args) {
		//creamos variables para los 3 números
		int num1;
		int num2;
		int num3;
		//creamos escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos 3 números al usuario
		System.out.println("Introduce 3 números");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		
		//comprobamos todos los supuestos con un if else anidado
		if(num1+num2==num3) {
			System.out.println(num1+"+"+num2+"="+num3);
		}else if(num1+num3==num2){
			System.out.println(num1+"+"+num3+"="+num2);
		}else if(num2+num3==num1) {
			System.out.println(num2+"+"+num3+"="+num1);
		}else {
			System.out.println("La suma de dos números no da el restante.");
	
		}
		sc.close();
	}
}
