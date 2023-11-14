package practicasExamen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica7 {
/* Triángulo invertido relleno*/
	public static void main(String[] args) {
		//variable número
		int num=0;
		//escaner
		Scanner sc=new Scanner(System.in);
		//do while y try catch
		do {
			try {
				//pedimos número
				System.out.println("Introduce un número para la base y altura del triángulo invertido.");
				//guardamos número
				num=sc.nextInt();
				
			}catch(InputMismatchException e) {
				//mensaje error
				System.out.println("El valor introducido no es válido.");
				//limpiamos escaner
				sc.nextLine();
			 	}
			}while(num<=0);
			
		//creamos for para las filas
		for(int i=num-1;i>=1;i--) {
			//dentro otro for para columnas
			for(int j=1;j<=num-i;j++) {
				System.out.print(" ");
			}
			//y un último for que ni idea para que sirve pero funciona
			for(int k=1;k<=i;k++) {
				System.out.print("*");
				System.out.print(" "); 
			}
					System.out.println();
				
			
		}
		sc.close();
		}
	}

