package aprendeProgramar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E34 {
	/*
	 * Realiza un programa que lea una secuencia de notas (con valores que van de 0
	 * a 10, sin decimales).
	 * Se leerá una nota por lí­nea.
	 * La entrada acabará con el valor -1. El programa debe mostrar por salida
	 * estándar "SI" si hay algún 10, "NO" en caso contrario.
	 */
	public static void main(String[] args) {
		//creamos variables
		int nota=0;
		boolean diez=false;
		//creamos escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos nota
		System.out.println("Introduce una nota del 1 al 10. Introduce -1 para detener la entrada de notas.");
		//do while try catch
		do {
			try {
				
				//guardamos la nota
				nota=sc.nextInt();
				
				if(nota<-1||nota>10) {
					System.out.println("El valor introducido no es válido.");
				}
			}catch(InputMismatchException e) {
				//mesaje error
				System.out.println("El valor introducido no es válido.");
				//limpiamos escaner
				sc.nextLine();
					
			}
			if(nota==10) {
				diez=true;
			}
			}while(!(nota==-1));
		
		if(diez) {
			System.out.println("SI");
		}else{
			System.out.println("NO");
		}
	
			sc.close();
		}
		
	}

