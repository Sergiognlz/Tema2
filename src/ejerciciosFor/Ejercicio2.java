package ejerciciosFor;

import java.util.Scanner;

//Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200. Para ello suma de 2 en 2.
public class Ejercicio2 {
public static void main(String[] args) {
	//Creamos el escaner
	Scanner sc=new Scanner(System.in);
	//creamos bucle controlado con FOR
	for(int contador=2;contador<=200;contador+=2) {
		System.out.println(contador);
	}
	//cerramos escaner
	sc.close();
}
}
