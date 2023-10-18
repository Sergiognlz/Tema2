package ejerciciosDoWhile;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
//creamos variables
	int numero, contador=0, suma=0;
	//creamos escaner
	Scanner sc=new Scanner(System.in);
	//pedimos al usuario que introduzca un número.
	System.out.println("Introduce un número");
	//leemos el número
	numero=sc.nextInt();
	//creamos el do
	do {
		//especificamos las variables que se ejecutarán
		suma+=contador++;
		//cerramos el bucle con el while
	}while (contador<=numero);
	System.out.println("La suma de los números hasta el "+numero+" es: " +suma);
	//cerramos el escaner
	sc.close();
	
	}
}

