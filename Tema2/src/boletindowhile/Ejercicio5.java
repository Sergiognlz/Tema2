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
		
	//creamos una variable número 
		int num;
		//creamos variables para el valor máximo y mínimo
		int max=1;
		int min=100;
		//creamos variable para string si y no;
		String respuesta="si";
		//creamos booleano
		boolean acierto=false;
		//creamos escaner
		Scanner sc=new Scanner(System.in);
		//creamos objeto random
		Random rand=new Random();
		
		//instrucciones
		System.out.println("Vamos a jugar a un juego. Piensa un número e intentaré adivinarlo");
	

		//creamos bucle do while
		do {
			//asignamos valor
			num=rand.nextInt(min,max);
			//preguntamos al usuario
			System.out.println("Tu número es "+num);
			//preguntamos si es correcto
			System.out.println("¿Es ese el número que has pensado? Si/no");
			//guardamos respuesta
			respuesta=sc.next();
				//creo switch para la respuesta
			switch(respuesta) {
			case "si"->{
				acierto=true;
			}
			case "no"->{
				acierto=false;
			}
			}
		}while(acierto);
		//mensaje de fin de programa
		System.out.println("He acertado. Fin de programa.");
		//cerra escaner
		sc.close();
	}
}
