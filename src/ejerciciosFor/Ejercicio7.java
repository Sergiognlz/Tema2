package ejerciciosFor;

import java.util.Scanner;

//Pedir un número y calcular su factorial. Por ejemplo, el factorial de 5 se denota 5! y es igual a 5x4x3x2x1 = 120.
public class Ejercicio7 {
public static void main(String[] args) {
//creamos variables a usar
	int numero, factorial=1;
	//creamos escaner
	Scanner sc=new Scanner(System.in);
	
//pedimos un número al usuario
	System.out.println("Introduce un número");
	//guardamos el número
	numero=sc.nextInt();
	
	//creamos el bucle con for para aplicar un incremento
	for(int contador=numero;contador>0;contador--){
		//guardamos el resultado de cada multiplicación y la sumamos.
		factorial=factorial*contador;
	}
	//imprimimos el resultado
	System.out.println("El factorial de "+numero+" es "+factorial);
	//cerramos el escaner
	sc.close();
}
}
