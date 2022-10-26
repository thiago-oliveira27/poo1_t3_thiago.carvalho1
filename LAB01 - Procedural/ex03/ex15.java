
import java.util.Scanner;

public class ex15 {	
	/*
	 Fa�a um programa que leia um vetor de 8 posi��es e 
	 verifique se existem valores iguais e os escreva a quantidade
	 de vezes que eles aparecem na lista
	*/

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int[][] nums = new int[8][2];
        int ultimo = 0;
        int n=1;
        
        for(int c = 0; c < nums.length; c++) {
        	
            System.out.printf("Entre com o n�mero %d: ", n);
            n++;
            nums[c][1] = 1;
            int entrada = scanner.nextInt();
            
            boolean n_existe = false;

            for (int i = 0; i < c; i++) {
                if (nums[i][0] == entrada) {
                    n_existe = true;
                    nums[i][1] += 1;
                }
            }

            if (!n_existe) {
                nums[ultimo][0] = entrada;
                ultimo = ultimo + 1;
            }
        }

        System.out.println("Valores repetidos:");
        for(int c = 0; c < ultimo; c++) {
            if (nums[c][1] > 1) {
                System.out.printf(nums[c][0] + " aparece " + nums[c][1] + " vezes\n");
            } 
            
        }
		
	}
	
}
          

         
        
                  
        
   

