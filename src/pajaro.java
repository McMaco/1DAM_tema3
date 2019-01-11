import java.util.Scanner;

/***
 * PROGRAMA DE LUCKY NUMBER AUTOR: DAVID MCCONNELL VICENTE FECHA: 16/10/2018
 * CURSO: DM1B
 */

public class pajaro {

	/* ATRIBUTOS */
	String color; // Define el color del pájaro
	boolean volar; // Define si el pájaro puede volar: true = vuela; false = no vuela

	/* MÉTODOS */

	// Constructor por defecto: pajaro blanco y no vuela
	public pajaro() {
		color = "blanco";
		volar = false;
	}

	// Constructor con características del usuario
	public pajaro(String col, boolean vol) {
		color = col;
		volar = vol;
	}

	// Devolver el color de los pájaros
	public static String getColor(pajaro name) {
		return name.color;
	}

	// Devolver si vuela o no vuela
	public static boolean getVolar(pajaro name) {
		return name.volar;
	}

	/* METODO MAIN PARA TESTEAR LA CLASE */
	public static void main(String [] args) {
			
			/*VARIABLES*/
			Scanner teclado = new Scanner(System.in);
			int opc = 0;
			pajaro piolin = null, pardal = null;
			
			System.out.println("-------------------------");
			System.out.println("Testeo de la clase pajaro");
			System.out.println("-------------------------");
			System.out.println();
			
			do {	
				do {
					System.out.println("0.- Salir");
					System.out.println("1.- Crear pájaro por defecto");
					System.out.println("2.- Crear pájaro propio");
					System.out.println("3.- Mostrar color de pájaro");
					System.out.println("4.- Mostrar si vuela el pájaro");
					System.out.println("Opción: ");
					opc = teclado.nextInt();
				}while ((opc<0)||(opc>4));
				
				switch(opc) {
					case 0: //OPCIÓN SALIR
						System.out.println("Gracias por probar la clase");
					break;
						
					case 1: //CREAR PAJARO POR DEFECTO
						piolin = new pajaro();
					break;
						
					case 2: //CREAR PAJARO PROPIO
						System.out.println("Dame el color: ");
						String col = teclado.next();
						System.out.println("Volar (false=no, true=si): ");
						boolean vol = teclado.nextBoolean();
						pardal = new pajaro(col, vol);
					break;
						
					case 3: //MOSTRAR COLOR DEL PAJARO
						String ver = getColor(piolin);	
						System.out.println("Color de piolin: "+ ver);
						ver = getColor(pardal);
						System.out.println("Color de pardal: "+ ver);
					break;
						
					case 4: //MOSTRAR SI EL PAJARO VUELA
						boolean vuelo = getVolar(piolin);
						System.out.println("Vuela piolin: "+ vuelo);
						vuelo = getVolar(pardal);
						System.out.println("Vuela pardal: "+ vuelo);
					break;
				}
			}while(opc!=0);
		}
}
