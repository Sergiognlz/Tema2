package ejerciciosSwitch;

import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args) {
	//creamos variable nota
	int nota;
	//creamos escaner
	Scanner sc=new Scanner(System.in);
	//pedimos al usuario que introduzca la nota
	System.out.println("Introduce tu nota");
	//leemos la nota
	nota=sc.nextInt();
	//creamos el switch
	switch(nota) {
	//creamos los distintos casos
	case 1,2,3,4 ->{
		System.out.println("Insuficiente");
		}
		case 5 ->{
			System.out.println("Suficiente");
	}
		case 6 ->{
			System.out.println("Bien");
		}
		case 7,8->{
			System.out.println("Notable");}
		case 9,10->{
			System.out.println("Sobresaliente");
			//cerramos escaner
			sc.close();
			
		}
		
		
	}
}
}
