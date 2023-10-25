package ejerciciosFor;

import java.util.Scanner;

//Pedir diez números por teclado y mostrar la media.
public class Ejercicio5 {
public static void main(String[] args) {
	//creamos las variable dónde guardaremos los números
	float mediaNumeros=0;
	int numero=0, contador=1, suma=0;
	//creamos escaner
	Scanner sc=new Scanner(System.in);
	//Creamos el bucle controlado para pedir 10 números
	for(contador=1; contador<=10;contador++) {
	//pedimos el número al usuario
	System.out.println("Introduce el "+contador+"º número");
	//guardamos el número
	numero=sc.nextInt();
	suma+=numero;
	}
	mediaNumeros=(float)(suma)/10;

	//imprimimos pantalla con l amedia de los números
	System.out.println("La media de los números introducidos es:"+mediaNumeros);
	
	//cerramos escaner
	sc.close();
}
}
