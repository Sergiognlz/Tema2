package bucles;

import java.util.Scanner;

public class Ejercicio5 {
	/*
	 * Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre
	 * por pantalla los números desde 1 hasta N, uno en cada línea, repitiendo cada
	 * número tantas veces como su valor. Ejemplo:
	 * 
	 * 1 
	 * 22 
	 * 333 
	 * 4444 
	 * 55555
	 */
	public static void main(String[] args) {

	//creamos variable para número
		int num;
		//creamos escaner
		Scanner sc=new Scanner(System.in);
		
		//do while de control
		do {
		//pedimos número
			System.out.println("Introduce un número");
			//guardamos 
			num=sc.nextInt();
		}while(num<0&&num>20);
		
		//for para recorrer desde el 1 hasta el número que introducimos
		for(int i=1;i<=num;i++) {
		
			//otro for dentro que no sé muy bien que hace pero es necesario
			for(int j=1;j<i;j++) {
				
			
			//imprimimos por pantalla
			System.out.print(i);
			}
			//aqui imprimimos i con tabulador
			System.out.println(i);
		}
		//cerramos escaner
		sc.close();	
	}
}
