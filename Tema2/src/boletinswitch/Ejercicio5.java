package boletinswitch;

import java.util.Scanner;

public class Ejercicio5 {
	/*
	 * Queremos saber, una vez introducida la letra del tipo de carnet de conducir,
	 * se debe imprimir a qué tipo de vehículos corresponde: E: remolques. D:
	 * autobuses. C1-C5: camiones. A: motocicletas. B1-B2: automóviles. En caso de
	 * introducir uno distinto: “Categoría no contemplada”.
	 */
	public static void main(String[] args) {
		//creamos variable para la cadena introducida
		String letra;
		//creamos escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos al usuario la letra del carnet
		System.out.println("Introduce la letra del carnet de conducir");
		//guardamos el valor
		letra=sc.next();
		//creamos un switch para las opciones
		switch(letra) {
		case "E"->System.out.println("Remolques");
		case "D"->System.out.println("Autobuses");
		case "C1","C2","C3","C4","C5"->System.out.println("Camiones");
		case "A"->System.out.println("Motocicletas");
		case "B1","B2"->System.out.println("Automóviles");
		default->System.out.println("Categoría no contemplada");
		}
		sc.close();
	}
}
