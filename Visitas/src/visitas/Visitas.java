package visitas;
import java.util.Scanner;
import java.util.ArrayList;
import  java.util.Arrays;

public class Visitas {
	public static void main(String[] ARGS) {
		
		int visitasweb= promedio(ARGS);
		System.out.printf("Promedio %d \n",visitasweb);		
	}	
	
	private static int promedio(String[] totalvisitas) {
		int suma=0;
		for (String elemento:totalvisitas) {
			try {
				suma+=(Integer.parseInt(elemento));
				} catch (Exception e) {}
		}
		return (suma/totalvisitas.length);
	}
}