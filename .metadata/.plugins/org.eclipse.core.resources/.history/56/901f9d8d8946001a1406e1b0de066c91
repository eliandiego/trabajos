package smart;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// parametros de prueba 120000 12500 25 200 25535 225566 22541 25588 255663 300000
public class SmartWatch {
	public static void main(String[] ARGS) {
		
		List<Integer> cantidaddepasos= clearsteps(ARGS);
		System.out.printf("arreglo %s \n",cantidaddepasos);
			
	}

	private static ArrayList<Integer> clearsteps(String[] pasos) {
		ArrayList<Integer> pasostotales = new ArrayList<Integer>();
		int suma=0;
		int ejercicio1 = pasostotales.stream().reduce(0,(a,b)->a+b);
		
		for(String temp : pasos) {
			try {
				//Muestra datos del arreglo
				//System.out.printf("arreglo %d \n",(Integer.parseInt(temp)));
				
				if ((Integer.parseInt(temp)) > 200 && (Integer.parseInt(temp)) < 100000)
					pasostotales.add((Integer.parseInt(temp)));
				} catch (Exception e) {}
		
		}
		return (pasostotales);		
	}
	
}
