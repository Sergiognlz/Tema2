package practicasExamen;

import java.util.InputMismatchException;
import java.util.Scanner;
/* Solicita al usuario un número n y dibuja un rombo de base y altura n.*/
public class practica1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero=0;
		//creamos do para que en caso de valor 0 o inferior nos salte un error y nos lo pida de nuevo.
		do {
			try {
			//pedimos el número que usaremos para la base y la altura del triángulo
		System.out.print("Introduce un número para la base y altura del triángulo: ");
		 numero = sc.nextInt();
			}catch(InputMismatchException e) {
		 //creamos if para mostrar mensaje en caso de un valor 0 o inferior
		System.out.println("El valor introducido no es válido");
		//limpiamos el escaner
		sc.nextLine();
		 }
		}while(numero<=0);
		
		//creamos un for para contar
		for(int a=1;a<=numero;a++) {
			for(int b=1;b<=numero-a;b++) {
			System.out.print(" ");
			
			
			}
			for(int c=1;c<=a;c++ ) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
			
		}
		for(int a=numero-1;a>=1;a--) {
			for(int b=1;b<=numero-a;b++) {
			System.out.print(" ");
			
			
			}
			for(int c=1;c<=a;c++ ) {

				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
			
		
		
		
	}
}
}	
		