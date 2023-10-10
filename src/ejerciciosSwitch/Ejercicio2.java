package ejerciciosSwitch;

import java.util.Scanner;

public class Ejercicio2 {
public static void main(String[] args) {
	//creamos la variable número 
	int numero;
	//creamos escaner
	Scanner sc=new Scanner(System.in);
	
	//pedimos un número al usuario
	System.out.println("Introduce un número del 1-7");
	//leemos el número
	numero=sc.nextInt();
	//creamos un switch
	switch(numero){
	// creamos los distintos casos
	case 1->{
		System.out.println("Es lunes.");}
	case 2->{
	
		System.out.println("Es martes.");}
	case 3->{
		System.out.println("Es miércoles.");}
	case 4->{
		System.out.println("Es jueves.");}
	case 5->{
		System.out.println("Es viernes.");}
	case 6->{
		System.out.println("Es sábado.");}
	case 7->{
		System.out.println("Es domingo.");}
    default->
    System.out.println("El número introducido no es válido.");}
	
	
	//cerramos escaner
    sc.close();
}
}
