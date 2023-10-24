package ejerciciosFor;

import java.util.Scanner;

//Escribir una aplicación para aprender a contar, que pedirá un número n y mostrará todos los números del 1 al n.

public class Ejercicio1 {
public static void main(String[] args) {
	//creamos la variable donde guardaremos el número que vamos a pedir para contar
	int numero;
//creamos escanner
	Scanner sc=new Scanner(System.in);
	
//pedimos al usuario el número junto con la explicación del programa
	System.out.println("Bienvenido a Aprende a Contar para Tontos. Introduce un número y contaremos hasta él");
	//guardamos el número en la variable del mismo nombre
	numero=sc.nextInt();
	//creamos el bucle controlado FOR
	for(int contador=1;contador<=numero;contador++) {
	//imprimimos pantalla con los números
	System.out.println(contador);}
	//cerramos escaner
	sc.close();
	
}
}
