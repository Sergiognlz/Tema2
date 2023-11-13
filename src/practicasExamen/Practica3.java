package practicasExamen;


	import java.util.Scanner;
	public class Practica3 {
		public static void main(String[] args) {
			
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese un número para la base y altura del cuadrado: ");
	        int n = scanner.nextInt();

	        // Dibujar la silueta del cuadrado
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                // Imprimir '*' solo en los bordes del cuadrado
	                if (i == 0 || i == n - 1 || j == 0 || j == n - 1||i==1||i==n-2||j==1||j==n-2) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  "); // Espacio en blanco para el interior del cuadrado
	                }
	            }
	            System.out.println();
	        }

	        scanner.close();
	    }
}
