package Section12_Arreglos;

import java.util.Scanner;

public class EjemploArreglosEliminarElemento {

	public static void main(String[] args) {
		
		int [] a = new int [10];
		
		Scanner s = new Scanner(System.in);
		
		for (int i=0; i <a.length; i++) {
			System.out.print("Ingrese un numero: ");
			a[i]= s.nextInt();
		}
		
		System.out.println();
		
		System.out.println("Ingrese una posicion a eliminar entre 0-9: ");
		int posicion= s.nextInt();
		
		for (int i= posicion; i < a.length-1; i++) {
			a[i]= a[i+1];
		}
		
		for (int i= 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		int [] b = new int [a.length-1];
		
		System.arraycopy(a, 0, b, 0, b.length); //copiar un arreglo a otro
		
		
		for (int i= 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}

}
