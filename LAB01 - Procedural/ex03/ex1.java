
import java.util.Scanner;

public class ex1 {
	/*
	 	Refazer o exercicio anterior utilizando loop for. 
	 Todos os proximos exercicios devem ser feitos com loops 
	 (pense qual o melhor loop: for, while ou do-while)
	 */

    public static void main(String[]args){
    	
        int[]lista = new int[6];

        Scanner sc = new Scanner(System.in);

        System.out.println("<< Listando um vetor >>");
        
        int n = 1;
        for(int i = 0;i<6;i++){       	
        	System.out.printf("Entre com o n�mero %d:", n);
            lista[i] = sc.nextInt();
            n++;          
        }
        
        System.out.printf("Os valores lidos s�o: ");
        
        for(int i = 0;i<6;i++){     	       	 
        	System.out.printf("%d ",lista[i]);  
        }
    }
    
}
