import java.util.Scanner;

public class conversor {

	public static void main(String[] args) {
		
		int n = 0, i = 0, p = 0;
		
		Scanner t = new Scanner(System.in);
		
		System.out.println("----------------------------------------");
		System.out.println("Conversor a binario, octal y hexadecimal");
		System.out.println("----------------------------------------");
		System.out.println();
		
		do{
			System.out.println();
			System.out.print("Introduce un número positivo [0 - 255]: ");
			n = t.nextInt();
		}while((n<0)||(n>255));
		
		// Conversión a binario
		System.out.print("El número " + n +" en binario es: ");
		for(i=0;i<8;i++){
			p = ((n>>(7-i))&0x01);
			System.out.print(p);
		}
		System.out.println();
		
		// Conversión a octal
		System.out.print("El número " + n +" en Octal es: ");
		for(i=0;i<3;i++){
			p = ((n>>(6-i*3))&0x07);
			System.out.print(p);
		}
		System.out.println();
				
		// Conversión a Hexadecimal
		System.out.print("El número " + n +" en Hexadecimal es: 0x");
		for(i=0;i<2;i++){
			p = ((n>>(4-i*4))&0x0F);
			switch(p){
				case 10:
					System.out.print("A");
				break;
				case 11:
					System.out.print("B");
				break;
				case 12:
					System.out.print("C");
				break;
				case 13:
					System.out.print("D");
				break;
				case 14:
					System.out.print("E");
				break;
				case 15:
					System.out.print("F");
				break;
				default:
					System.out.print(p);
				break;
			}
		}
		System.out.println();

	}

}
