package Section13_Matrices;

public class EjemploMatricesSimetrica {

	public static void main(String[] args) {
		boolean simetrica = true;
		int [][] matriz = {
			{1,2,3,4},
			{2,1,0,5},
			{3,0,1,6},
			{4,5,6,7}
		};
		
		int i, j;
//		i=0;
//		while (i>matriz.length && simetrica ==true){
//			j=0;
//			while (j>matriz[i].length && simetrica ==true){
//				if(matriz[i][j] != matriz[j][i]) {// compara que la posicion ejm 2,0 tenga lo mismo que 0,2
//					simetrica = false;
//				}
//				j++;
//			}
//			i++;
//		}
		
		salir: for (i=0;i<matriz.length; i++) {
					for (j=0;j<i; j++) {
						if(matriz[i][j] != matriz[j][i]) {// compara que la posicion ejm 2,0 tenga lo mismo que 0,2
							simetrica = false;
							break salir;
						}
					}
		}
		
		if (simetrica) {
			System.out.println("la matriz es simetrica");
		}else {
			System.out.println("la matriz no es simetrica");
		}
		
	}

}
