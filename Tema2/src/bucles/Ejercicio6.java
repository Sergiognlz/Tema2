package bucles;

import java.util.Scanner;

public class Ejercicio6 {
/*Solicita al usuario un número n y dibuja un triángulo de base y altura n. Por ejemplo para n=4 debe dibujar lo siguiente:
   	 *
   	* *
   * * *
  * * * *
*/

	public static void main(String[] args) {
		// variable número
		int num;
		//escaner
		Scanner sc=new Scanner(System.in);
		
		//do while para controlar que sean número positivos
		do {
			//pedimos número a usuario
			System.out.println("Introduce un número");
			//guardamos
			num=sc.nextInt();
		}while(num<=0);
		
		for(int i=1;i<=num;i++) {
			//imprimimos espacio en blanco
		
			//otro for dentro que no sé muy bien que hace pero es necesario
			for(int j=i;j<num;j++) {
				
			//imprimimos por pantalla
			System.out.print(" ");
		
			}
		for(int k=1;k<=i;k++) {
			System.out.print("* ");
		
		}
		
		System.out.println("");
			
		}
		//cerramos escaner
		sc.close();
	}
}
