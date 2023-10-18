package ejerciciosDoWhile;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		// creamos variables
		int numero, contador = 0;
		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		// pedimos al usuario un número que mostrar su tabla de multiplicar
		System.out.println("Introduce un número para ver su tabla de multiplicar");
		// leemos el número
		numero = sc.nextInt();
		// creamos bucle iniciando con do
		do {
			contador++;
			// mostramos tabla de multiplicar
			System.out.println(numero + "x" + contador + "=" + numero * contador);
			//establecemos el valor que hará que el bucle se repita
			//en este caso ponemos 9 porque si ponemos 10 hace 11 operaciones
		} while (contador <= 9);

		sc.close();

	}
}
