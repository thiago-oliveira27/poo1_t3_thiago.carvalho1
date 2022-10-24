

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex6 {
	
	/*
	 Elabore um algoritmo para normalizar as notas de
	  uma turma de 5 alunos. A maior nota deve virar 100.  
	 */

	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();         
        Scanner sc = new Scanner(System.in);
        
        System.out.println("<<Normalizando as notas>>");
        
        int n = 1;
        for(int i = 0;i<5;i++){       	
        	System.out.printf("Entre com a nota do aluno %d:", n);
            lista.add(sc.nextInt());
            n++;            
        }
        
        int maior = (100 / Collections.max(lista));
        
        for(int i = 0;i<lista.size();i++){       	        	
        	int a = lista.get(i);
            a *= maior;
            lista.set(i, a);              
        }
                     
       System.out.printf("Notas normalizadas\n\n");
       
       n=1;       
       for(int j=0;j<lista.size();j++) {    	   
    	  System.out.printf("A nota do aluno %d � %d\n", n, lista.get(j));
    	  n++;
       }
       
   
       
	}

}
