

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math.*;

public class ex8 {
	
	/*
	 Fa�a um programa que calcula a m�dia das notas dos alunos de uma turma. 
	 Note que uma turma pode ter no m�ximo 100 alunos (mostrar uma mensagem de 
	 erro caso o n�mero escolhido seja maior que 100). Pe�a para o usu�rio entrar com 
	 o n�mero de alunos e ao final mostre a nota de todos os alunos. 
	 
	 */
	
	public static double average(ArrayList<Integer> lista) {
		double av=0;
		double value=0;
		for(int i=0;i<lista.size();i++) {
			value += lista.get(i);
			av = (value/lista.size());					
		}
		return av;
	}	

	public static void main(String[] args) {
		
		int n_alunos = 0;
		int n = 1; 
		ArrayList<Integer> lista = new ArrayList<Integer>();         
        Scanner sc = new Scanner(System.in);
        
        System.out.println("<< M�dia de n alunos. M�ximo 100 alunos >>\n"
        				 + "Entre com o n�mero de alunos: ");
       
        if((n_alunos = sc.nextInt()) > 100) {
        	System.out.println("Erro! O n�mero m�ximo de alunos permitido � 100.\n"); 
        	System.exit(0);
        }else {
        	for(int i = 0;i<n_alunos;i++){       	
            	System.out.printf("Digite a nota do aluno %d: ", n);
                lista.add(sc.nextInt());           
                n++;            
            }
        }
        
        System.out.println("\nRelat�rio de Notas");
        n=1;
        for(int i=0;i<n_alunos;i++) {
        	System.out.printf("A nota do aluno %d �: %d\n", n, lista.get(i));
        	n++;
        }

       System.out.printf("A m�dia da turma � %.1f\n", average(lista));
    
	}

}
