/*Crea un m�todo que valide una opci�n del siguiente men�*/


/***PROGRAMA QUE VALIDA UN M�TODO DE UN MEN�
 * AUTOR: DAVID MCCONNELL VICENTE
 * FECHA: 16/10/2018
 * CURSO: DM1B
 */

import java.util.Scanner;

public class validacion_metodo_menu {

	/* VARIABLES CONSTANTES O GLOBALES */
	final static double PI = 3.141592;

	/* METODO DE VALIDACION DE UN NUMERO DADO POR EL USUARIO */
	public static boolean validar(int opc) {
		if ((opc < 1) || (opc > 4)) {
			System.out.println("La opci�n a elegir debe ser entre 1 y 4");
			return false;
		} else {
			return true;
		}
	}

	/* METODOS PARA CALCULAR LAS AREAS */
	public static double rectangulo(double a, double b) {
		return a * b;
	}

	public static double triangulo(double a, double b) {
		return (a * b) / 2;
	}

	public static double circulo(double a, double b) {
		return a * a * PI;
	}

	/* METODO PRINCIPAL A EJECUTAR */
	public static void main(String[] args) {

		/* DECLARACION DE VARIABLES */
		Scanner teclado = new Scanner(System.in);
		int opc = 0;
		double a = 0.0, b = 0.0;

		/* CABECERA DEL PROGRAMA */
		System.out.println("---------------------------------------");
		System.out.println("CALCULO DEL AREA DE DIFERENTES ESPACIOS");
		System.out.println("---------------------------------------");

		do {
			do {
				System.out.println();
				System.out.println("1.-Area del rect�ngulo");
				System.out.println("2.-Area del tri�ngulo");
				System.out.println("3.-Area del c�rculo");
				System.out.println("4.-Salir");
				System.out.println();
				System.out.println("Elige una opci�n: ");
				opc = teclado.nextInt();
			} while (validar(opc) == false);

			switch (opc) {
			case 1: // Area del rect�ngulo
				System.out.println();
				System.out.println("Introduce la base del rect�ngulo");
				b = teclado.nextDouble();
				System.out.println("Introduzca la altura del rect�ngulo");
				a = teclado.nextDouble();

				System.out.println("El area del rect�ngulo es: " + rectangulo(a, b));
				break;

			case 2: // Area del tri�ngulo
				System.out.println();
				System.out.print("Introduce la base del tri�ngulo: ");
				b = teclado.nextDouble();
				System.out.print("Introduce la altura del tri�ngulo: ");
				a = teclado.nextDouble();

				System.out.println("El area del tri�ngulo es: " + triangulo(a, b));
				break;

			case 3: // Area del circulo
				System.out.println();
				System.out.print("Introduce el radio del c�rculo: ");
				a = teclado.nextDouble();

				System.out.println("el area del c�rculo es: " + circulo(a, b));
				break;

			case 4: // Salir del programa
				System.out.println("Gracias por utilizar este programa.");

				break;

			}
		} while (opc != 4);

	}
}