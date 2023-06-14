package Section12_Arreglos;

import java.util.Scanner;

public class EjemploArregloNotasAlumno {

	public static void main(String[] args) {
		
		double [] claseMatematicas, claseHistoria, claseLenguaje; 
		double sumNotMate=0, sumNotHis=0,sumNotLen=0;
		claseMatematicas = new double [7];
		claseHistoria= new double [7];
		claseLenguaje= new double [7];
		
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese 7 notas de estudiantes para Matematicas:");
		for (int i=0;i< claseMatematicas.length; i++) {
			claseMatematicas [i]= s.nextDouble();
		}
		
		System.out.println("Ingrese 7 notas de estudiantes para Historia:");
		for (int i=0;i< claseHistoria.length; i++) {
			claseHistoria[i]= s.nextDouble();
		}
		
		System.out.println("Ingrese 7 notas de estudiantes para Lenguaje:");
		for (int i=0;i< claseLenguaje.length; i++) {
			claseLenguaje[i]= s.nextDouble();
		}
		
		
		for ( int i=0; i< 7; i++) {
			sumNotMate += claseMatematicas[i];
			sumNotHis += claseHistoria[i];
			sumNotLen += claseLenguaje[i];
		}
		
		double promMate = (sumNotMate/claseMatematicas.length);
		double promHis= (sumNotHis/claseHistoria.length);
		double promLen=(sumNotLen/claseLenguaje.length);
		
		System.out.println("Promedio clase matematicas: "+ promMate);
		System.out.println("Promedio clase Historia: "+ promHis);
		System.out.println("Promedio clase Lenguaje: "+ promLen);
		System.out.println("Promedio total del curso "+ ((promMate+promHis+promLen)/3));
		
		System.out.println("Ingrese el identificador del alumno (de 0 - 6):");
		int id =s.nextInt();
		double promedioAlumno = (claseHistoria[id]+  claseLenguaje[id]+ claseMatematicas[id])/3;
		System.out.println("Promedio Alumno Nro " + id +" es de: "+ promedioAlumno );

	}

}
