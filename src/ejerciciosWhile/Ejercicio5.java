package ejerciciosWhile;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		//creamos las variables
		int contador=0, numero,suma=0,ceros=0, contadoNegat=0;
		double media=0;
	
		//creamos escaner
		Scanner sc=new Scanner(System.in);
		//pedimos al usuario un número y añadimos instrucciones
		//System.out.println("Introduce 10 números.");
		//leemos el número
		//numero=sc.nextInt();
		//creamos el while
		while(contador<10) {
			contador++;
		//mostramos pantalla
		System.out.println("Introduce un número.");
		//leemos el número introducido
		numero=sc.nextInt();
		if (numero>0){
			suma+=numero;}
		 else if(numero<0){
			 contadoNegat++;
			 media+=numero;
			 }
		 else ceros++;
		 }
		media=media/contadoNegat;
	 //creamos el mensaje que se mostrará cuando salga del bucle
		System.out.println("La suma de los números positivos es es: "+suma);
		System.out.println("La media de los números negativos es: "+media);
		System.out.println("Has introducido "+ ceros+" ceros.");
		//cerramos escaner
		sc.close();
}}
