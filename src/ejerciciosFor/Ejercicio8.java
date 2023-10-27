package ejerciciosFor;

import java.util.Scanner;

//Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
public class Ejercicio8 {
public static void main(String[] args) {
	//creamos las variable dónde guardaremos los números
	int nota=0, contador=1, suspendidos=0;
	//creamos escaner
	Scanner sc=new Scanner(System.in);
	//Creamos el bucle controlado para pedir 10 números
	for(contador=1; contador<=5;contador++) {
	//pedimos el número al usuario
	System.out.println("Introduce la "+contador+"º nota");
	//guardamos el número
	nota=sc.nextInt();
	if(nota<5) {
		suspendidos++;
	}
	
	}

	//imprimimos pantalla con l amedia de los números
	System.out.println("Han suspendido "+suspendidos+" alummnos.");
	
	//cerramos escaner
	sc.close();
}
}

