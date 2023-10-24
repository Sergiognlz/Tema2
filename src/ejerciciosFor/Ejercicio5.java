package ejerciciosFor;

import java.util.Scanner;

//Pedir diez números por teclado y mostrar la media.
public class Ejercicio5 {
public static void main(String[] args) {
	//creamos las variable dónde guardaremos los números
	int mediaNumeros=0,numero;
	//creamos escaner
	Scanner sc=new Scanner(System.in);
	//Creamos el bucle controlado para pedir 10 números
	for(int contador=1; contador<=10;contador++) {
	//pedimos el número al usuario
	System.out.println("Introduce el "+contador+"º número");
	//guardamos el número
	numero=sc.nextInt();
	mediaNumeros=(numero+=contador)/10;
}
	System.out.println("La media de los números introducidos es:"+mediaNumeros);
}
}
