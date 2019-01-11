/*Crea un método que valide una opción del siguiente menú*/


/***PROGRAMA QUE VALIDA UN MÉTODO DE UN MENÚ
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
			System.out.println("La opción a elegir debe ser entre 1 y 4");
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
				System.out.println("1.-Area del rectángulo");
				System.out.println("2.-Area del triángulo");
				System.out.println("3.-Area del círculo");
				System.out.println("4.-Salir");
				System.out.println();
				System.out.println("Elige una opción: ");
				opc = teclado.nextInt();
			} while (validar(opc) == false);

			switch (opc) {
			case 1: // Area del rectángulo
				System.out.println();
				System.out.println("Introduce la base del rectángulo");
				b = teclado.nextDouble();
				System.out.println("Introduzca la altura del rectángulo");
				a = teclado.nextDouble();

				System.out.println("El area del rectángulo es: " + rectangulo(a, b));
				break;

			case 2: // Area del triángulo
				System.out.println();
				System.out.print("Introduce la base del triángulo: ");
				b = teclado.nextDouble();
				System.out.print("Introduce la altura del triángulo: ");
				a = teclado.nextDouble();

				System.out.println("El area del triángulo es: " + triangulo(a, b));
				break;

			case 3: // Area del circulo
				System.out.println();
				System.out.print("Introduce el radio del círculo: ");
				a = teclado.nextDouble();

				System.out.println("el area del círculo es: " + circulo(a, b));
				break;

			case 4: // Salir del programa
				System.out.println("Gracias por utilizar este programa.");

				break;

			}
		} while (opc != 4);

	}
}