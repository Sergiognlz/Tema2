package aprendeProgramar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E33 {
	/*
	 * Desarrollar un programa que muestre la tabla de multiplicar del número X,
	 * hasta el valor Y. Ambos los leerá de la entrada estándar y estarán en una
	 * sola línea, cumpliendo: -50 <= X <= 50, 1 <= Y <= 20 La tabla la mostrará con
	 * una entrada por línea. Entre cada elemento habrá un único espacio de
	 * separación.
	 */
public static void main(String[] args) {
	//cremos las variables X e Y
	int x=0, y=0;
	//escaner
	Scanner sc=new Scanner(System.in);
	//do while try catch
	do {
		try {
			System.out.println("Introduce un valor X y un valor Y.");
			x=sc.nextInt();
			y=sc.nextInt();
			
		}catch(InputMismatchException e) {
			System.out.println("Los valores introducidos no son válidos");
			sc.nextLine();
		}
	}while((x<(-50)||x>50)||(y<1||y>20));
	//creemos bucle que cuente del 1 al número introducido
	for(int i=1;i<=x;i++) {
		
	}
}
}