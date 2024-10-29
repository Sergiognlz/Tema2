package bucles;

import java.util.Scanner;

public class Ejercicio9 {
	/*
	 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
	 * por teclado. El número introducido debe ser mayor que 0.
	 */
	public static void main(String[] args) {
		//variable para guardar el número introducido
		int num;
		//contador cifras
		int cifras=0;
		//escaner
		Scanner sc=new Scanner(System.in);
		
		//control de rango
		do {
		//pedimos número al usuario
			System.out.println("Introduce un número mayor que 0");
			//guardamos
			num=sc.nextInt();
		}while(num<=0);
		
		//hacemos un for para recorrer el número
		for(int i=1;num%i!=num;i*=10) {
			
			//incrementamos contador cifras
			cifras++;
		}
		
		//mostramos resultado
		System.out.println("El número tiene "+cifras+" dígitos");
	//cerramos escaner
		sc.close();
	}
}
