package ejerciciosSwitch;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
//creamos variable número 1 y 2
		String dado1, dado2;
		//creamos variables para los valores enteros
		int valor1,valor2;
		// creamos escanner
		Scanner sc = new Scanner(System.in);
		// pedimos al usuario que introduza el primer número como cadena
		System.out.println("Introduce tu primera tirada de dados (1d6) con letras");
		// leemos el número introducido
		dado1 = sc.next();	
// pedimos al usuario que introduzca el segundo número como cadena
		System.out.println("Introduce tu segunda tirada de dados (1d6) con letras");
		// leemos el número
		dado2 = sc.next();
		//creamos switch para convertir el dado 1 en un valor entero.
	valor1=switch(dado1) {
	case "Uno"-> 1;
	case "Dos"->2;
	case "Tres"->3;
	case "Cuatro"->4;
	case "Cinco"->5;
	case "Seis"->6;
	default->0;};
	
	//creamos otro switch para convertir el dado en dado 2 en un valor entero
	valor2=switch(dado2) {
	case "Uno"-> 1;
	case "Dos"->2;
	case "Tres"->3;
	case "Cuatro"->4;
	case "Cinco"->5;
	case "Seis"->6;
	default->0;};
	//mostramos pantalla con la suma de ambos números		
	System.out.println("La suma de tus tiradas es "+(valor1+valor2));
	//cerramos escanner
	sc.close();
		}
		

}
		
