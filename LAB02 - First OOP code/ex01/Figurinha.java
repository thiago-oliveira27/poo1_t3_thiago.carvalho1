import java.time.LocalDate;

/*
# Ex01 
As figurinhas da copa s�o compostas pelas seguintes informa��es sobre os jogadores: Nome do Jogador, Data de Nascimento, Altura, Peso, Posi��o,Pa�s
Crie uma classe Figurinha, que conter� todas as informa��es das figurinhas
Em um outro programa (outro c�digo Java), instancie 3 objetos, com informa��es de seus jogadores de prefer�ncia. Fa�a atribui��o de valores no pr�prio c�digo e mostre as informa��es na tela.
*/

public class Figurinha {
    public String nome;
    public LocalDate nascimento;
    public float altura;
    public float peso;
    public String posicao;
    public String pais;


    @Override
    public String toString() {
        return "Jogador [nome=" + nome + ", nascimento=" + nascimento + ", altura=" + altura + ", peso=" + peso
                + ", posicao=" + posicao + ", pais=" + pais + "]";
    }

    

    
}
