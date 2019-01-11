/*Realiza un programa que analice si un numero de 7 cifras es capicua o no*/

/***PROGRAMA DE COMPROBACIÓN SI UN NÚMERO DE 7 CIFRAS ES CAPICÚA O NO
* AUTOR: DAVID MCCONNELL VICENTE
* FECHA: 26/10/2018
* CURSO: DM1B
*/

import java.util.Scanner;

public class numero_capicua_7 {

	static final  int inf=1000000;
	static final int sup=9999999;

	public static boolean validar(long n) {
	        
	        if((n<inf)||(n>sup)) {
	            
	            return false;       
	        }
	        else 
	            return true;        
	        
	    }

	public static long capicula(long n) {
	        
	        
	        long resto,numeroInvertido=0;
	        
	        while(n!=0)
	        {
	         resto=n%10;
	         numeroInvertido=numeroInvertido*10+resto;
	         n=n/10;
	            
	        }
	        System.out.println("numero:"+numeroInvertido);
	    
	        return numeroInvertido;
	        
	    }

	public static void main(String[] args) {
	            
	        
	        Scanner sc= new Scanner (System.in);
	        
	        
	        long numero;
	        long num_inv;
	        
	        do {
	        System.out.println("-----------------------------------------------");
	        System.out.println("Introduzca un numero de 7 cifras: ");
	        System.out.println("-----------------------------------------------");
	        numero=sc.nextInt();
	        }while(!validar(numero));
	        
	    
	        num_inv=capicula(numero);
	        
	        if(numero==num_inv)
	            System.out.println("el numero "+numero+" es capicua");
	        else
	            System.out.println("el numero "+numero+" no es capicua");
	        
	}
}