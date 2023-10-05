package tema2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		// creamos variables a utilizar
		double numero;
		
		//creamos escaner
		Scanner sc=new Scanner(System.in);
		//creamos la localización del escaner para poder decimales
		sc.useLocale(Locale.US);
		//pedimos al usuario un número
		System.out.println("Introduce tu nota");
		//leemos número introducido
		numero=sc.nextDouble();
		
		// establecemos un valor entre los que se moverá insuficiente
		if (numero<5) {
		//establecemos el resultado que saldrá en pantalla
			System.out.println("Tienes un insuficiente");
			//creamos las variantes con else
		}else if ((numero>=6)&&(numero<=6.9)){
			//mostramos resultado con bien
			System.out.println("Tienes un bien");
		}else if((numero>=7)&&(numero<=8.9)){
			System.out.println("Tienes un notable");
		}else if((numero>=9)&&(numero<=10)){
			System.out.println("Tienes un sobresaliente");
		}else {
			System.out.println("La nota introducida no es válida.");
			sc.close();
		
		
		}
	}
}	
		
		

			
			
