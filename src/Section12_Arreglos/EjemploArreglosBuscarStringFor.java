package Section12_Arreglos;

import java.util.Scanner;

public class EjemploArreglosBuscarStringFor {

	public static void main(String[] args) {
		
		String [] a = new String [4];
		
		Scanner s = new Scanner(System.in);
		
		for (int i =0; i< a.length; i++ ) {
			System.out.print("Ingrese un nombre: ");
			a[i]= s.next();
		}
		
		System.out.println("\r\nIngrese un numero a buscar");
		String nombre = s.next();
		int i =0;
		
		for (;i<a.length && !a[i].equalsIgnoreCase(nombre); i++) {}
		if (i==a.length) {
			System.out.println("Nombre no encontrado");
		}else if (a[i].toLowerCase().compareTo(nombre.toLowerCase())==0)
			System.out.println("Nombre encontrado en la posicion: " + i);
		
				
		
	}

}
