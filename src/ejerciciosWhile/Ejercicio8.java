package ejerciciosWhile;

import java.util.Scanner;

public class Ejercicio8 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double alturaMaxima = 0, altura;
	        
	        System.out.println("Introduce la altura de los árboles en centímetros.:");
	        System.out.println("Introduce un número negativo para finalizar");
	        
	        while (true) {
	             altura = scanner.nextDouble();
	            if (altura ==-1) {
	                break;
	            }
	            if (altura > alturaMaxima) {
	                alturaMaxima = altura;
	            }
	        }
	        
	        System.out.println("La altura del árbol más alto es: " + alturaMaxima + " centímetros.");
	  }}