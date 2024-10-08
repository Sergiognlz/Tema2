package BoletinIfElse;

import java.util.Scanner;

public class Ejercicio8 {
/*Escribir una aplicación que pida al usuario un número real y muestre por pantalla la nota del alumno, teniendo en cuenta:
[0-5) es INSUFICIENTE (0 inclusive)
[5-6) es SUFICIENTE (5 inclusive)
[6-7) es BIEN (6 inclusive)
[7-9) es NOTABLE (7 inclusive)
[9-10] es SOBRESALIENTE (9 y 10 inclusives)
*/
	public static void main(String[] args) {
		//creamos una variable dónde guardar el número que pediremos al usuario
		double num;
		//creamos objeto escáner
		Scanner sc=new Scanner(System.in);
		
		//pedimos un número real al usuario
		System.out.println("Introduce un número decimal");
		//guardamos el número en la variable num
		num=sc.nextDouble();
		
		//creamos un if else para cada caso
		if(num>=0&&num<5) {
			//imprimimos por pantalla el resultado
			System.out.println("Insuficiente");
		}else if(num>=5&&num<6) {
			System.out.println("Suficiente");
		}else if(num>=6&&num<7) {
			System.out.println("Bien");
		}else if(num>=7&&num<9) {
			System.out.println("Notable");
		}else if(num>=9&&num<10) {
			System.out.println("Sobresaliente");
		}else {
			System.out.println("El valor introducido no es válido.");
		}
		//cerramos escaner
		sc.close();
	}
}
