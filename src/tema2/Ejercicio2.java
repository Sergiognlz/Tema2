package tema2;

import java.util.Scanner;

public class Ejercicio2 {
public static void main(String[] args) {
   //creamos variable del primer número a introducir
	int numero1;
	//creamos variable del segundo número a introducir
	int numero2;
	//creamos el escaner
	Scanner sc=new Scanner(System.in);
	
	//pedimos al usuario el primer número
	System.out.println("Introduce el primer número");
	//leemos el número 
	numero1=sc.nextInt();
	//pedimos al usuario el segundo número
	System.out.println("Introduce el segundo número");
	//leemos el segundo número
	numero2=sc.nextInt();
	//creamos condicional
	if (numero1==numero2) {
		//mostramos la pantalla con el mensaje en caso de que se cumpla la condición
		System.out.println("Ambos número son iguales");
		//creamos else con la pantalla que se mostrará si no se cumple la condición
	}else {
		System.out.println("Ambos números son diferentes");
		//cerramos escaner
		sc.close();
		
	}
}
}
