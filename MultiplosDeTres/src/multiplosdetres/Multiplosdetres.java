package multiplosdetres;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


// Parametros para prueba 10 20 30 33 21 8 2 61
public class Multiplosdetres {
	
	public static void main(String[] ARGS) {
		
		List<Integer> multiplosdetres = filtro(ARGS);
		//System.out.printf("datos filtrados %s \n",multiplosdetres);		
		
		System.out.printf("Suma Final %d \n",suma(multiplosdetres));		
		System.out.printf("Promedio Final %d \n",promedio(multiplosdetres));
	}	
	
	public static ArrayList<Integer> filtro(String[] argumentos) {
		ArrayList<Integer> numerosArgs = new ArrayList<Integer>();
	
		for(int i=0;i<argumentos.length;i++) {
		if ((Integer.parseInt(argumentos[i]))%3==0)
			numerosArgs.add(Integer.parseInt(argumentos[i]));	 	
	}
	return (numerosArgs);
}
	
	private static int suma(List<Integer> total) {		
		int suma = total.stream().reduce(0,(a,b)->a+b);
		return(suma);		
	}
	
	private static int promedio(List<Integer> suma) {		
		int prom = (suma.stream().reduce(0,(a,b)->a+b)/suma.size());
		return(prom);		
	}
}


/*
private static List<Integer> filtro1(List<Integer> datos) {

List<Integer> solomultiplos = datos.stream()
		.filter(x-> x%3==0)
		//para cada elemento, se compara si es mayor o igual a 4
		 .collect(Collectors.toList());
		System.out.println(solomultiplos); //[4, 8, 5, 5, 10]
return (solomultiplos);
}
*/