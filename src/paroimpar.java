/***PROGRAMA DE PARES E IMPARES
 * AUTOR: DAVID MCCONNELL VICENTE
 * FECHA: 16/10/2018
 * CURSO: DM1B
 */

import java.util.Scanner;

public class paroimpar {
	
	public static void main(String [] args) {
		
		Scanner teclado= new Scanner(System.in);
		
		int numero, nuevonum;
		
		System.out.println("Introduzca un número");
		numero= teclado.nextInt();
		
		nuevonum= numero%2;
		
		if (nuevonum==0) {
			System.out.println("El numero "+ numero + " es par");
		}
		else {
			System.out.println("El numero "+ numero +" es impar");
			}
		 
	}

}
