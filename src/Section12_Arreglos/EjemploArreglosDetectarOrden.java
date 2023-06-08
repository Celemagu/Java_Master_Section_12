package Section12_Arreglos;

import java.util.Scanner;

public class EjemploArreglosDetectarOrden {

	public static void main(String[] args) {
		int [] a = new int [7];
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese 7 números: ");
		for (int i = 0; i <a.length;i++) {
			a[i]= s.nextInt();
		}

	}

}
