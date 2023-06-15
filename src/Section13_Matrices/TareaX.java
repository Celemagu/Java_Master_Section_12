package Section13_Matrices;

import java.util.Scanner;

public class TareaX {
	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	System.out.println("Indique el numero de filas (será el mismo de columnas)"); 
	int fc= s.nextInt();
		
	String [] [] matriz = new String [fc] [fc];
	
	for (int i=0; i<matriz.length; i++) {
		for (int j=0; j< matriz[i].length; j++) {
		matriz[i][j]= "_";
	}
	}
	
	for (int i=0; i< matriz.length; i++) {
		for (int j=0; j< matriz[i].length; j++) {
			if ( i==j || i==matriz.length-1 -j  ) {
				matriz [i][j] = "X";
				
			}
		}
	}

	for (int i =0; i<matriz.length;i++) {
		for (int j =0; j<matriz[i].length;j++) {
			System.out.print(matriz [i] [j]);
					
		}
		System.out.println();
	} 

}
}
