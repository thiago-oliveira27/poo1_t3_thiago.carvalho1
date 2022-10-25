public class Aluno13 {
	
	/*
	 Fa�a um programa que armazene informa��es sobre os alunos de uma universidade.
	  O n�mero m�ximo de alunos que o sistema pode cadastrar � 10000. 
	  Os dados a serem armazenados s�o: n�mero de matr�cula (inteiro); 
	  classe social (A, B, C, D ou E); CRA (real).
	   Ao iniciar o programa, informe quantos usu�rios ser�o cadastrados. 
	   Depois de realizado o cadastro, 
	   mostre todos os dados lidos. A sa�da do programa deve ser como o exemplo abaixo.
	 */
	private int matricula;
	private char classe;
	private double cra;
	
	public Aluno13(int matricula, char classe, double cra) {
		super();
		this.matricula = matricula;
		this.classe = classe;
		this.cra = cra;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public char getClasse() {
		return classe;
	}
	public void setClasse(char classe) {
		this.classe = classe;
	}
	public double getCra() {
		return cra;
	}
	public void setCra(double cra) {
		this.cra = cra;
	}
	
	 @Override
	    public String toString() {
		 
	        return "N�mero: " + matricula  +
	               " Classe Social: " + classe  +
	               " CRA: " + cra;
	    }
	
	

	
}
