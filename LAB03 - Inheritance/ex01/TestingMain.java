package ex01;

import java.time.LocalDate;

/*
 Ex01 
(sem heran�a ainda)

Relembre o exerc�cio da pr�tica anterior. Nele indicamos que as figurinhas da copa s�o compostas 
pelas seguintes informa��es sobre os jogadores: Nome do Jogador, Data de Nascimento, Altura, Peso, 
Posi��o, Pa�s. Todos criaram a classe Figurinha, que continha todas as informa��es das figurinhas.
 Modifique o exerc�cio para que inclua um construtor que inicialize todos os atributos. Crie tamb�m na 
 classe um m�todos MostrarFigurinha(), que imprime na tela todos os dados da Figurinha.

Agora crie a classe para as figurinhas extras. Essas s�o bem mais raras e n�o fazem parte da cole��o 
regular, sendo caracterizadas como uma cole��o � parte. Al�m de todos os atributos das figurinhas regulares, 
as raras s�o divididas em duas categorias, "Legends" e "Rookies", e possuem quatro varia��es de cor: 
bord�, bronze, prata e ouro". Crie uma classe chamada FigurinhaExtra, que contenha todos atributos da 
classe Figurinha e acrescente os dois novos atributos. Utilize boas pr�ticas de POO (atributos privados, m�todos get/set),
 crie um construtor que inicializa todos os par�metros e crie tamb�m o m�todo MostrarFigurinha().

Fa�a um programa principal que cria uma Figurinha e uma FigurinhaExtra, e mostre os dados das figurinhas criadas
 
 */


public class TestingMain {
    public static void main(String[]args){
    	
    	Figurinha figNormal = new Figurinha("Felipe",LocalDate.parse("2003-04-12"),1.73f,70.0f,"centro-avante","Brazil");
    	FigExtras figLegend = new FigExtras("Thiago",LocalDate.parse("2003-04-12"),1.73f,70.0f,"centro-avante","Brazil","Legend", "Bordô");

    	System.out.println(figNormal.mostrarFigurinha());
    	System.out.println(figLegend.mostrarFigurinha());
    	
       
    }
   
}
