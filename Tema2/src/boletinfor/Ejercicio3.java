package boletinfor;

import java.util.Scanner;

public class Ejercicio3 {
	/* Pedir diez números por teclado y mostrar la media. */
	public static void main(String[] args) {
		//variables autodescriptiva
		int suma=0;
		//escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos números al usuario
		System.out.println("Introduce 10 números");
		//for para almacenar la suma de los 10 números
		for(int i=1;i<=10;i++) {
			//almacenamos los números en la variable suma
			suma+=sc.nextInt();
		}
		//mostramos media por pantalla y casteamos
		System.out.println((double)suma/10);
		//cerramos escaner
		sc.close();
	}

}
