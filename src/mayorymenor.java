/*Realiza un programa con 3 variables de tipo entero a, b y c.
 *  El programa debera mostrar por pantalla el valor mayor  y menor.
 */

/***PROGRAMA DE BUSQUEDA DEL MAYOR Y EL MENOR
 * AUTOR: DAVID MCCONNELL VICENTE
 * FECHA: 16/10/2018
 * CURSO: DM1B
 */

import java.util.Scanner;

public class mayorymenor {
	
	public static void main(String [] args) {
		
		Scanner teclado= new Scanner(System.in);
		
		int a, b, c, mayor, menor;
		
		
		System.out.println("Introduzca el primer numero");
		a= teclado.nextInt();
		System.out.println("Introduzca el segundo numero");
		b= teclado.nextInt();
		System.out.println("Introduzca el tercer numero");
		c= teclado.nextInt();
		
		if (a<b) {
			if(b<c) {
				mayor=c;
				menor=a;
			}
			else {
				mayor=b;
				if(a<c) menor=a;
				else menor=c;
			}
		}
		
		else {
			if(a<c) {
				mayor=c;
				menor=b;
			}
			
			else {
				mayor=a;
				if(b<c) menor=b;
				else menor=c;
			}
		}
		System.out.println("El mayor de los numeros es: "+ mayor);
		System.out.println("El menor de los numeros es: "+ menor);
	
	}
}
		