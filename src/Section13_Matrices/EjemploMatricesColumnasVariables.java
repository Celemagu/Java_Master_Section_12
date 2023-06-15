package Section13_Matrices;

public class EjemploMatricesColumnasVariables {

	public static void main(String[] args) {
		
		int [][] matriz = new int [3] [];
		
		matriz[0] = new int [2];// la fila 0 va a tener 2 columnas
		matriz[1] = new int [3];// la fila 1 va a tener 3 columnas
		matriz[2] = new int [4];// la fila 2 va a tener 4 columnas
		
		System.out.println("Matriz length= " + matriz.length);
		System.out.println("Fila 0 length= " + matriz[0].length);
		System.out.println("Fila 1 length= " + matriz[1].length);
		System.out.println("Fila 2 length= " + matriz[2].length);
		
		
		for (int i=0; i<matriz.length;i++ ) {			//poblar la matriz
			for (int j=0; j<matriz[i].length;j++) {
				matriz [i][j] = i*j;					//se asigna a cada posicion la multiplicacion de i * j
			}
		}
		
		for (int i=0; i<matriz.length;i++ ) {
			for (int j=0; j<matriz[i].length;j++) {
				System.out.print(matriz [i][j]+"\t");
			}
			System.out.println();
		}
		

	}

}
