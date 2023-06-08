package Section12_Arreglos;

import java.util.Arrays;

public class EjemploArreglos {

	public static void main(String[] args) {
		
		String [] productos = new String [7];
		
		productos [0]= "Kingston Pendrive 64gb";
		productos [1]= "Samnsung Galaxy";
		productos [2]= "Disco Duro SSD Samsung Externo";
		productos [3]= "Asus Notebook";
		productos [4]= "Macbook Air";
		productos [5]= "Chromecast";
		productos [6]= "Bicicleta";
		
		Arrays.sort(productos); //para ordenar d la A a la Z dentro del arreglo
		
		
//		System.out.println("Producto[0] "  + productos [0]); // se puede consultar de esta manera sin asignar a otra variable
//		System.out.println("Producto[1] "  + productos [1]);
//		System.out.println("Producto[2] "  + productos [2]);
//		System.out.println("Producto[3] "  + productos [3]);
//		System.out.println("Producto[4] "  + productos [4]);
//		System.out.println("Producto[5] "  + productos [5]);
//		System.out.println("Producto[6] "  + productos [6]);
		
		String prod1= productos [0]; // asignando valores del arreglo a una variable
		String prod2= productos [1];
		String prod3= productos [2];
		String prod4= productos [3];
		String prod5= productos [4];
		String prod6= productos [5];
		String prod7= productos [6];
		
		System.out.println("Producto[0] "  + prod1); // se puede consultar de esta manera asignando a otra variable
		System.out.println("Producto[1] "  + prod2);
		System.out.println("Producto[2] "  + prod3);
		System.out.println("Producto[3] "  + prod4);
		System.out.println("Producto[4] "  + prod5);
		System.out.println("Producto[5] "  + prod6);
		System.out.println("Producto[6] "  + prod7);
		
		
		int [] numeros = new int [4];//crear instancia del arreglo
		
		numeros [0] = 1; //asignar valores
		numeros [1] = 202;
		numeros [2] = 35;
		numeros [3] = 4;
		
		Arrays.sort(numeros);
		
		int i = numeros [0]; //asignando indices a variables
		int j = numeros [1];
		int k = numeros [2];
		int l = numeros [numeros.length -1];// forma de traer el ultimo elemento del arreglo
		
		System.out.println("i= " + i);
		System.out.println("j= " + j);
		System.out.println("k= " + k);
		System.out.println("l= " + l);
		
		
	}

}
