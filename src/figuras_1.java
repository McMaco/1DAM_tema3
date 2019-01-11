/*Realiza un programma utilizando bucles que muestre un triangulo rectángulo por pantalla*/

/***PROGRAMA DE HACER UN TRIANGULO RECTANGULO
 * AUTOR: DAVID MCCONNELL VICENTE
 * FECHA: 16/10/2018
 * CURSO: DM1B
 */

import java.util.Scanner;

public class figuras_1 {
	
	public static void main(String [] args) {
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduzca el numero de filas a pintar");
		
		int n=teclado.nextInt();
		int i, j;
		
		for (i=1; i<=n; i++) {
			for (j=0;j<i;j++) {
				System.out.print("*");
		} 
		System.out.println("");
	}

}
}
