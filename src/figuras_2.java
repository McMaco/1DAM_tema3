/*Realiza un programam utilizando bucles que muestre un rombo por pantalla*/

/***PROGRAMA DE HACER UN ROMBO
 * AUTOR: DAVID MCCONNELL VICENTE
 * FECHA: 16/10/2018
 * CURSO: DM1B
 */

import java.util.Scanner;

public class figuras_2 {
	
	public static void main(String [] args) {
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduzca el numero de filas a pintar");
		int n= teclado.nextInt();
		int i, j, k;
		
		k= n/2;
		
		for(i=1; i<=(k+1); i++) {
			for(j=0;j<(k+1)-i;j++) {
				System.out.print(" ");
			}
			for(j=0;j<(i+(i-1));j++) {
				System.out.print("*");		
			}
			System.out.println();
		}
		
	    for (i=k; i>0; i--) { 
	           for (j=((k+1)-i);j>0;j--) {
	        	   System.out.print(" ");
	           }
	        for (j=(i+(i-1));j>0;j--) { 
	           System.out.print("*");
	        } 
	        System.out.println();
	    } 
	}
}