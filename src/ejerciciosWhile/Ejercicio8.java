package ejerciciosWhile;

import java.util.Scanner;

public class Ejercicio8 {
	public class ArbolMasAlto {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        double alturaArbol;
	        double alturaMaxima = 0;
	        
	        System.out.println("Introduce la altura de los árboles en centímetros.Introduce un número negativo para terminar.");
	        alturaArbol = scanner.nextDouble();
	        
	        while (alturaArbol<=alturaMaxima) {
	         
	         alturaMaxima=alturaArbol;
	        }
	   
	        if(alturaArbol<=0) {
	        
	            System.out.println("El árbol más alto tiene " + alturaMaxima + " centímetros.");
	        } else {
	            System.out.println("El valor introducido no es válido.");
	        }
	        
	        scanner.close();
	    }
	}
}
