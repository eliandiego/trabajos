package negativospositivos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


//Parametros usados 0 1 2 3 -1 0 -4 -2 3 0 1 -1

public class Negativospositivos {
	public static void main(String[] ARGS) {
		//int positivos,negativos=0,ceros=0;
		
		int[] resultados=numeros(ARGS);	
		//		(positivos,negativos,ceros)=numeros(ARGS);
		//List<Integer> multiplosdetres = numeros(ARGS);
		for (int i=0;i<resultados.length;i++) {
			System.out.println(resultados[i]);
		}
	}
	
	public static int[] numeros(String[] argumentos) {
		int positivos=0,negativos=0,ceros=0;
		ArrayList<Integer> numerosArgs = new ArrayList<Integer>();
		
		for(int i=0;i<argumentos.length;i++) {
			if ((Integer.parseInt(argumentos[i]))==0) ceros+=1;				
			if ((Integer.parseInt(argumentos[i])) > 0) positivos+=1;
			if ((Integer.parseInt(argumentos[i])) < 0) negativos+=1;
		}
		return new int [] {positivos,negativos, ceros};			
	}
}
