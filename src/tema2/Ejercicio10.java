package tema2;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		// creamos variables para cada número entero
		int numero1, numero2, numero3;
		// creamos escaner
		Scanner sc = new Scanner(System.in);

		// pedimos al usuario el primer número
		System.out.println("Introduce el primer número");
		// leemos el número introducido
		numero1 = sc.nextInt();
		// pedimos al usuario el segudno número
		System.out.println("Introduce el segundo número");
		// leemos el número introducido
		numero2 = sc.nextInt();
		// pedimos al usuario el tercer número
		System.out.println("Introduce el segundo número");
		// leemos el número introducido
		numero3 = sc.nextInt();
		
		//creamos condicional
		if ((numero1+numero2)==(numero3)){
			//mostramos por consola si se cumple la condición
			System.out.println("La suma de " +numero1+" más " +numero2 +" es igual a " + numero3);
			//creamos un else en el caso de que no se cumpla la condición establecida
		}else {
			System.out.println("La suma de "+numero1+" más "+numero2+" no es igual a "+numero3);
			//cerramos el escaner
			sc.close();
			
		}
		

	}
}
