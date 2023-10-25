package ejerciciosFor;

//Diseñar un programa que muestre la suma de los 10 primeros números impares.

public class Ejercicio6 {
public static void main(String[] args) {
	
	//creamos la variable dónde guardaremos el número	
	int suma=0, numeroImpar=1;
	//Creamos el bucle controlado que leerá los 10 primeros número impares
	for( int contador=1; contador<=10;contador++) {
	suma+=numeroImpar;
	numeroImpar+=2;	

	}

//imprimimos pantalla con l amedia de los números
	System.out.println("La suma de los números impares del 1 al 10 es: " +suma);
	
	

}
}