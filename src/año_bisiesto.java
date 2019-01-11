/***PROGRAMA QUE DICE SI UN AÑO ES BISIESTO
 * AUTOR: DAVID MCCONNELL VICENTE
 * FECHA: 28/10/2018
 * CURSO: DM1B
 */

import java.util.Scanner;

public class año_bisiesto {
	
	public static void main(String [] args) {
		
		/*CABECERA*/
		System.out.println("-------------------------------------------");
		System.out.println("PROGRAMA QUE CALCULA SI UN AÑO ES BISIESTO.");
		System.out.println("-------------------------------------------");
		
		/*VARIABLES*/
		int anio;
		
		
		
		/*METODOS*/
		do {
			/*PEDIMOS EL AÑO POR TECLADO*/
			Scanner teclado= new Scanner(System.in);
			System.out.println("Introduzca el año: ");
			anio= teclado.nextInt();

		}while(anio<=0);
		
		if ((anio%4==0) && (anio%100!=0)) {
			System.out.println("El año "+ anio +" es bisiesto.");
			
		}
		else {
			System.out.println("El año "+ anio +" no es bisiesto.");
		}
		
	}

}
