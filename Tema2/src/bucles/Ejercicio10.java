package bucles;

import java.util.Scanner;

public class Ejercicio10 {
	/*
	 * Realiza un programa que nos diga si un número introducido por teclado es
	 * capicúa o no. El número debe ser mayor o igual que 0.
	 */
	public static void main(String[] args) {
		// variable para guardar el número introducido
		int num;
		int cifraFinal;
		int cifraPrim;
		int copiaNum;
		int cifras=0;
		int inverso=0;
		// escaner
		Scanner sc = new Scanner(System.in);

		do {
			// pedimos número
			System.out.println("Introduce un número mayor que 0");
			// guardamos
			num = sc.nextInt();
		} while (num < 0);

		copiaNum = num;
		while (copiaNum != 0) {
			for (int i = 1; i <= copiaNum; i *= 10) {
				cifras = i;
			}

			cifraFinal = copiaNum % 10;
			cifraPrim = copiaNum / 10;
			inverso +=(cifraFinal * cifras);
			copiaNum/=10;

		}
		if(inverso==num) {
			System.out.println("Es capicúa");
		}else {
			System.out.println("No es capicúa");
		}

		// cerramos escaner
		sc.close();

	}
}
