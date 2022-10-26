
import java.time.LocalDate;

/*
# Ex03
Crie no programa principal um vetor de figurinhas e 
instancie os jogadores de sua prefer�ncia. Mostre as 
informa��es de todos os jogadores. Utilize la�os para 
manipula��o do vetor.
*/

public class Figurinha3{
    private String nome;
    private LocalDate nascimento;
    private float altura;
    private float peso;
    private String posicao;
    private String pais;
    

    public Figurinha3(String nome, LocalDate nascimento, float altura, float peso, String posicao, String pais) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
    }
    
    @Override
    public String toString() {
        return "Figurinha [nome=" + nome + ", nascimento=" + nascimento + ", altura=" + altura + ", peso=" + peso
                + ", posicao=" + posicao + ", pais=" + pais + "]";
    }

    

    
}