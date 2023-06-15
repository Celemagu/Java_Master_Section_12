package Section13_Matrices;

public class EjemploMatricesBuscar {

	public static void main(String[] args) {
		
		int [][] matrizDeEnteros = { {35,90,3,1978}, {15,2020,10,5}, {677,127,32767,1999} };
		
		int elementoBuscar=677;
		 boolean encontrado= false;
		 int i;
		 int j=0;
		for1: for ( i =0; i<matrizDeEnteros.length;i++) {
			 for ( j =0; j< matrizDeEnteros[i].length;j++) {
				 if (elementoBuscar== matrizDeEnteros [i][j]) {
					 encontrado = true;
					 break for1;
				} 
			 }
			 
		 }
		 if (encontrado == true ) {
			 System.out.println("El Numero " + elementoBuscar + " fue encontrado en las coordenadas [" + i+ ","+ j + "]" );
		 }else {
				System.out.println("El Numero " + elementoBuscar + " No fue encontrado ");
			}

	}

}
