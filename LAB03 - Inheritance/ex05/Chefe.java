package ex05;

public class Chefe extends Funcionario {

	/*
    Chefe: sal�rio fixo e predefinido;
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