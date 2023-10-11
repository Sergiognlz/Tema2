package ejerciciosWhile;

import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args) {
	//creamos las variables
	int suma=0, numero;
	//creamos escaner
	Scanner sc=new Scanner(System.in);
	//pedimos al usuario un número y añadimos instrucciones
	System.out.println("Introduce un número. Valor negativo para salir");
	//leemos el número
	numero=sc.nextInt();
	//creamos el while
	while(numero>=0) {
	suma+=numero;
	System.out.println("Introduce un número. Valor negativo para salir");
	numero=sc.nextInt();
	}
 //creamos el mensaje que se mostrará cuando salga del bucle
	System.out.println("La suma de los números introducidos es: "+suma);
	//cerramos escaner
	sc.close();
}
}
