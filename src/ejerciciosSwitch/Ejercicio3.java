package ejerciciosSwitch;

import java.util.Scanner;

public class Ejercicio3 {
public static void main(String[] args) {
	//creamos variables de los números a guardar
	int numero1,numero2;
	String valor;
	final String A="A";
	final String B="B";
	final String C="C";
	final String D="D";
	
	//creamos el escaner 
	Scanner sc=new Scanner(System.in);
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
		System.out.println(numero1/numero2);}
		default->
		System.out.println("La opción introducida no es válida.");}
	//cerramos escaner
	sc.close();
		
	
}
}
