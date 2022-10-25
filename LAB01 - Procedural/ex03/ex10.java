
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math.*;

public class ex10 {
	
	/*
		Leia 5 n�meros inteiros e armazene em um vetor v. Crie dois novos vetores v1 e v2. 
		Copie os valores �mpares de v para v1, e os valores pares de v para v2. 
		Note que cada um dos vetores v1 e v2 tem no m�ximo 5 elementos, 
		mas nem todos os elementos s�o utilizados. 
		No final escreva os elementos UTILIZADOS de v1 e v2.
	 
	 */
		
	public static void main(String[] args) {
			
		int n = 1; 
		ArrayList<Integer> V = new ArrayList<Integer>();
		ArrayList<Integer> V1 = new ArrayList<Integer>(); 
		ArrayList<Integer> V2 = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("<< Pares e �mpares >>");
       
        for(int i = 0;i<5;i++){       	
        	System.out.printf("Digite o valor %d: ", n);
            V.add(sc.nextInt());           
            n++; 
        }
                
        for(int i = 0;i<5;i++){       	
        	if(V.get(i)%2!=0) {
        		V1.add(V.get(i));
        	}else {
        		V2.add(V.get(i));
        	}        	
        }
                
        System.out.printf("�mpares: ");
        for(int i=0;i<V1.size();i++) {
        	System.out.printf("%d ",V1.get(i)); 
        }
        System.out.printf("\nPares: ");
        for(int i=0;i<V2.size();i++) {
        	System.out.printf("%d ",V2.get(i));  
        }
	}

}
