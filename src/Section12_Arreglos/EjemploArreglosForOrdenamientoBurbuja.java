package Section12_Arreglos;

import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForOrdenamientoBurbuja {

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
	public static void main(String[] args) {
		
		
		String [] productos = {"Kingston Pendrive 64gb","Samnsung Galaxy", 
				"Disco Duro SSD Samsung Externo", "Asus Notebook", "Macbook Air", 
				"Chromecast", "Bicicleta"}; // Instanciar y asignar valores al arreglo
		
		
		int total = productos.length;
		
		for (int i = 0; i< total; i++) {
			for (int j = 0; j< total; j++) {
				if(productos[i].compareTo(productos[j])<0) {
					String auxiliar = productos[i];
					productos [i]= productos[j];
					productos [j] = auxiliar;
					
				}
			}
		}
		//Arrays.sort(productos); 
		//arregloInverso(productos);
		
		//Collections.reverse(Arrays.asList(productos)); // modificar el arreglo al contrario de manera automatica
		
		System.out.println("-----------------Usando For--------------");
		for (int i= 0; i <total;i++) {
			System.out.println("para i = " + i + " : " + productos[i]);
		}
		
	}

}
