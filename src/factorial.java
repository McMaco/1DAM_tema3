/*Realizar un programa que calcule el factorial de un entero 
 * mayor que 0
 */

/***PROGRAMA DE BUSQUEDA DEL FACTORIAL DE UN NUMERO
 * AUTOR: DAVID MCCONNELL VICENTE
 * FECHA: 16/10/2018
 * CURSO: DM1B
 */

import java.util.Scanner;

public class factorial {
	
	public static double Factorial(double n) {
		
		if (n!=1)    n*=Factorial(n-1);
		
		return n;
	}

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		double n, fac;
		do {
			System.out.println("Introduce un numero mayor que 0");
			n= teclado.nextDouble();
		}while(n<1);
		
		fac= Factorial(n);
		
		System.out.println("El factorial de "+ n +" es "+ fac );
		

	}	
}
