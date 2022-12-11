package ex01;

public class Chefe extends Funcionario {

	/*
    Chefe: salário fixo e predefinido;
   */
	
	public Chefe() {
		
	}
	public Chefe(String nome, String dataNascimento, double salario) {
		super(nome, dataNascimento, salario);
		
	}

	@Override
	public double salarioPadrao(double salario) {
		return super.getSalario();
	}

    

}