

import java.util.Scanner;

public class ex2 {
	/*
	 
	Fa�a um programa em que o usu�rio digita 6 n�meros inteiros e o programa 
	mostra na tela os 6 n�meros digitados na ordem inversa (obrigat�rio o uso de loops)

	 */

    public static void main(String[]args){
    	
        int[]lista = new int[6];

        Scanner sc = new Scanner(System.in);

        System.out.println("<< Listando um vetor em ordem inversa >>");
        
        int n = 1;
        for(int i = 0;i<6;i++){       	
        	System.out.printf("Entre com o n�mero %d:", n);
            lista[i] = sc.nextInt();
            n++;            
        }
        
        System.out.printf("A ordem inversa dos n�meros �: ");
        
        for(int i = 5; i>=0; i--){     	       	 
        	System.out.printf("%d ",lista[i]);  
        }
    }
    
}
