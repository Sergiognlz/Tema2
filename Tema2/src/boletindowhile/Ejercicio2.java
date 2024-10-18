package boletindowhile;

public class Ejercicio2 {
	/*
	 * Realiza un programa que muestre los números pares comprendidos entre el 1 y
	 * el 200.
	 */
	public static void main(String[] args) {
		//creamos un contador
		int cont=1;
		
		//creamos do while para controlar las 20 iteraciones
		do {
			if(cont%2==0) {
		System.out.println(cont);
			}
		cont++;
		}while(cont<=200);
	
	}
}
