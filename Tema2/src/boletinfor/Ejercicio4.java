package boletinfor;

public class Ejercicio4 {
	/*
	 * Diseñar un programa que muestre la suma de los 10 primeros números impares.
	 */

	public static void main(String[] args) {

		// variable suma
		int suma=0;
		//otra variable que cuente hasta 10
		int cont=1;
		// for para recorrer los 10 primeros
		for (int i = 1; cont <= 10; i++) {
			// solo muestre mensaje si es par
			if (i % 2 !=0) {
				//sumamos
				suma+=i;
				cont++;
			}
		}
		// mensaje consola
		System.out.println("La suma de los 10 primeros pares es: " +suma);
	
	}
	
}
