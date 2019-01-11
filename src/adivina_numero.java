/*Programa paa adivinar un numero aleatorio del 1 al 100*/

/***
 * PROGRAMA PARA ADIVINAR NUMERO 
 * AUTOR: DAVID MCCONNELL
 * VICENTE FECHA: 16/10/2018 CURSO: DM1B
 */

import java.util.Scanner;

public class adivina_numero {

	public static double numeroaleatorio() {

		return (int) (Math.random() * 100 + 1);
	}

	public static void main(String[] args) {
		int aleatorio = (int) numeroaleatorio();
		int num;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Introduzca el numero que cree que es: ");
			num = teclado.nextInt();
			
		} while ((num>0)&&(num<=100));
		
			if (num > aleatorio) {
				System.out.print("Lo sentimos, el numero que ha introducido es mayor al numero a adivinar vuelva a intentarlo");
						

			}
			if (num < aleatorio) {
				System.out.print("Lo sentimos, el numero que ha introducido es menor al numero a adivinar vuelva a intentarlo");
					

			}
			if (num == aleatorio) {
				System.out.print("¡¡¡ENHORABUENA!!! HA GANADO USTED..... UNA GRAN FELICITACIÓN");

		}

	}

}
