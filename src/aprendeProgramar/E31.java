package aprendeProgramar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E31 {
	/*
	 * Realiza un programa que lea un número N y muestre por la salida estándar
	 * todos los pares desde 2 hasta N (inclusive).
	 * Cada número se mostrará en una línea distinta.
	 * N siempre será mayor o igual a 2.
	 */
public static void main(String[] args) {
	//creamos variables
	int num=0;
	//creamos escaner
	Scanner sc=new Scanner(System.in);
	//do while para el try catch
	do {
		try{
			//pedimos número
			System.out.println("Introduce un número.");
			//guardamos número
			num=sc.nextInt();
			//excepción
		}catch(InputMismatchException e) {
			//mensaje error
			System.out.println("El valor introducido no es válido");
			//limpiamos el escaner
			sc.nextLine();
		}
		}while(num<=2);
	//creamos for para contar los números de 2 al número
	for(int a=2;a<=num;a++) {
		//if para que cuando el número sea par lo imprima
		if (a%2==0) {
			System.out.println(a);
		}
		//cerramos escaner
	sc.close();
	}
}
}
