import java.time.LocalDate;

/*
# Ex01 
As figurinhas da copa s�o compostas pelas seguintes informa��es sobre os jogadores: Nome do Jogador, Data de Nascimento, Altura, Peso, Posi��o,Pa�s
Crie uma classe Figurinha, que conter� todas as informa��es das figurinhas
Em um outro programa (outro c�digo Java), instancie 3 objetos, com informa��es de seus jogadores de prefer�ncia. Fa�a atribui��o de valores no pr�prio c�digo e mostre as informa��es na tela.
*/

public class Main {
    public static void main(String[] args){
        //Exercicio1
        Figurinha figurinha = new Figurinha();
        figurinha.nome = "Thiago";
        figurinha.nascimento = LocalDate.parse("2003-10-23");
        figurinha.altura = 1.73f;
        figurinha.peso = 65;
        figurinha.posicao = "Goleiro";
        figurinha.pais = "Brasil";

        Figurinha figurinha2 = new Figurinha();
        figurinha2.nome = "Vinicio";
        figurinha2.nascimento = LocalDate.parse("2003-10-30");
        figurinha2.altura = 1.90f;
        figurinha2.peso = 100;
        figurinha2.posicao = "Volante";
        figurinha2.pais = "Brasil";

        Figurinha figurinha3 = new Figurinha();
        figurinha3.nome = "Lucas";
        figurinha3.nascimento = LocalDate.parse("2000-07-13");
        figurinha3.altura = 1.60f;
        figurinha3.peso = 80;
        figurinha3.posicao = "Atacante";
        figurinha3.pais = "Alemanha";
        
        System.out.println(figurinha);
        System.out.println(figurinha2);
        System.out.println(figurinha3);
    }
}
