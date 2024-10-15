package boletinwhile;

import java.util.Scanner;

public class Ejercicio6 {
	/*
	 * Un centro de investigación de la flora urbana necesita una aplicación que
	 * muestre cuál es el árbol más alto. Para ello se introducirá por teclado la
	 * altura (en centímetros) de cada árbol (terminando la introducción de datos
	 * cuando se utilice -1 como altura). La aplicación debe devolver la altura del
	 * árbol más alto.
	 */
	public static void main(String[] args) {
		// creamos variable para los cm introducidos
		int cent;
		// creamos variable para amacenar el árbol más alto
		int arbol=0;
		// escaner
		Scanner sc = new Scanner(System.in);

		// pedimos al usuario que introduzca la altura en cms
		System.out.println("Introduce la altura en cms. Valor negativo para finalizar programa");
		// guardamos el valor en la variable cent
		cent = sc.nextInt();
		// while para controlar la entrada de valores y repetición de instrucciones
		while (cent > 0) {
			//creamos un if para que controle que solo asigne la altura a la variable arbol cuando esta sea mayor que su valor actual.
			if(cent>=arbol) {
				//declaramos nuevo valor de variable arbol
				arbol=cent;
			}
			// pedimos al usuario que introduzca la altura en cms
			System.out.println("Introduce la altura en cms. Valor negativo para finalizar programa");
			// guardamos el valor en la variable cent
			cent = sc.nextInt();

		}
		//mensaje de finalizar programa y resultado
		System.out.println("Fin de programa. Mayor altura de árbol en cms: "+arbol);
		//cerrar escaner
		sc.close();
	}
}
