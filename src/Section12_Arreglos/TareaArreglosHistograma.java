package Section12_Arreglos;

import java.util.Arrays;

public class TareaArreglosHistograma {

	public static void main(String[] args) {
		int [] a  = {3,3,4,5,6,4,3,2,5,6,5,4};
		int [] cont  = new int [12] ;
		String [] contador= new String [12];
		Arrays.sort(a);
		
		for (int i=0; i<contador.length; i++) {
			contador[i]= "";
		}
		
		for (int i =0; i <a.length;i++ ) { // calcula las veces que se repite un valor
			int num1 = a[i];
			cont[num1]++;
			contador[num1] += "*";
			}
		
		for (int i=0; i <contador.length;i++) {
			if (i>0 && i<7)
			System.out.println(i + " : " + contador[i]);
		}
	}

}
