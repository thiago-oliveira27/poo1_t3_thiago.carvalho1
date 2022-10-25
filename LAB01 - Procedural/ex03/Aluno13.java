package poo;
public class Aluno13 {
	
	/*
	 Faça um programa que armazene informações sobre os alunos de uma universidade.
	  O número máximo de alunos que o sistema pode cadastrar é 10000. 
	  Os dados a serem armazenados são: número de matrícula (inteiro); 
	  classe social (A, B, C, D ou E); CRA (real).
	   Ao iniciar o programa, informe quantos usuários serão cadastrados. 
	   Depois de realizado o cadastro, 
	   mostre todos os dados lidos. A saída do programa deve ser como o exemplo abaixo.
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
		 
	        return "Número: " + matricula  +
	               " Classe Social: " + classe  +
	               " CRA: " + cra;
	    }
	
	

	
}
