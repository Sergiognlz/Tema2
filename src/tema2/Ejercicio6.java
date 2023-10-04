package tema2;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		// creamos las variables que vamos a utilizar
		double a, b, c, x1, x2;
		// creamos escaner
		Scanner sc = new Scanner(System.in);
		// pedimos al usuario el valor de la variable a
		System.out.println("Introduce el valor de a");
		// leemos el numero introducido
		a = sc.nextDouble();
		// pedimos al usuario el valor de la variable b
		System.out.println("Introduce el valor de b");
		// leemos el numero introducido
		b = sc.nextDouble();
		// pedimos al usuario el valor de la variable c
		System.out.println("Introduce el valor de c");
		// leemos el numero introducido
		c = sc.nextDouble();
		// realizamos la operación con las variables
		x1 = ((-b + Math.sqrt(Math.pow(b,2) - 4 * a * c)) / 2 * a);
		x2 = ((-b - Math.sqrt(Math.pow(b,2) - 4 * a * c)) / 2 * a);
		// mostramos el resultado por consola
		
		if ((x1>0)&&(x2>0)){
		
		System.out.println("Según la ecuación ax^+bx+c=0 el valor de x será: " + x1 + " y " + x2);
		// cerramos escanner
		
		}else {
			System.out.println("No existe la raiz cuadrada del número introducido, por lo tanto no puede calcularse el valor de x");
		}
		
		sc.close();

	}
}