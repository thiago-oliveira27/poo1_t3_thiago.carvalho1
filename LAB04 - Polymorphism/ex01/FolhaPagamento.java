package ex01;

public class FolhaPagamento {
	
	Funcionario[] func;
	
	public FolhaPagamento(Funcionario[] func2) {
		this.func = func2;
	}


	public double calculoFolha() {
		double total=0.0;
		for(int i = 0;i<func.length;i++) {
			total += func[i].getSalario();
	}
		
		return total;
	}
	
	public void folhaDetalhada(){
		for(int i = 0;i<func.length;i++) {
						
	        System.out.println("Nome: " + func[i].getNome());	        
	        System.out.println("Data de Nascimento: " + func[i].getDataNascimento());
	        System.out.println("Salario: " + func[i].salarioPadrao(func[i].getSalario()));
	        System.out.println("----------------------------------------------------------");
		
		}
		
	}
	
}
