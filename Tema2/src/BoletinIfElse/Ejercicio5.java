package BoletinIfElse;

import java.util.Scanner;

public class Ejercicio5 {
	/* Pedir tres números y mostrarlos ordenados de mayor a menor. */

	public static void main(String[] args) {
		// creamos variables para los 3 números
		int num1;
		int num2;
		int num3;
		// creamos escaner
		Scanner sc = new Scanner(System.in);

		// pedimos los 3 números al usuario
		System.out.println("Introduce 3 números");
		// leemos los 3 números
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

		// creamos un if else para comprobar qué número es mayor y ordenarlos
		if (num1 > num2 && num2 > num3) {
			// imprimimos por pantalla orden
			System.out.println(num1 + ">" + num2 + ">" + num3);
		} else if (num1 < num3 && num3 > num2) {
			// imprimimos por pantalla orden
			System.out.println(num1 + ">" + num3 + ">" + num2);
		} else if (num1 == num2 && num2 > num3) {
			// imprimimos por pantalla orden
			System.out.println(num1 + "=" + num2 + ">" + num3);
		} else if (num1 > num2 && num2 == num3) {
			// imprimimos por pantalla orden
			System.out.println(num1 + ">" + num2 + "=" + num3);
		} else if (num2 > num1 && num1 > num3) {
			// imprimimos por pantalla orden
			System.out.println(num2 + ">" + num1 + ">" + num3);
		} else if (num2 > num3 && num3 > num1) {
			// imprimimos por pantalla orden
			System.out.println(num2 + ">" + num3 + ">" + num1);
		} else if (num2 == num1 && num2 > num3) {
			// imprimimos por pantalla orden
			System.out.println(num2 + "=" + num1 + ">" + num3);
		} else if (num2 > num1 && num1 == num3) {
			// imprimimos por pantalla orden
			System.out.println(num2 + ">" + num1 + "=" + num3);
		} else if (num3 > num1 && num1 > num2) {
			// imprimimos por pantalla orden
			System.out.println(num3 + ">" + num1 + ">" + num2);
		} else if (num3 > num2 && num2 > num1) {
			// imprimimos por pantalla orden
			System.out.println(num3 + ">" + num2 + ">" + num1);
		} else if (num3 == num1 && num1 > num2) {
			// imprimimos por pantalla orden
			System.out.println(num3 + "=" + num1 + ">" + num2);
		} else if (num3 > num1 && num1 == num2) {
			// imprimimos por pantalla orden
			System.out.println(num3 + ">" + num1 + "=" + num2);
		} else {
			System.out.println(num1 + "=" + num2 + "=" + num3);
		}
		sc.close();
	}
}
