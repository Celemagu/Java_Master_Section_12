package Section12_Arreglos;

import java.util.Scanner;

public class TareaArregloSistemaEstadistico {

	public static void main(String[] args) {
		int [] a  =new int [7];
		float positivos =0;
		float contPos=0;
		float negativos =0;
		float contNeg=0;
		float contCer=0;
		
		System.out.println("Ingrese 7 numeros: ");
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i<a.length; i++) {
			a[i]= s.nextInt();
		}
		
		for (int i = 0; i<a.length; i++) {
			if(a[i]>0) {
				positivos += a[i];
				contPos++;
			} else if (a[i]<0) {
				negativos += a[i];
				contNeg++;
			}else if (a[i]==0) {
				contCer++;
			}
				
		}
		float promP = positivos/contPos;
		float promN = negativos/contNeg;
		
		System.out.println("El promedio de los numeros positivos es de " + promP);
		System.out.println("El promedio de los numeros negativos es de " + promN);
		System.out.println("La cantidad de numeros cero es de " + contCer);
		
	}

}
