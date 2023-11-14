package aprendeProgramar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E32 {
	/*
	 * Realiza un programa que lea un número N y muestre por la salida estándar
	 * todos los impares desde N(inclusive) hasta 1. Cada número se mostrará en una
	 * línea distinta. N siempre será mayor o igual a 1.
	 */
	public static void main(String[] args) {
		//variable
		int num=0;
		//escaner
		Scanner sc=new Scanner(System.in);
		//do while para try catch
		do {
			try {
				//pedimos número
				System.out.println("Introduce un número.");
				//guardamos número
				num=sc.nextInt();
				//excepción 
			}catch(InputMismatchException e) {
				//mensaje error
				System.out.println("El valor introducido no es válido.");
				//limpiamos escaner
				sc.nextLine();
			}
		}while(num<1);
		//creamos for para contar del número a 1
		for(int a=num;a>=1;a--) {
			//creamos if para que cuando el número sea par no haga nada
			if(a%2==0) {
				//y en caso contrario a ser par lo imprima
			}else{
				//imprimimos pantalla resultado
				System.out.println(a);
			}
			
		}
		sc.close();
	}
}
