
import java.util.ArrayList;
import java.util.Scanner;

public class ex13 {
	
	/*
	 Fa�a um programa que armazene informa��es sobre os alunos de uma universidade.
	  O n�mero m�ximo de alunos que o sistema pode cadastrar � 10000. 
	  Os dados a serem armazenados s�o: n�mero de matr�cula (inteiro); 
	  classe social (A, B, C, D ou E); CRA (real).
	   Ao iniciar o programa, informe quantos usu�rios ser�o cadastrados. 
	   Depois de realizado o cadastro, 
	   mostre todos os dados lidos. A sa�da do programa deve ser como o exemplo abaixo.
 
	 */

	public static void main(String[] args) {
		
		ArrayList<Aluno13> lista = new ArrayList<Aluno13>();         
        Scanner sc = new Scanner(System.in);
        
        System.out.println("<< Universidade X >>");
        System.out.println("Quantos alunos ser�o cadastrados: ");

        int n_alunos=0;
        
		if((n_alunos = sc.nextInt()) > 10000) {
			
        	System.out.println("Erro! O n�mero m�ximo de alunos permitido � 10000.\n"); 
        	System.exit(0);
        	
        }else {
        	
        	for(int i = 0;i<n_alunos;i++){  
        		
        		int n_aluno=0;
        		char classe=0;
        		double cra=0;
        		
            	System.out.printf("Entre com o n�mero do aluno: ");
            	n_aluno = sc.nextInt();
            	System.out.printf("Entre com a classe social do aluno: ");
            	classe = sc.next().charAt(0);
            	System.out.printf("Entre com o cra do aluno: ");
            	cra = sc.nextInt();
            	sc.nextLine();
            	
            	Aluno13 aluno = new Aluno13(n_aluno,classe,cra);
                lista.add(aluno);           
           
            }
        }
		
		System.out.println("\n==== Alunos Cadastrados ====");
		
       for(Aluno13 x : lista) {
    	   System.out.println(x);
       }
   
       
	}

}
;