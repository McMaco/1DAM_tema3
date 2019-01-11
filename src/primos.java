/*Realizar un programa que pida al usuario un n�mero mayor que 1, 
 * y muestre todos los n�meros primos que existen entre dicho n�mero y el 1.
 */

/*** PROGRAMA DE BUSQUEDA DE N�MEROS PRIMOS

*** AUTOR: DAVID MCCONNELL VICENTE

*** FECHA: 16/10/2018

*** CURSO: DM1B

***/

import java.util.Scanner;

public class primos {
	
	public static void main(String [] args) {
	int i,j,n;
	Scanner teclado= new Scanner(System.in);
	
	do {
		System.out.println("Introduce un numero mayor que 0"); 
		n= teclado.nextInt();
	}while(n<1);
	
	for (i=1;i<=n;i++) {
		j=2;
		while(((i%j)!=0)&&(j<i)) {
			j++;
		}
		if (j==i) System.out.print(i+" ");
		
		
	}
     
    }
}
