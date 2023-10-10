package ejerciciosSwitch;

import java.util.Scanner;

public class Ejercicio5 {
public static void main(String[] args) {
	//creamos variables de la letra a guardar
	String valor;
	//creamos el escaner 
	Scanner sc=new Scanner(System.in);
	//pedimos al usuario que introduzca el valor del carnet
	System.out.println("Introduce el código del carnet a comprobar");
	//leemos el numero
	valor=sc.next();

	//creamos switch
	switch(valor) {
	//creamos los casos para cada opción del menú
	case "E"->{
		System.out.println("Remolques");}
	case "D"->{
		System.out.println("Autobuses");}
	case "C1","C2","C3","C4","C5"->{
		System.out.println("Camiones");}
	case "A"->{
		System.out.println("Motocicletas");}
	case "B1","B2"->{
		System.out.println("Automóbiles");}
	default->{
	System.out.println("Categoría no contemplada.");
	//cerramos escaner
	sc.close();
		
}
	}}}
