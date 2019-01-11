/***PROGRAMA QUE DICE SI UN A�O ES BISIESTO
 * AUTOR: DAVID MCCONNELL VICENTE
 * FECHA: 28/10/2018
 * CURSO: DM1B
 */

import java.util.Scanner;

public class a�o_bisiesto {
	
	public static void main(String [] args) {
		
		/*CABECERA*/
		System.out.println("-------------------------------------------");
		System.out.println("PROGRAMA QUE CALCULA SI UN A�O ES BISIESTO.");
		System.out.println("-------------------------------------------");
		
		/*VARIABLES*/
		int anio;
		
		
		
		/*METODOS*/
		do {
			/*PEDIMOS EL A�O POR TECLADO*/
			Scanner teclado= new Scanner(System.in);
			System.out.println("Introduzca el a�o: ");
			anio= teclado.nextInt();

		}while(anio<=0);
		
		if ((anio%4==0) && (anio%100!=0)) {
			System.out.println("El a�o "+ anio +" es bisiesto.");
			
		}
		else {
			System.out.println("El a�o "+ anio +" no es bisiesto.");
		}
		
	}

}
