package ejerciciosWhile;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		// creamos las variables
		int numero, resto;
		// creamos escaner
		Scanner sc = new Scanner(System.in);
		// pedimos al usuario un número y añadimos instrucciones
		System.out.println("Introduce un número positivo o negativo. Introduce 0 para salir");
		// leemos el número
		numero = sc.nextInt();
		// asignamos equivalencias
		
		// creamos el while
		while (numero != 0) {
			resto = (numero % 2);
			if (resto == 0) {
				// mostramos pantalla para número par
				System.out.println("El número introducido es par");
				numero = sc.nextInt();
			} else  {
				// mostramos pantalla para número impar
				System.out.println("El número introducido es impar");
				numero = sc.nextInt();
			}}
			// creamos el mensaje que se mostrará cuando salga del bucle
			System.out.println("Fin ");
			// cerramos escaner
			sc.close();
		
	}
}