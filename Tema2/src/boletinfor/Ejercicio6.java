package boletinfor;

import java.util.Scanner;

public class Ejercicio6 {
	/* Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso. */
	
	public static void main(String[] args) {
		//variable nota
		double nota;
		//variable suspenso
		int susp=0;
		//escaner
		Scanner sc=new Scanner(System.in);
		
	//FOR para las repeticiones
	for(int i=1;i<=5;i++) {
		//pedimos notas
		System.out.println("Introduce una nota");
		//guardamos nota
		nota=sc.nextDouble();
		//if para controlar si hay suspensos
		if(nota<5) {
			 susp++;
		}
	}
	//mostramos cantidad de suspensos
	System.out.println("Hay "+susp+"  suspensos");
	//cerramos escaner
	sc.close();
	}
}
