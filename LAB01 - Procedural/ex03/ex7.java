

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math.*;

public class ex7 {
	
	/*
	 Calcular a m�dia e o desvio padr�o amostral 
	 de 5 n�meros informados pelo usu�rio.  
	 
	 */
	
	public static int average(ArrayList<Integer> lista) {
		int av=0;
		int value=0;
		for(int i=0;i<lista.size();i++) {
			value += lista.get(i);
			av = (value/lista.size());					
		}
		return av;
	}
	
	public static double desvio_padrao(ArrayList<Integer> lista, int av, double sum) {
		double media = (sum/lista.size());
		double a = 1.0/(5.0-1.0);
        double sumDesvio = 0;
        double desvio = 0;
        
		for(int i=0;i<lista.size();i++) {				
			
			sumDesvio += Math.pow((lista.get(i)-media),2);						
		}
		desvio = Math.sqrt(a*sumDesvio);
		return desvio;
		
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();         
        Scanner sc = new Scanner(System.in);
        
        System.out.println("<< M�dia e desvio-padr�o >>");
        
        int n = 1;
        double sum = 0;
        for(int i = 0;i<5;i++){       	
        	System.out.printf("Digite o valor %d:", n);
            lista.add(sc.nextInt());
            sum += lista.get(i);
            n++;            
        }

       System.out.printf("A m�dia � %d e o desvio-padr�o � %.13f\n", average(lista), desvio_padrao(lista,average(lista), sum));
    
	}

}
