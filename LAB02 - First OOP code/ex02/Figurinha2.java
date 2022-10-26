import java.time.LocalDate;

/*
# Ex02
Crie um novo projeto, semelhante ao exerc�cio anterior. 
Torne todas os atributos do exerc�cio 1 privados. 
Crie m�todos para alterar os valores dos atributos e para mostrar os
 valores dos atributos na tela. Instancie os mesmos tr�s jogadores.
*/

public class Figurinha2{
    private String nome;
    private LocalDate nascimento;
    private float altura;
    private float peso;
    private String posicao;
    private String pais;
    public Figurinha2() {
    }
   
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getNascimento() {
        return nascimento;
    }
    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    @Override
    public String toString() {
        return "Jogador [nome=" + nome + ", nascimento=" + nascimento + ", altura=" + altura + ", peso=" + peso
                + ", posicao=" + posicao + ", pais=" + pais + "]";
    }

    

    
}