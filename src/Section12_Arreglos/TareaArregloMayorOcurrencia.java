package Section12_Arreglos;

import java.util.Arrays;

public class TareaArregloMayorOcurrencia {

	public static void main(String[] args) {
		
		int [] a  = {9,9,9,3,3,9,6,1,10,3};
		int [] cont  = new int [10] ;
		int numCom=0;
		int cantOcu=0;
		
		for (int i =0; i <a.length;i++ ) { // calcula las veces que se repite un valor
			int num1 = a[i];
			cont[num1]++;
			}
		
		for (int i =0; i <cont.length;i++ ) { //busca el numero de mas ocurrencias
			if (cont[i]> cantOcu) {
				numCom= i;
				cantOcu= cont[i];
			}
			
		}
			
		System.out.println("el numero de mas ocurrencias es: " +numCom);
		System.out.println("cantidad de ocurrencias es: " +cantOcu);

	}

}
