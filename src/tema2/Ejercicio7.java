package tema2;

import java.util.Scanner;

public class Ejercicio7 {
public static void main(String[] args) {
	//creamos la variable del número introducido
	int numero;
	//creamos escaner
	Scanner sc=new Scanner(System.in);
	
	//Pedimos al usuario un número
	System.out.println("Introduce un número");
	//leemos el número introducido
	numero=sc.nextInt();
	//creamos condicionales dependiendo de las cifras que tenga el número
	if (numero==0&&numero<=9) {
		System.out.println("El número tiene 1 cifra");
	//creamos las distintas variantes de la condicional
	}else if( numero>=10&&numero<99){
		System.out.println("El número tiene 2 cifras");
	}else if( numero>=100&&numero<999){
		System.out.println("El número tiene 3 cifras");
	}else if( numero>=1000&&numero<9999){
		System.out.println("El número tiene 4 cifras");
	}else if( numero>=10000&&numero<99999){
		System.out.println("El número tiene 5 cifras");
	}else {
		System.out.println("El número se sale de la escala establecida");
		//cerramos el escaner
		sc.close();
		
		
		
		
		
	}
}
}
