package Section12_Arreglos;

import java.util.Arrays;

public class EjemploArreglosForInverso {

	public static void main(String[] args) {
		
//		String [] productos = new String [7];
		
		String [] productos = {"Kingston Pendrive 64gb","Samnsung Galaxy", 
				"Disco Duro SSD Samsung Externo", "Asus Notebook", "Macbook Air", 
				"Chromecast", "Bicicleta"}; // Instanciar y asignar valores al arreglo
		int total = productos.length;
		
//		productos [0]= "Kingston Pendrive 64gb";
//		productos [1]= "Samnsung Galaxy";
//		productos [2]= "Disco Duro SSD Samsung Externo";
//		productos [3]= "Asus Notebook";
//		productos [4]= "Macbook Air";
//		productos [5]= "Chromecast";
//		productos [6]= "Bicicleta";
		
		Arrays.sort(productos); 
		System.out.println("-----------------Usando For--------------");
		for (int i= 0; i <total;i++) {
			System.out.println("para i = " + i + " : " + productos[i]);
		}
		System.out.println("-----------------Usando For Inverso--------------");
		for (int i= 0; i <total;i++) {
			System.out.println("para i = " + (total-1-i) + " valor:  " + productos[total-1-i]);
		}
		
		System.out.println("-----------------Usando For inverso 2--------------");
		
		for (int i= total-1; i >=0 ; i-- ) {
			System.out.println("para i = " + i + " Valor: " + productos[i]);
		}
	}

}
