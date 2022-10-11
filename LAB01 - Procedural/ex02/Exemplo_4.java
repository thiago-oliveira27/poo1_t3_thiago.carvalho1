import java.util.Locale;
import java.util.Scanner;

public class Exemplo_4{
	
public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
                               
        Produto[] prod = new Produto[4];
        
		for(int i=0;i<prod.length;i++) {
        	prod[i] = new Produto();      	
        }
        
        for(int i = 0; i<prod.length;i++){
            System.out.println("\nInforme o nome, o preco e a qtd. em estoque do produto nº"+ (i+1)+"\n");
            prod[i].setNome(sc.next());
            prod[i].setPreco(sc.nextFloat());            
            prod[i].setQtd_estoque(sc.nextInt());
            sc.nextLine();
        }
               
        System.out.println("\nAumentando o preco em 10% do produto 1 e 3");
        
        prod[0].altera_preco(prod[0].getPreco(), -110);
        prod[2].altera_preco(prod[2].getPreco(), 10);

        System.out.println("\nReduzindo o preco em 5% do produto 2");
        
        if (prod[1].altera_preco(prod[1].getPreco(), -5)==-1){
            System.out.println("\n\nErro: preco nao alterado. Porcentagem invalida\n");
        } else {
            System.out.println("\n\nPreco alterado com sucesso");
        }

       System.out.println("\nAlterando o preco do prod. 3");
        
	   if (prod[2].altera_preco(prod[2].getPreco(), -110) == -1){
	      System.out.println("\n\nErro: preco nao alterado. Porcentagem invalida\n");
	   }
	   System.out.println("\nProdutos Cadastrados:\n");
	   
	   for (int i = 0; i < prod.length; i++){
	     System.out.println( "\nProduto: " + prod[i].getNome() 
				    	   + "\nPreco " + prod[i].getPreco() 
				    	   + "\nEstoque " + prod[i].getQtd_estoque());
	   }
        
        
        
        
        
        
        
        
        
        
        
   

    }


}
