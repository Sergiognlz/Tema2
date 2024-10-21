package boletindowhile;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
	/*
	 * Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el
	 * ordenador intenta adivinarlo. Es decir, el ordenador irá proponiendo números
	 * una y otra vez hasta adivinarlo (el usuario deberá indicarle al ordenador si
	 * es mayor, menor o igual al número que ha pensado).
	 */

	public static void main(String[] args) {

		// creamos una variable número
		int num;
		// creamos variables para el valor máximo y mínimo
		int max=101;
		int min=1;
		// creamos variable para string si y no;
		String respuesta = "";
		// creamos booleano
		boolean salir = true;
		// creamos escaner
		Scanner sc = new Scanner(System.in);
		// creamos objeto random
		Random rand = new Random();

		// instrucciones
		System.out.println("Vamos a jugar a un juego. Piensa un número e intentaré adivinarlo");

		// creamos bucle do while
		do {
			// asignamos valor
			num = rand.nextInt(min, max);
			// preguntamos al usuario
			System.out.println("Tu número es " + num);
			// preguntamos si es correcto
			System.out.println("¿Es ese el número que has pensado? mayor/menor/igual");
			// guardamos respuesta
			respuesta = sc.next();
			// creo switch para la respuesta
			switch (respuesta) {
			case "igual" -> {
				// cambiamos el valor de acierto a true
				salir = false;
	
			}
			case "mayor" -> {
				// será false
				salir = true;
				// cambiamos el valor de min añadiendo +1 para que no repita el mismo número. 
				min = num+1;
			}
			case "menor" -> {
				//será false
				salir=true;
				//cambiamos el valor de max
				max=num;

			}
			default -> {
				System.out.println("Has introducido un comando incorrecto");
			}
			}
		} while (salir);
		// mensaje de fin de programa
		System.out.println("He acertado. Fin de programa.");
		// cerra escaner
		sc.close();
	}
}
