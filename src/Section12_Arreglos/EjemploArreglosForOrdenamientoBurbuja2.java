package Section12_Arreglos;

import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForOrdenamientoBurbuja2 {

	public static void arregloInverso (String [] arreglo) {

	
	int total2 = arreglo.length;
	int total = arreglo.length;
	for (int i = 0; i<total2; i++) {
		String actual = arreglo[i];
		String inverso = arreglo[total-1- i];
		arreglo[i] = inverso;
		arreglo[total-1-i] = actual;
		total2 --;
	}
}
	
	public static void sortBurbuja(Object[] arreglo) {
		
		
		int contador=0;
		
		int total = arreglo.length;
		
		for (int i = 0; i< total; i++) {
	
			for (int j = 0; j< total-1-i; j++) {
				
				if( ((Comparable)arreglo[j+1]).compareTo(arreglo[j])  <0  ) {
					
					Object auxiliar = arreglo[j];
					arreglo [j]= arreglo[j+1];
					arreglo [j+1] = auxiliar;
					
				}
				contador ++;
			}
		}
		System.out.println("Contador= " + contador);
	}
	
	
	public static void main(String[] args) {
		
		
		String [] productos = {"Kingston Pendrive 64gb","Samnsung Galaxy", 
				"Disco Duro SSD Samsung Externo", "Asus Notebook", "Macbook Air", 
				"Chromecast", "Bicicleta"}; // Instanciar y asignar valores al arreglo
			
		int total = productos.length;
		

		sortBurbuja(productos);
		System.out.println("-----------------Usando For--------------");
		for (int i= 0; i <total;i++) {
			System.out.println("para i = " + i + " : " + productos[i]);
		}
		
		Integer [] numeros = new Integer [4];//crear instancia del arreglo
		
		numeros [0] = 1; //asignar valores
		numeros [1] = 202;
		numeros [2] = 35;
		numeros [3] = 4;
		
		
		
		sortBurbuja(numeros);
		for (int i = 0; i< numeros.length; i++) {
			System.out.println("para i = " + i + " valor : " + numeros[i]);
		}
	}

}
