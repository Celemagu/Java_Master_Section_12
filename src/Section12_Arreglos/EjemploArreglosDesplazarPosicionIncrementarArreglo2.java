package Section12_Arreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicionIncrementarArreglo2 {

	public static void main(String[] args) {
		
		int [] a = new int [7];
		int num, posicion, ultimo;
		Scanner s= new Scanner(System.in);
		
		for (int i=0; i<a.length;i++) {
			System.out.print("Ingrese un numero: ");
			a[i]= s.nextInt();
		}
			System.out.println();
			
			
			System.out.print("Ingrese un numero a insertar: ");
			num = s.nextInt();
			
			ultimo = a[a.length-1];
			posicion =0;
			
			while (posicion < 6 && num > a[posicion]) {
				posicion++;
			}
			
			for (int i = a.length-2; i >=posicion;i--) {
				a [i+1] = a[i];
			}
			
			int [] b = new int [a.length+1];
			System.arraycopy(a, 0, b, 0, a.length);
			
			
			if (num >ultimo) {
				b[b.length-1]= num;
			} else {
			b[b.length-1] = ultimo;
			b[posicion] = num;
			}
			
			System.out.println("El nuevo arreglo ordenado");

			for (int i = 0; i <b.length;i++) {
				System.out.println(b[i]);
			}
			
			
			
		

	}

}
