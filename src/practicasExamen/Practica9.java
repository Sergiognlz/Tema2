package practicasExamen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica9 {
	/*
	 * Escribe un algoritmo que le pida al usuario dos números. A continuación debe
	 * mostrar el siguiente menú por pantalla: 
	 * A. SUMAR LOS NÚMEROS 
	 * B. RESTAR LOS NÚMEROS
	 * C. MULTIPLICAR LOS NÚMEROS 
	 * D. DIVIDIR LOS NÚMEROS 
	 * Después, el algoritmo debe pedirle al usuario que seleccione una opción y que haga la operación que
	 * marca esa opción, mostrando por último el resultado de la operación elegida
	 * por el usuario. Si el usuario elige una opción incorrecta, el algoritmo se lo
	 * hace saber al usuario y no haría nada.
	 */
	public static void main(String[] args) {
		//creamos dos variables
		double num1=0, num2=0;
		String select="select"; 
		final String A="A", B="B",C="C",D="D";
		//escanner
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce dos números para desplegar el menú.");
		//creamos dos do while y dos try catch para cada valor introducido
		do {
			try {
				//pedimos el primer número
				System.out.println("Introduce el primer número.");
				//guardamos el primer número
				num1=sc.nextDouble();
			}catch(InputMismatchException e) {
				//mensaje error
				System.out.println("El valor introducido no es válido.");
				//limpiamos escaner
				sc.nextLine();
				}
			}while(num1<0);
		//segundo numero
		do {
			try {
				//pedimos segundo número
				System.out.println("Introduce el segundo número.");
				//guardamos el segundo número
				num2=sc.nextDouble();
			}catch(InputMismatchException e) {
				//mensaje error
				System.out.println("El valor introducido no es válido.");
				//limpiamos escaner
				sc.nextLine();
			}
			}while(num2<0);
		
		System.out.println("SELECCIONA UNA OPCIÓN:");
		System.out.println("A. SUMAR LOS NÚMEROS.");
		System.out.println("B. RESTAR LOS NÚMEROS.");
		System.out.println("C. MULTIPLICAR LOS NÚMEROS.");
		System.out.println("D. DIVIDIR LOS NÚMEROS.");
		
		select=sc.next();

		
		switch(select) {
		case A->{
			System.out.println("La suma de los números es: "+(num1+num2));
		}
		case B->{
			System.out.println("La resta de los números es: "+(num1-num2));
		}
		case C->{
			System.out.println("La multiplicación de los números es: "+(num1*num2) );
		}
		case D->{
			System.out.println("La división de los números es: "+(num1/num2));
		}
		default->{
			System.out.println("No es correcto.");
		}
		
		}
		sc.close();
		}
	
		
	}
	

