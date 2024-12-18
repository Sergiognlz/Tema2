package examenest2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
	/*
	 * Escribe un programa que lea un número entero (lado) y a partir de él cree un
	 * cuadrado de asteriscos con ese tamaño. Los asteriscos sólo se verán en el
	 * borde del cuadrado, no en el interior:
	 */
	public static void main(String[] args) {
		//creamos variable número
		int num=0;
		//variable booleano de control del catch
		boolean error=false;
		//escaner
		Scanner sc=new Scanner(System.in);
		
		do {
			try {
				System.out.println("Introduce un número");
				num=sc.nextInt();
				assert(num>=0):"El valor introducido no es válido";
				error=false;
				
			}catch(AssertionError e) {
			System.out.println(e.getMessage());	
			error=true;
			}catch(InputMismatchException e) {
				System.out.println("El valor introducido no es válido");
				error=true;
			}finally {
				sc.nextLine();
			}
		}while(error);
		
		//for para las filas
		for(int i=1;i<=num;i++) {
			
		//for para las columnas
			for(int j=1;j<num;j++) {
				if((j==1||i==1)||(j==num||i==num)) {
				System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("* ");
		}
		
		sc.close();
	}
}
