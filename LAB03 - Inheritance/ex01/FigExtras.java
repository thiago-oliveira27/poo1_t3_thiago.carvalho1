/*

Relembre o exercício da prática anterior. Nele indicamos que as figurinhas da copa são compostas pelas seguintes informações sobre os jogadores: Nome do Jogador, Data de Nascimento, Altura, Peso, Posição, País. Todos criaram a classe Figurinha, que continha todas as informações das figurinhas. Modifique o exercício para que inclua um construtor que inicialize todos os atributos. Crie também na classe um métodos MostrarFigurinha(), que imprime na tela todos os dados da Figurinha.

Agora crie a classe para as figurinhas extras. Essas são bem mais raras e não fazem parte da coleção regular, sendo caracterizadas como uma coleção à parte. Além de todos os atributos das figurinhas regulares, as raras são divididas em duas categorias, "Legends" e "Rookies", e possuem quatro variações de cor: bordô, bronze, prata e ouro". Crie uma classe chamada FigurinhaExtra, que contenha todos atributos da classe Figurinha e acrescente os dois novos atributos. Utilize boas práticas de POO (atributos privados, métodos get/set), crie um construtor que inicializa todos os parâmetros e crie também o método MostrarFigurinha().

Faça um programa principal que cria uma Figurinha e uma FigurinhaExtra, e mostre os dados das figurinhas criadas

*/


import java.time.LocalDate;


public class FigExtras{
    private String nome;
    private LocalDate nascimento;
    private float altura;
    private float peso;
    private String posicao;
    private String pais;
    private String categoria;
    private String cor;
    

    public FigExtras(String nome, LocalDate nascimento, 
                    float altura, float peso, String posicao, 
                    String pais, String categoria, String cor){

        this.nome = nome;
        this.nascimento = nascimento;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
        this.categoria = categoria;
        this.cor = cor;
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

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
public String getCategoria() {
        return categoria;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }
    
    public String mostrarFigurinha(){

        return "Figurinha [nome=" + nome + ", nascimento=" + nascimento + ", altura=" + altura + ", peso=" + peso
                + ", posicao=" + posicao + ", pais=" + pais + "]";

    }


    

    
}