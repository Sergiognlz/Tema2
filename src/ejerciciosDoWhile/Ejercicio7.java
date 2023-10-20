package ejerciciosDoWhile;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		//creamos variables de los números a guardar
		double numero1,numero2;
		String valor;
		final String A="A";
		final String B="B";
		final String C="C";
		final String D="D";
		final String E="E";
		//creamos el escaner 
		Scanner sc=new Scanner(System.in);
		//creamos el bucle que repetirá el programa
		do {
		//pedimos al usuario que introduzca el primer número
		System.out.println("Introduce el primer número");
		//leemos el numero
		numero1=sc.nextInt();
		//pedimos al usuario que introduzca el segundo número
		System.out.println("Introduce el segundo número");
		//leemos el segundo número
		numero2=sc.nextInt();
		//mostramos el menú
		System.out.println("A. SUMAR LOS NÚMEROS");
		System.out.println("B. RESTAR LOS NÚMEROS");
		System.out.println("C. MULTIPLICAR LOS NÚMEROS");
		System.out.println("D. DIVIDIR LOS NÚMEROS");
		System.out.println("E. SALIR");
		//leemos el valor introducido
		valor=sc.next();
		
		//creamos switch
		switch(valor) {
		//creamos los casos para cada opción del menú
		case A->{
			System.out.println(numero1+numero2);}
		case B->{
			System.out.println(numero1-numero2);}
		case C->{
			System.out.println(numero1*numero2);}
		case D->{
			System.out.println(numero1/numero2);}}
			
	
		
		
		}while(!valor.equals(E))	;
		System.out.println("FIN");
		
		//cerramos escaner
		sc.close();
	}
	}

