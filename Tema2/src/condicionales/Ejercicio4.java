package condicionales;

import java.util.Scanner;


public class Ejercicio4 {
	/*
	 * Escribe un programa que solicite al usuario un número entero entre 1 y 99. El
	 * programa debe mostrarlo con letras, por ejemplo, para 56 se verá: “cincuenta
	 * y seis”.
	 */
	
	//Putas pruebas
	 /* Entrada 		Esperado 		Resultado
	 * 0				0				0
	 * -15				15				15
	 * 30				30				30
	 */
	public static void main(String[] args) {
		//creamos una variable donde guardar el número que introduciremos
		int num;
		//creamos cadenas de los números para agilizar
		final String UNO="uno";
		final String DOS="dos";
		final String TRES="tres";
		final String CUATRO="cuatro";
		final String CINCO="cinco";
		final String SEIS="seis";
		final String SIETE="siete";
		final String OCHO="ocho";
		final String NUEVE="nueve";
		final String DIECI="dieci";
		final String VEINTI="veinti";
		
		//creamos escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos al usuario un número
		System.out.println("Introduce un número entre 1 y 99");
		//guardamos el número en la variable
		num=sc.nextInt();
		//comprobamos mediante un if else que el número se encuentre entre el rango deseado
		if(num>=1&&num<=99) {
			//dividiremos los números menores de 20 que necesitan cadenas individuales ya que no se repiten
			if(num<=20) {
			//vamos a crear un switch para los números que vayan del 1 al 20
			switch(num) {
			case 1->System.out.println(UNO);
			case 2->System.out.println(DOS);
			case 3->System.out.println(TRES);
			case 4->System.out.println(CUATRO);
			case 5->System.out.println(CINCO);
			case 6->System.out.println(SEIS);
			case 7->System.out.println(SIETE);
			case 8->System.out.println(OCHO);
			case 9->System.out.println(NUEVE);
			case 10->System.out.println("diez");
			case 11->System.out.println("once");
			case 12->System.out.println("doce");
			case 13->System.out.println("trece");
			case 14->System.out.println("catorce");
			case 15->System.out.println("quince");
			case 16->System.out.println("dieciséis");
			case 17->System.out.println(DIECI+SIETE);
			case 18->System.out.println(DIECI+OCHO);
			case 19->System.out.println(DIECI+NUEVE);
			case 20->System.out.println("veinte");
			}
			
			
			}
		}else {
			//en caso contrario mensaje de error
			System.out.println("El número introducido no es válido");
		}
		//cerramos escaner
		sc.close();
		
		
	}
	
}
