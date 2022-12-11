package ex03;

import java.util.ArrayList;

import javax.print.attribute.standard.Destination;

public class Main {

    public static void main(String[] args) {
    
    ArrayList<Estudante> est = new ArrayList<>(); 
    
    
    for(int i=0;i<3;i++) {
    	est.add(new EstudanteGraduacao("Thiago", "Uberlandia", "Compiladores"));
    	est.add(new EstudanteMestrado("Felipe", "Uberaba", "Sistemas", "Games", "Profissional", "Games"));
    	est.add(new EstudanteDoutorado("Ronaldo", "Morrinhos", "Sistemas", "VOIP", "Voz por IP"));
    	est.add(new EstudantePosGrad("Thais", "Uberlandia", "Nutricao", "Dietetica"));
    }
    Universidade uni = new Universidade("UFU", est, "11/12/2022");
    
    
    //Quantidade de Estudantes
    System.out.println(uni.qtdEstudantes());
    
    //Dados dos alunos
    for(int i=0;i<est.size();i++) {
		if(est.get(i) instanceof EstudanteDoutorado) {
			
			System.out.println("Nome: " + est.get(i).getNome() + 					   
							   "\nTitulo tese: " + est.get(i).getTituloTese()+
							   "\nLinha de Pesquisa: " + est.get(i).getLinhaDePesquisa() + 
							   "\n______________________________________________________");					
		} else {	
			System.out.println("Nome: " + est.get(i).getNome() +
							   "\n______________________________________________________");				
		}
	}
    
    //Copiando para novo vetor
  	ArrayList<Estudante> novo = new ArrayList<>();	
  	
  	for(int i=0;i<est.size();i++) {
  		 if(est.get(i) instanceof EstudantePosGrad) {
  			 novo.add(est.get(i));
  		 }
  	 }
  	
  	 //Percorrendo o novo vetor
  	System.out.println("***MOSTRANDO DADOS DOS ALUNOS DE POS-GRADUACAO***");
  	 for(int i=0;i<novo.size();i++) {
  		 

  		System.out.println("Nome: " + novo.get(i).getNome() + 
  						   "\nEndereco: " + novo.get(i).getEndereco() +
  						   "\nFormacao: " + novo.get(i).getFormacao() +
  						   "\nTitulo tese: " + novo.get(i).getTituloTese()+
  						   "\nLinha de Pesquisa: " + novo.get(i).getLinhaDePesquisa() + 
				   		   "\n______________________________________________________");		
  	 }
  	 
    }
}
