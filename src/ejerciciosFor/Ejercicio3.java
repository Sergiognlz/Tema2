package ejerciciosFor;

import java.util.Scanner;

//Escribir todos los múltiplos de 7 menores que 100.
public class Ejercicio3 {
public static void main(String[] args) {
	//creamos escaner
	Scanner sc=new Scanner(System.in);
	
	//creamos bucle controlado con FOR
	for(int contador=7;contador<=100;contador+=7) {
		System.out.println(contador);
	}
	//cerramos escaner
	sc.close();
	
}
}
