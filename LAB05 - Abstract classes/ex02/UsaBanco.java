package ex01;

public class UsaBanco {

	public static void main(String[] args) {

		ContaEspecial ce = new ContaEspecial(1200, 1, 123, 0);
		
		if(ce.getLimite() == 0) {
			System.out.println("Criando nova Conta Comum pois o limite da Especial eh igual a Zero");
			ContaComum cc = new ContaComum(ce.getSaldo(), ce.getNumConta(), ce.getSenha());
			ce = null; //erasing old account 
		}
	}

}
