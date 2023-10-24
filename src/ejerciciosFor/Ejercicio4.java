package ejerciciosFor;
//Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número que introducimos por teclado.

import java.util.Scanner;

public class Ejercicio4 {
public static void main(String[] args) {
	//creamos la variable donde guardaremos el número que vamos a pedir para contar
	int numero;
//creamos escanner
	Scanner sc=new Scanner(System.in);
	
//pedimos al usuario el número junto con la explicación del programa
	System.out.println("Bienvenido a Aprende a Contar con Múltiplos de 3 para Tontos. Introduce un número y contaremos los múltiplos de 3 hasta él");
	//guardamos el número en la variable del mismo nombre
	numero=sc.nextInt();
	//creamos el bucle controlado FOR
	for(int contador=1;contador<=numero;contador++) {
		if(contador%3==0){
			//imprimimos pantalla con los números
			System.out.println(contador);
		}
	}
	//cerramos escaner
	sc.close();
}
}
