package Section12_Arreglos;

public class EjemploArreglosCombinados {
	
	public static void main(String[] args) {
		int [] a, b, c; // declaracion de 3 arreglos enteros
			a = new int [10];
			b = new int [10];
			c = new int [20];
			
			
			for (int i =0; i <a.length; i++) { // asigno numeros de 1 en 1 en el arreglo a
				a[i] =i+1;
				
			}
			
			for (int i =0; i <b.length; i++) { // asigno numeros de 5 en 5 en el arreglo b
				b[i] =(i+1)*5;
			}
			
			
			int aux = 0;
			for (int i =0; i <10; i++) { // asigno al auxiliar el arreglo 1 y el arreglo 2,, aumentando las posiciones del aux con aux++
				c[aux++] = a [i];
				c[aux++] = b [i];
			}
				
			
			for (int i =0; i <c.length; i++) { //recorro e imprimo lo guardado en el arreglo c
			System.out.println(i + ": " +c[i]);
			}
			
 	}

}
