package tema2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {
public static void main(String[] args) {
	//creamos variable número a introducir
	float numero;
	//creamos escaner
	Scanner sc=new Scanner(System.in);
	//creamos la localización del escaner
	sc.useLocale(Locale.US);
	//pedimos al usuario un número
	System.out.println("Introduce un número decimal");
	//leemos el número introducido
	numero=sc.nextFloat();
	//creamos la condicional
	if (numero<1&&numero>-1&&numero!=1&&numero!=-1&&numero!=0) {
		//mostramos pantalla con el cumplimiento de la condicional
		System.out.println("Es un número Casi-Cero");
		//creamos el else con el resultado que se mostrará si no se cumple la condicional
	}else{
		System.out.println("No es un número Casi-Cero");
		//cerramos escaner
		sc.close();
		
	}
	
}
}
