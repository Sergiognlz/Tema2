package practicasExamen;

import java.util.Scanner;

public class Practica8 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese un número para el tamaño de la bandera: ");
	        int n = scanner.nextInt();

	        // Dibujar la bandera del Reino Unido con asteriscos
	        drawUnionJack(n);
	    }

	    private static void drawUnionJack(int n) {
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                // Dibuja la cruz vertical y horizontal
	                if (j==0||j == n / 2 ||j==n-1|| i == n / 2||i==0||i==n-1) {
	                    System.out.print("* ");
	                } else {
	                    // Dibuja la cruz diagonal
	                    if (i == j || i + j == n - 1) {
	                        System.out.print("* ");
	                    } else {
	                        System.out.print("  ");
	                    }
	                }
	            }
	            System.out.println();
	        }
	    }
	}