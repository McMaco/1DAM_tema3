/*Realiza un programa que analice si un numero de 3 cifras es capicua o no*/

/***PROGRAMA DE COMPROBACIÓN SI UN NÚMERO DE 3 CIFRAS ES CAPICÚA O NO
* AUTOR: DAVID MCCONNELL VICENTE
* FECHA: 16/10/2018
* CURSO: DM1B
*/

import java.util.Scanner;

public class numero_capicua_3 {
		
		public static void main(String[] args) {
			
			/*DEFINIMOS LAS VARIABLES */
			int num, c, d, u;
			
			/*PEDIMOS EL NÚMERO A INTRODUCIR*/
			System.out.println();
			System.out.println("-----------------------------------------");
			System.out.println("PROGRAMA QUE DICE SI UN NUMERO ES CAPICUA");
			System.out.println("-----------------------------------------");
			System.out.println();
			Scanner teclado= new Scanner(System.in);
			System.out.print("Introduzca un número de 3 cifras: ");
			num= teclado.nextInt();
			
			/*METODOS*/
			if ((num>=100)&&(num<=999)) {
				
				c = num/100;
				d = (num%100) /10;
				u = (num%100) %10;
				
				if(c == u) {
					System.out.println("El número introducido es capicua");
				}
				
				else {
					System.out.println("El número introducido no es capicua");
				}
			}	
			else {
				System.out.println("El número introducido no es de 3 cifras");
			}
		}		
	}
