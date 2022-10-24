
import java.util.Scanner;

public class ex3 {
	/*	 
		Altere o exerc�cio 2 para que o programa somente
		 aceite n�meros pares. Dica: � melhor usar loop while para ler os n�meros
	 */

    public static void main(String[]args){
    	
        int[]lista = new int[6];
        int[]listaPar = new int[6];
        int pares=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("<< Listando um vetor de n�meros pares>>");
        
        int n=1;
        int i=0; 
        while(pares<6) {
        	System.out.printf("Entre com o n�mero %d:", n);        	       	        	        	
        	
            if((lista[i] = sc.nextInt())%2==0){  
            	listaPar[i] = lista[i];
            	pares++;	
            	n++;
            	i++; 
            }else {
            	System.out.println("Erro: Valor inv�lido");         	           	
            }        	                        
        }       
        System.out.printf("Os n�meros pares digitados foram: ");        
        for(int o = 0;o<6;o++){     	       	 
        	System.out.printf("%d ",listaPar[o]);  
        }
    }
    
}
