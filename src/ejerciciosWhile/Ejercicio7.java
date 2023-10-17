package ejerciciosWhile;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        
	        int numeroSecreto = random.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100
	        int intentos = 0;
	        
	        System.out.println("Bienvenido al juego \"El número secreto\".");
	        System.out.println("Intenta adivinar el número secreto entre 1 y 100.");
	        
	        while (true) {
	            System.out.print("Introduce tu adivinanza (-1 para rendirte): ");
	            int adivinanza = scanner.nextInt();
	            intentos++;
	            
	            if (adivinanza == -1) {
	                System.out.println("Te has rendido. El número secreto era " + numeroSecreto + ".");
	                break;
	            } else if (adivinanza < 1 || adivinanza > 100) {
	                System.out.println("Por favor, introduce un número entre 1 y 100.");
	            } else if (adivinanza < numeroSecreto) {
	                System.out.println("El número secreto es mayor. Intenta de nuevo.");
	            } else if (adivinanza > numeroSecreto) {
	                System.out.println("El número secreto es menor. Intenta de nuevo.");
	            } else {
	                System.out.println("¡Felicidades! Has adivinado el número secreto en " + intentos + " intentos.");
	                break;
	            }
	        }
	        
	        scanner.close();
	    }
	}