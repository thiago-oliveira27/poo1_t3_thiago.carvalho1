
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math.*;

public class ex9 {
	
	/*
	 Fa�a um programa que receba do usu�rio dois arrays  A e B,
	  com 3 n�meros inteiros cada. Crie um novo array C calculando 
	  C = A - B. Mostre na tela os dados do array C.
	 
	 */
		
	public static void main(String[] args) {
			
		int n = 1; 
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>(); 
		ArrayList<Integer> C = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("<< Subtra��o de vetores >>\n");
       
        for(int i = 0;i<3;i++){       	
        	System.out.printf("Digite o valor %d de A: ", n);
            A.add(sc.nextInt());           
            n++; 
        }
        
        n=1;
        for(int i = 0;i<3;i++){       	
        	System.out.printf("Digite o valor %d de B: ", n);
            B.add(sc.nextInt());           
            n++; 
        }
                
        n=1;
        for(int i=0;i<3;i++) {
        	C.add((A.get(i)-B.get(i))); 
        }
        System.out.printf("\n\nO vetor C, definido como C = A-B � (%d,%d,%d)", C.get(0),C.get(1),C.get(2));
           
	}

}
