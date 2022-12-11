package ex03;

import java.util.ArrayList;

public class Universidade {

	private String nome;
	private String dataFundacao;
	private int capacidade = 100;
	private ArrayList<Estudante> estudantes = new ArrayList<>(capacidade);
	
	public Universidade(String nome, ArrayList<Estudante> est, String dataFund) {
		this.nome = nome;
		this.estudantes = est;
		this.dataFundacao = dataFund;	
	}
	
	public String qtdEstudantes() {
		
		int graduacao  = 0;
		int mestrado  = 0;
		int doutorado = 0;
		
		for(int i=0;i<estudantes.size();i++) {
			if(estudantes.get(i) instanceof EstudanteGraduacao) {
				graduacao++;
			} else if(estudantes.get(i) instanceof EstudanteMestrado) {
				mestrado++;
			}else if(estudantes.get(i) instanceof EstudanteDoutorado) {
				doutorado++;
			}
		}
		return "Quantidade de alunos de: \n" +
			   "Graducao - "    + graduacao + 
			   "\nMestrado - "  + mestrado  + 
			   "\nDoutorado - " + doutorado;
		
	}
	
		
	
	
}
