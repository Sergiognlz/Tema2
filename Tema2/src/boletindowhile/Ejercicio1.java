package boletindowhile;

public class Ejercicio1 {
	/*
	 * Realiza un programa que muestre por pantalla los 20 primeros números
	 * naturales (1, 2, 3... 20).
	 */
	
	public static void main(String[] args) {
		//creamos un contador
		int cont=1;
		
		//creamos do while para controlar las 20 iteraciones
		do {
		System.out.println(cont);
		cont++;
		}while(cont<=20);
		
	}
	
}
