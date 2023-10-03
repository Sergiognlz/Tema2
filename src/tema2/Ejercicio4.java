package tema2;

import java.util.Scanner;

public class Ejercicio4 {
public static void main(String[] args) {
	//creamos variable del primer número 
	int numero1;
	//creamos variable del segundo número
	int numero2;
	//creamos escaner
	Scanner sc=new Scanner(System.in);
	
	//Pedimos al usuario el primero número
	System.out.println("Introduce el primero número");
	//leemos el primer número
	numero1=sc.nextInt();
	//Pedimos al usuario el segundo número
	System.out.println("Introduce el segundo número");
	//leemmos el segundo número
	numero2=sc.nextInt();
	//creamos la condicional
	if (numero1>numero2) {
		//mostramos la pantalla con la información si se cumple la condicional
		System.out.println(numero1+ " es mayor que " + numero2);
		//creamos el else con lo que se mostrará si no se cumple la condición 
	}else if(numero2>numero1) {
		System.out.println(numero2+ " es mayor que " +numero1);
		//creamos un else if especial con si ambos número son iguales 
	}else if(numero1==numero2) {
		System.out.println(numero1 + " es igual que " + numero2);
		//cerramos escaner
		sc.close();
		
	}
	
}
}
