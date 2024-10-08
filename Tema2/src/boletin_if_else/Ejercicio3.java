package boletin_if_else;

import java.util.Scanner;

public class Ejercicio3 {
/*Implementar un programa que pida por teclado un número decimal e indique si es un número casi-cero,
 * que son aquellos, positivos o negativos, que se acercan a 0 por menos de 1 unidad, 
 *aunque curiosamente el 0 no se considera un número casi-cero. 
 *Es decir, un número casi-cero es el que se encuentra en el intervalo (-1, 1), 
 *donde se excluye el -1, el 0 y el 1.*/
	
public static void main(String[] args) {
	//creamos variable donde guardar el número
	double num;
	//creamos escaner
	Scanner sc=new Scanner(System.in);
	
	//pedimos al usuario un número
	System.out.println("Introduce un número decimal");
	//leemos el número
	num=sc.nextDouble();
	//creamos un if para comprobar que el número sea casi cero
	
	//primero comprobamos que el número es 0
	if(num==0) {
		//imprimimos que es 0
		System.out.println("El número es 0");
		//comprobamos que los números sean menores que 1 y mayores que menos 1, ambos excluidos
	}else if(num>-1&&num<1) {
		//mesanje de número casi cero
		System.out.println("El número es casi 0");
		//en caso contrario imprimimos por pantalla que no es casi 0
	}else {
		System.out.println("El número no es casi 0");
	}
	//cerramos escaner
	sc.close();
}
}
