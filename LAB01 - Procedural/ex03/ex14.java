
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex14 {	
	/*
	 Fa�a um programa que leia um vetor de 8 posi��es e verifique se 
	 existem valores iguais e os escreva (cada n�mero repetido deve 
	 aparecer somente uma vez na resposta) 
	 */

	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		Set<Integer> repete = new HashSet<Integer>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("<< Valores iguais >>");
        
        int n=1;
        
        for(int i=0;i<8;i++) {
        	System.out.printf("Entre com o n�mero %d: ", n);
        	lista.add(sc.nextInt());
        	n++;
        }
        
        Set<Integer> set = new HashSet<Integer>();       

        lista.forEach((x) -> {
           boolean adicionou = set.add(x);
           if(!adicionou){
        	   repete.add(x);
           }
        });
        
        System.out.printf("\n\nValores repetidos: ");
        for(int x : repete) {
        	System.out.printf("%d ",x);
        }
        
	}
	
}
          

         
        
                  
        
   

