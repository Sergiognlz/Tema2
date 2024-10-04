package BoletinIfElse;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ejercicio4 {
/*Pedir dos números y mostrarlos ordenados de menor a mayor.*/
	
	public static void main(String[] args) {
		
		//creamos variables para los números que vamos a almacenar
		int num1;
		int num2;
		//creamos escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos el primer número al usuario
		System.out.println("Introduce el primer número");
		//leemos el número
		num1=sc.nextInt();
		//pedimos el segundo número
		System.out.println("Introduce el segundo número");
		//leemos el número
		num2=sc.nextInt();
		
		//creamos if else para comprobar que número es mayor
		if(num1>num2) {
			//imprimimos que num1 es mayor que num2
			System.out.println(num1+" es mayor que "+num2);
		}else if(num2>num1) {
			//imprimimos que num2 es mayor que num1
			System.out.println(num1+" es menor que "+num2);
		}else {
			//en caso de que sean iguales imprimimos por pantalla que lo son
			System.out.println("Los números son iguales");
		}
		sc.close();
	}
}
