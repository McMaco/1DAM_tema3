
/*Se desea conocer el lucky number de cualquier persona 
 * y se consigue reduciendo la fecha de nacimiento a un solo numero.
 * Ejemplo:16-08-1973-->16+8+1973-->1997-->1+9+9+7=26-->2+6=8
 */

/***PROGRAMA DE LUCKY NUMBER
 * AUTOR: DAVID MCCONNELL VICENTE
 * FECHA: 16/10/2018
 * CURSO: DM1B
 */

import java.util.Scanner;

public class lucky_number {

	public static void main(String[] args) {
		int d, m, a, ln, M, C, D, U;
		Scanner teclado = new Scanner(System.in);
		System.out.println("LUCKY NUMBRER");
		System.out.println("-------------");
		System.out.println();
		do {
			System.out.println("Introduce el dia de nacimiento");
			d = teclado.nextInt();
		} while ((d < 1) || (d > 31));

		do {
			System.out.println("Introduce el mes de nacimiento");
			m = teclado.nextInt();
			if ((d > 29) && (m == 2))	m = 0;
			if ((d > 30) && ((m == 4) || (m == 6) || (m == 9) || (m == 11)))
				m = 0;
		} while ((m < 1) || (m > 12));

		do {
			System.out.println("Introduce el año de nacimiento");
			a = teclado.nextInt();

		} while ((a < 1) || (a > 2018));

		ln = d + m + a;

		while (ln > 9) {
			M = ln / 1000;
			C = (ln % 1000) / 100;
			D = (ln % 100) / 10;
			U = (ln % 10);
			ln = M + C + D + U;
		}

		System.out.print("El numero de la suerte de la fecha de nacimiento: " + d + "-" + m + "-" + a + " es: " + ln);

	}
}
