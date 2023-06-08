package Section12_Arreglos;

import java.util.Arrays;

public class EjemploArreglosFor {

	public static void main(String[] args) {
		
		String [] productos = new String [7];
		int total = productos.length;
		
			
			
		
		productos [0]= "Kingston Pendrive 64gb";
		productos [1]= "Samnsung Galaxy";
		productos [2]= "Disco Duro SSD Samsung Externo";
		productos [3]= "Asus Notebook";
		productos [4]= "Macbook Air";
		productos [5]= "Chromecast";
		productos [6]= "Bicicleta";
		
		Arrays.sort(productos); 
		System.out.println("-----------------Usando For--------------");
		for (int i= 0; i <total;i++) {
			System.out.println("para indice" + i + " : " + productos[i]);
		}
		System.out.println("-----------------Usando For Each--------------");
		for (String prods:productos) {
			System.out.println("prod = " + prods);
		}
		System.out.println("-----------------Usando While--------------");
		int i =0;
		while(i<total) {
			System.out.println("para indice" + i + " : " + productos[i]);
			i++;
		}
		System.out.println("-----------------Usando Do While--------------");
		i =0;
		do {
			System.out.println("para indice" + i + " : " + productos[i]);
			i++;
		}
		while(i<total); 
		
		System.out.println();
		System.out.println();
		System.out.println("-----------------Arreglo numeros--------------");
		
		int [] numeros = new int [10];//crear instancia del arreglo
		int  totalNum=numeros.length; // definir largo del arreglo (es mas rapido definirlo una vez, que dejarlo en el for consultando en cada ciclo)
		
		for (int j=0; j< totalNum; j++) { // For para llenar el arreglo de manera dinamica
			 numeros[j]= j *5;
		}
		
		
		for (int j=0; j< totalNum; j++) { //for para imprimir los datos del arreglo
			System.out.println("Numeros = " + numeros[j]);
		}
		
	}

}
