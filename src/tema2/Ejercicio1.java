package tema2;

import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args) {
	//creamos la variable número
	int numero;
	//creamos constantes
	final int dos=2;
	final int cero=0;
	//creamos escaner
	Scanner sc=new Scanner(System.in);
	
	// pedimos un número al usuario
	System.out.println("Introduce un número");
	//leemos número
	numero=sc.nextInt();
	//creamos constante con la condición de que la variable número tengo un resto igual a cero
	if(numero%dos==cero) {
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
