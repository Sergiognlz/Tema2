package ejerciciosFor;

import java.util.Scanner;

//Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no.
public class Ejercicio9 {
public static void main(String[] args) {
	//creamos las variables
	int numero;
	boolean primo,noprimo;
	//creamos escaner
	Scanner sc=new Scanner(System.in);
	//pedimos un número al usuario
	System.out.println("Introduce un número");
	//guardamos el número introducido
	numero=sc.nextInt();
	
	
if(numero%2==0) {
	System.out.println("No es primo");}
	
	else {
		System.out.println("Es primo");
}
}
}
