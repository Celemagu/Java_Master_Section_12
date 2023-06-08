package Section12_Arreglos;

public class EjemploArreglosCombinadosMultiplesElementos {
	
	public static void main(String[] args) {
		int [] a, b, c; // declaracion de 3 arreglos enteros
			a = new int [10];
			b = new int [10];
			c = new int [20];
			
			
			for (int i =0; i <a.length; i++) { 
				a[i] =i+1;
				
			}
			
			for (int i =0; i <b.length; i++) { 
				b[i] =(i+1)*5;
			}
			
			
			int aux = 0;
			for (int i =0; i <10; i+=2) {  // i+=2 se incrementa en 2 la i
				
				for (int j =0; j<2;j++ ) { // ciclo para calcular la posicion de arreglo a para que agregue de a 2 elementos (j<2)
					c[aux++] = a [i+j];
				}
				
				for (int j=0; j<2; j++) { // ciclo para calcular la posicion de arreglo b y que agregue de a 2 elementos (j<2)
					c[aux++] = b [i+j];
				}
			}
				
			
			for (int i =0; i <c.length; i++) { 
			System.out.println(i + ": " +c[i]);
			}
			
 	}

}
