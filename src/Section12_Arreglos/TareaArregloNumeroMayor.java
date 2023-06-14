package Section12_Arreglos;

public class TareaArregloNumeroMayor {

	public static void main(String[] args) {
		
		int [] num = {14, 133, 115, 96, 78, 21, 243};
		int nummayor= 0;
		
		for (int i =0; i <num.length;i++) {
			int num1 = num[i];
			
			
			if (num1 > nummayor) {
				nummayor= num1;
			}else {
				nummayor= nummayor;
			}
				
		}
			System.out.println("el numero mayor es " + nummayor);
		
	}

}
