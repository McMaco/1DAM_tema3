/*Ejercicio de métodos                                  [ALMACENAR TODO EN EL MAIN]
 * getSuma(int a, int b)--> a+b
 * getResta( "  ,  "   )--> a-b
 * getDiv( "    ,   "  )--> a/b
 * getMult(  "   ,   "  )--> a*b
 * getDato(     )--> recibe el dato del ususario
 * show(int d)--> muestra por pantalla el dato
 * menu(int d)--> 5 opc
 */

/***PROGRAMA DE MÉTODOS
 * AUTOR: DAVID MCCONNELL VICENTE
 * FECHA: 30/10/2018
 * CURSO: DM1B
 */

import java.util.Scanner;

public class métodos {
	
	
	public static int getDato() {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el dato: ");
		int d = teclado.nextInt();
		
		return d;
	}
	
	public static int getSuma() {
		
		int a= getDato();
		int b= getDato();
		
		return a+b;
	}
	
	public static int getResta() {
		
		int a= getDato();
		int b= getDato();
		
		return a-b;
	}
	
	public static double getDiv() {
		
		double a= getDato();
		double b= getDato();
		
		double resultado=-1;
		
		if (b!=0) {
			resultado = a/b;
		}
		else {
			System.out.println("Lo sentimos no se puede dividir un número entre 0");
		}
		
		return resultado;
	}
	
	public static int getMult() {
		
		int a= getDato();
		int b= getDato();
		
		return a*b;
	}
	
	public static void Show(int opc) { 		
		switch(opc) {
			case 0: //OPCIÓN SALIR
				System.out.println("Gracias por probar la clase");
			break;
				
			case 1: //HACE LA SUMA
				System.out.println("El resultado de sumar los dos valores es: "+ getSuma());
			break;
				
			case 2: //HACE LA RESTA
				System.out.println("El resultado de restar los dos valores es: "+ getResta());
			break;
				
			case 3: //HACE LA DIVISION
				System.out.println("El resultado de dividir los dos valores es: "+ getDiv());
			break;
				
			case 4: //HACE LA MULTIPLICACIÓN
				System.out.println("El resultado de multiplicar los dos valores es: "+ getMult());
			break;
		}
		
	}
	
		
	public static void main(String [] args) {
		
		System.out.println();
		System.out.println("---------------------------");
		System.out.println("TESTEO DEL PROGRAMA METODOS");
		System.out.println("---------------------------");
		System.out.println();
		
		System.out.println("0.- Salir");
		System.out.println("1.- Hace la suma de los numeros introducidos");
		System.out.println("2.- Hace la resta de los numeros introducidos");
		System.out.println("3.- Hace la división de los numeros introducidos");
		System.out.println("4.- Hace la multilicación de los numeros introducidos");
		System.out.println();
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduce una opción: ");
		int opc = teclado.nextInt();
		
		Show(opc);
		
		
		
	}

}
