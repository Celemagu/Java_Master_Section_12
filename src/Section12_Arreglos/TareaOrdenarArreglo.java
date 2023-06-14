package Section12_Arreglos;

import java.util.Scanner;

public class TareaOrdenarArreglo {

	public static void main(String[] args) {
		int [] a = new int [10];
		int [] b =  new int [10]; 
		
		Scanner s= new Scanner(System.in);
		
		for (int i=0; i<a.length;i++) {
			System.out.print("Ingrese un numero: ");
			a[i]= s.nextInt();
					}
			System.out.println();
			
			int aux =0;
			for (int i=0; i<a.length-i; i++){
				b[aux++]= a[i];
				b[aux++]= a[a.length-1-i];
			}

			for (int i=0; i<b.length; i++){
				System.out.println("b = "+  i + " valor: " + b[i]);
				}	
			
	}

}
