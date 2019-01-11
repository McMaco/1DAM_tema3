import java.util.Scanner;
import java.util.Scanner;

public class validar_numero {
	
	public static int validar(int d, int n) {
		if (n==d)  return 0;
		else {      
			if (n>d) return 1;
			else	return 2;
		}
	}
	
	public static void main(String [] args) {
		
		Scanner teclado= new Scanner (System.in);
		int d;
		
		int n= (int) ((Math.random()*100)+1);
		
		do {
			do {
				System.out.println("Adivina el numero");
				d =teclado.nextInt();
			}while((d<1)||(d>100));
			
			switch(validar(d,n)) {
			case 0:
				System.out.println("Has acertado el numero era "+ n);
			break;
			case 1:
				System.out.println("El numero es mayor");
			break;
			case 2:
				System.out.println("El numero es menor");
			break;
			}
		}while(validar(d,n)!=0);
	}
}
