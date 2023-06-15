package Section13_Matrices;

import java.util.Scanner;

public class TareaSilla {

	public static void main(String[] args) {

			
			Scanner s = new Scanner(System.in);
			System.out.println("Indique el numero de filas (será el mismo de columnas)"); 
			int fc= s.nextInt();
				
			int [] [] matriz = new int [fc] [fc];
			
			for (int i=0; i<matriz.length; i++) {
				for (int j=0; j< matriz[i].length; j++) {
				matriz[i][j]= 0;
			}
			}
			
			
			for (int i=0; i< matriz.length; i++) {
				for (int j=0; j< matriz[i].length; j++) {
					if ( j==0 || i==matriz.length /2 || j==matriz.length || (j==matriz[i].length-1 && i>=matriz.length/2)) {
						matriz [i][j] = 1;
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
