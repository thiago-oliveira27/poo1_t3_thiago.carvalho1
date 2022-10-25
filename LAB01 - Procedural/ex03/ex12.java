
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex12 {
	
	/*
	 Leia um vetor de 5 posi��es e atribua valor 0 para todos os 
	 elementos que possu�rem valores negativos. Mostre o vetor final.
 
	 */

	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();         
        Scanner sc = new Scanner(System.in);
        
        System.out.println("<< Zerando negativos >>");
        
        int n = 1;
        for(int i = 0;i<5;i++){       	
        	System.out.printf("Entre com o n�mero  %d:", n);
            lista.add(sc.nextInt());
            n++;            
        }
        
        
        for(int i = 0;i<lista.size();i++){       	        	
        	int a = lista.get(i);
        	if(a<0) {
        		a = 0;
                lista.set(i, a);
        	}                          
        }     
        
       System.out.printf("Zerando os negativos, obt�m-se: ");
      
       for(int j=0;j<lista.size();j++) {    	   
    	  System.out.printf("%d ", lista.get(j));
    	  n++;
       }
       
   
       
	}

}
