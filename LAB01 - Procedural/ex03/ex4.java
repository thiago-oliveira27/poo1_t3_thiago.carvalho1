

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex4 {
	
	/*
	 Fazer um programa para ler 5 valores, e, em seguida, mostrar 
	 todos os valores lidos juntamente com o maior, o menor e a m�dia dos valores 
	 */

	
	public static double average(ArrayList<Integer> lista) {
		double av=0;
		double value=0;
		for(int i=0;i<lista.size();i++) {
			value += (double)lista.get(i);
			av = (value/lista.size());					
		}
		return av;
	}
	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
         
        Scanner sc = new Scanner(System.in);
        System.out.println("<< 5 valores >>");
        
        int n = 1;
        for(int i = 0;i<5;i++){       	
        	System.out.printf("Entre com o n�mero %d:", n);
            lista.add(sc.nextInt());
            n++;            
        }
                     
       System.out.printf("Os n�meros digitados s�o: ");
       
       for(int j=0;j<lista.size();j++) {
    	   
    	   System.out.printf("%d ", lista.get(j));
       }
       System.out.printf("\nO maior valor �: %d\n", Collections.max(lista));
       System.out.printf("O menor valor �: %d\n", Collections.min(lista));
       System.out.printf("A m�dia �: %.1f\n", average(lista));

	}

}
