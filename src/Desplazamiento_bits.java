
import java.util.Scanner;
 
public class Desplazamiento_bits {
	
	public static int suma(int n) {
		//SEPARAMOS a Y b
		int a = ((n & 0xFFFF0000)>>16); //Recojo a
		int b = (n & 0x0000FFFF);       //Recojo b
		
		return (a + b);
		
	}
	
	public static void main(String [] args) {
		
		int a=0, b=0, n=0, c=0;
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("PROGRAMA QUE SUMA 2 NUMEROS MEDIANTE DESPLAZAMIENTO DE BITS");
		System.out.println("-----------------------------------------------------------");
		System.out.println();
		Scanner teclado= new Scanner(System.in);
		
		do {
			System.out.println("Introduzca un numero entre [0-32.000]");
			a = teclado.nextInt();
		}while((a<0)||(a>32000));
		
		do {
			System.out.println("Introduzca un numero entre [0-32.000]");
			b = teclado.nextInt();
		}while((b<0)||(b>32000));
		
		//JUNTAMOS EN n, a Y b: n=a|b
		n = ((a<<16) & 0xFFFF0000); //Coloco a: n=a|0
		n = n | (b & 0x0000FFFF);   //Coloco b: n=a|b
		
		c = suma(n);
		
		System.out.println("Resultado");
		System.out.println(a + " + " + b + " = " + c );
		
	}

}
