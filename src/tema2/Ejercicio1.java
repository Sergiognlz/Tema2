package tema2;

import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args) {
	//creamos la variable número
	int numero;
	//creamos constantes
	final int DOS=2;
	final int CERO=0;
	//creamos escaner
	Scanner sc=new Scanner(System.in);
	
	// pedimos un número al usuario
	System.out.println("Introduce un número");
	//leemos número
	numero=sc.nextInt();
	//creamos la condicionalpara que la variable número tengo un resto igual a cero
	if(numero%DOS==CERO) {
		//imprimimos pantalla
		System.out.println("Es un número par");
		//creamos el else con lo que muesta si no es true la condicional
	} else {
		System.out.println("El número es impar");
		//cerramos escaner
		sc.close();
		
	}
}
}
