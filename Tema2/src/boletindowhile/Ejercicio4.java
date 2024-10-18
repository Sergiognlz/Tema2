package boletindowhile;

import java.util.Scanner;

public class Ejercicio4 {
/*Realiza un programa que muestre la tabla de multiplicar de un número introducido por teclado. Por ejemplo, si se introduce el número 3 se debe imprimir lo siguiente:
3 x 1 = 3
3 x 2 = 6
3 x 3 = 9
3 x 4 = 12
3 x 5 = 15
3 x 6 = 18
3 x 7 = 21
3 x 8 = 24
3 x 9 = 27
3 x 10 = 30
*/
	
	public static void main(String[] args) {
		//creamos variable num;
		int num;
		//creamos variable contador inicializada a 1;
		int cont=1;
		//escaner
		Scanner sc=new Scanner(System.in);
		//pedimos el número al usuario
		System.out.println("Introduce el número de la tabla de multiplicar que quiera ver");
		//guardamos valor
		num=sc.nextInt();
		
		//do while para el bucle
		do {
			//imprimimos tabla de multiplicar
			System.out.println(num+" x "+cont+" = "+num*cont);
			cont++;
		}while(cont<=10);
		//cerramos escaner
		sc.close();
	}
}
