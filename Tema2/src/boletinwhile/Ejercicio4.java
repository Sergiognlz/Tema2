package boletinwhile;

import java.util.Scanner;

public class Ejercicio4 {
	/*
	 * Escribe un algoritmo que pida al usuario 10 números enteros (pueden ser
	 * positivos, negativos o cero). Cuando acabe de insertar los números, el
	 * algoritmo debe mostrar la suma de los números positivos, la media de los
	 * números negativos y el número de ceros que ha introducido el usuario.
	 */
	
	public static void main(String[] args) {
		//creamos una variable para almacenar los números introducidos
		int num;
		//creamos variable para contar los números
		int cont=0;
		//creamos variable donde almacenar la suma
		int suma=0;
		//variable para la media de los negativos
		double media=0;
		//variable para contar los ceros
		int ceros=0;
		//creamos escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos número al usuario
		System.out.println("Introduce 10 números ");
		//guardamos el número
		num=sc.nextInt();
		//creamos bucle while para que mientras los números sean negativos se repita las operaciones
		while(cont<10) {
		
			//creamos if para los negativos
			if(num<0) {
				//declaramos media
				media=(double)suma/cont;
				//if para contar ceros
			}else if(num>0){
				//suma
				suma+=num;
			}else {
				ceros++;
			}
				//volvemos a pedir números al usuario
				System.out.println("Introduce 10 números ");
				//guardamos el número
				num=sc.nextInt();
	
			
			//incremento contador
			cont++;
		}
		//mostramos mensaje de fin de programa y mostrar operaciones
		System.out.println("Fin de programa. ");
		System.out.println("Suma positivos= "+suma);
		System.out.println("Media negativos= "+media);
		System.out.println("Número de ceros= "+ceros);
		//cerramos escaner
		sc.close();
		
	}
}
