package condicionales;

import java.util.Scanner;

public class Ejercicio3 {
	/*
	 * El DNI consta de un entero de 8 dígitos seguido de una letra que se obtiene a
	 * partir del número de la siguiente forma: letra = número DNI módulo 23
	 * Basándote en esta información, elige la letra a partir de la numeración de la
	 * siguiente tabla:
	 */
	/*
	 * Putas pruebas 
	 * Entrada 				Esperado 				Resultado
	 * 30250815				30250815L				30250815L
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// creamos una variable para guardar el número que usaremos
		int dni;
		// variable letra
		String letra;
		// Creamos escaner
		Scanner sc = new Scanner(System.in);

		// pedimos al usuario el dni
		System.out.println("Introduce tu DNI (8 dígitos sin letra).");
		// guardamos el número
		dni = sc.nextInt();
		// comprobamos que el dni tenga justo exacto 9 dígitos con un if else
		if (dni >= 10000000 && dni <= 99999999) {

			// si el válido asignamos una letra al dni mediante un switch

			letra = switch (dni % 23) {

			case 0 -> {
				yield "T";			
			}
			case 1 -> {
				yield "R";
			}
			case 2 -> {
				yield "W";
			}
			case 3 -> {
				yield "A";
			}
			case 4 -> {
				yield "G";
			}
			case 5 -> {
				yield "M";
			}
			case 6 -> {
				yield "Y";
			}
			case 7 -> {
				yield "F";
			}
			case 8-> {
				yield "P";
			}
			case 9 -> {
				yield "D";
			}
			case 10 -> {
				yield "X";
			}
			case 11 -> {
				yield "B";
			}
			case 12 -> {
				yield "N";
			}
			case 13 -> {
				yield "J";
			}
			case 14 -> {
				yield "Z";
			}
			case 15 -> {
				yield "S";
			}
			case 16 -> {
				yield "Q";
			}
			case 17 -> {
				yield "V";
			}
			case 18 -> {
				yield "H";
			}
			case 19 -> {
				yield "L";
			}
			case 20 -> {
				yield "C";
			}
			case 21 -> {
				yield "K";
			}	
			case 22 -> {
				yield "E";
			
			}
			default->{
				yield "error";
			}
			
			};
			System.out.println(dni+letra);
			
		} else{
			// en caso de no tener 8 dígitos exactos saltará mensaje de error
			System.out.println("El número introducido no es válido");


}
}
}
