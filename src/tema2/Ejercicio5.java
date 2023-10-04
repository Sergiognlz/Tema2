package tema2;

import java.util.Scanner;

public class Ejercicio5 {
public static void main(String[] args) {
	//creamos variable del primer número 
	int numero1;
	//creamos variable del segundo número
	int numero2;
	//creamos la variable del tercer número
	int numero3;
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
	//pedimos al usuario el tercer número
	System.out.println("Introduce el tercer número");
	//leemos el tercer número
	numero3=sc.nextInt();
	//creamos la condicional
	if ((numero1>numero2)&&(numero2>numero3)) {
		//mostramos la pantalla con la información si se cumple la condicional
		System.out.println(numero1+ " es mayor que " + numero2 + " que a su vez es mayor que " +numero3);
		//creamos el else con los 13 casos posibles 
	}else if((numero2>numero1)&&(numero1>numero3)) {
		System.out.println(numero2+ " es mayor que " +numero1+ " que a su vez es mayor que " + numero3);
	
	}else if((numero2>numero3)&&(numero3>numero1)) {
		System.out.println(numero2+ " es mayor que " +numero3+ " que a su vez es mayor que " + numero1);
		
	}else if((numero1>numero3)&&(numero3>numero2)) {
		System.out.println(numero1+ " es mayor que " +numero3+ " que a su vez es mayor que " + numero2);
		//
	}else if((numero3>numero1)&&(numero1>numero2)) {
		System.out.println(numero3+ " es mayor que " +numero1+ " que a su vez es mayor que " + numero2);
		//
	}else if((numero3>numero2)&&(numero2>numero1)) {
		System.out.println(numero3+ " es mayor que " +numero2+ " que a su vez es mayor que " + numero1);
		
	}else if((numero1==numero2)&&(numero2==numero3)) {
		System.out.println("Los números son iguales");
		//
	}else if((numero1==numero2)&&(numero2>numero3)) {
		System.out.println(numero1 + " y " +numero2+ " son iguales, y son mayores que " + numero3);
		//
	}else if((numero1==numero2)&&(numero2<numero3)) {
		System.out.println(numero1 + " y " +numero2+ " son iguales, y " + numero3 + " es mayor que ambos");
		
	}else if((numero1>numero2)&&(numero2==numero3)) {
		System.out.println(numero1+" es mayor que " + numero2 + " y " +numero3+" que son iguales.");	
		
	}else if((numero1<numero2)&&(numero2==numero3)) {
		System.out.println(numero2 + " y " +numero3+ " son iguales, y son mayores que " + numero3 );
		
	}else if((numero1==numero3)&&(numero3>numero2)) {
		System.out.println(numero1 + " y " +numero3+ " son iguales, y son mayores que " + numero2);
		
	}else if((numero1==numero3)&&(numero3<numero2)) {
		System.out.println(numero1 + " y " +numero3+ " son iguales, y son mayores que " + numero3);
		//cerramos escaner
		sc.close();
}
}
}
