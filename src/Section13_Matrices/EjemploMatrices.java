package Section13_Matrices;

public class EjemploMatrices {

	public static void main(String[] args) {
		
		int [][] numeros = new int [2][4]; // Declaracion de una matriz de 2 filas y 4 columnas
		
		numeros [0] [0]=1;
		numeros [0] [1]=2;
		numeros [0] [2]=3;
		numeros [0] [3]=4;
		
		numeros [1] [0]=11;
		numeros [1] [1]=12;
		numeros [1] [2]=13;
		numeros [1] [3]=14;
		
		System.out.println("numero de filas= " + numeros.length); //imprimir numero de filas
		System.out.println("numero de columnas= " + numeros[1].length); //imprimir numero de columnas. [i] = el numero de la columna que quiero preguntar
		
		System.out.println("Primer elemento de la matriz: " + numeros [0][0]);
		System.out.println("ultimo  elemento de la matriz: " + numeros [numeros.length-1][numeros[1].length-1]);
		
		
		int num1 = numeros [0][0]; // asignar los valores de la matruz a una variable
		int num2 = numeros [0][1];
		int num3 = numeros [0][2];
		int num4 = numeros [0][3];
		int num5 = numeros [1][0];
		int num6 = numeros [1][1];
		int num7 = numeros [1][2];
		int num8 = numeros [1][3];

		System.out.println("numero 1: " + num1); // imprimir el valor de la matriz a través de la variable creada
		System.out.println("numero 2: " + num2);
		System.out.println("numero 3: " + num3);
		System.out.println("numero 4: " + num4);
		System.out.println("numero 5: " + num5);
		System.out.println("numero 6: " + num6);
		System.out.println("numero 7: " + num7);
		System.out.println("numero 8: " + num8);
		

	}

}
