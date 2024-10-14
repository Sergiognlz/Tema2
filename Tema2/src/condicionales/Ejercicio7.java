package condicionales;

import java.util.Scanner;

public class Ejercicio7 {
	/*
	 * Determinar el precio de un billete de tren, conociendo la distancia a
	 * recorrer, y sabiendo que si el número de días de estancia es superior a 7 y
	 * la distancia superior a 800 km el billete tiene una reducción del 30%. El
	 * precio por kilómetro es de 2,5€. La distancia a recorrer y el número de días
	 * de estancia los debes solicitar al usuario por teclado.
	 */
	public static void main(String[] args) {
		//creamos dos variables donde guardar la distancia y los días de estancia
		double distancia;
		int dias;
		//creamos variable precio
		double precio;
		//creamos escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos al usuario que introduzca la distancia y los días de estancia
		System.out.println("Introduce la distancia recorrida(KM) y los días de estancia");
		//guardamamos los dos valores introducidos
		distancia=sc.nextDouble();
		dias=sc.nextInt();
		
		//controlamos el rango de entrada
		if(distancia<=0||dias<=0) {
			//mensaje error
			System.out.println("Los valores introducidos no son válidos");
		}else {
		//en caso contrario resolvemos
			precio=(2.5*distancia);
			//si los días son superiores a 7 y la distancia superior a 800 km aplicamos 30% descuento
			if(dias>7&&distancia>800) {
				precio=precio-(precio*0.3);
				System.out.println(precio);
			}else {
				//en caso contrario no se aplica el descuento
				System.out.println(precio);
			}
			
			
		}
		//cerramos escaner
		sc.close();
	}
}

