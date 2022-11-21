
import java.time.LocalDate;


public class Figurinha3{
    protected String nome;
    protected LocalDate nascimento;
    protected float altura;
    protected float peso;
    protected String posicao;
    protected String pais;
    

    public Figurinha3(String nome, LocalDate nascimento, float altura, float peso, String posicao, String pais) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
    }
    
    public String mostrarFigurinha(){

        return "Figurinha [nome=" + nome + ", nascimento=" + nascimento + ", altura=" + altura + ", peso=" + peso
                + ", posicao=" + posicao + ", pais=" + pais + "]";

    }


    

    
}