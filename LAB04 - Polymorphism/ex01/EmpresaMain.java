package ex01;

public class EmpresaMain {
    public static void main(String[] args) {

              
        Funcionario[] func = new Funcionario[4];
        
        func[0] = new Chefe("Thiago","1975-12-25", 8000);
        func[1] = new Vendedor("Felipe", "1982-02-26", 3500, 10, 100);
        func[2] = new Operario("João", "1999-08-11", 500, 8);
        func[3] = new Horista("Carlos", "1996-05-29",40.8, 45.5);                		
        		
        FolhaPagamento folha = new FolhaPagamento(func);
      
        System.out.println("Valor Total da Folha de Pagamento: R$" + folha.calculoFolha());
      
        System.out.printf("\n\nFolha de Pagamento Detalhada: \n\n");
        folha.folhaDetalhada();  
            
            
    }
}