package ex01;

import java.time.LocalDate;

/*
 Ex01 
(sem herança ainda)

Relembre o exercício da prática anterior. Nele indicamos que as figurinhas da copa são compostas 
pelas seguintes informações sobre os jogadores: Nome do Jogador, Data de Nascimento, Altura, Peso, 
Posição, País. Todos criaram a classe Figurinha, que continha todas as informações das figurinhas.
 Modifique o exercício para que inclua um construtor que inicialize todos os atributos. Crie também na 
 classe um métodos MostrarFigurinha(), que imprime na tela todos os dados da Figurinha.

Agora crie a classe para as figurinhas extras. Essas são bem mais raras e não fazem parte da coleção 
regular, sendo caracterizadas como uma coleção à parte. Além de todos os atributos das figurinhas regulares, 
as raras são divididas em duas categorias, "Legends" e "Rookies", e possuem quatro variações de cor: 
bordô, bronze, prata e ouro". Crie uma classe chamada FigurinhaExtra, que contenha todos atributos da 
classe Figurinha e acrescente os dois novos atributos. Utilize boas práticas de POO (atributos privados, métodos get/set),
 crie um construtor que inicializa todos os parâmetros e crie também o método MostrarFigurinha().

Faça um programa principal que cria uma Figurinha e uma FigurinhaExtra, e mostre os dados das figurinhas criadas
 
 */


public class TestingMain {
    public static void main(String[]args){
    	
    	Figurinha figNormal = new Figurinha("Felipe",LocalDate.parse("2003-04-12"),1.73f,70.0f,"centro-avante","Brazil");
    	FigExtras figLegend = new FigExtras("Thiago",LocalDate.parse("2003-04-12"),1.73f,70.0f,"centro-avante","Brazil","Legend", "BordÃ´");

    	System.out.println(figNormal.mostrarFigurinha());
    	System.out.println(figLegend.mostrarFigurinha());
    	
       
    }
   
}
