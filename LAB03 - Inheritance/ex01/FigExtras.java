package ex01;

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

        return "Figurinha Extra\nNome=" + nome + ", nascimento=" + nascimento + ", altura=" + altura + ", peso=" + peso
                + ", posicao=" + posicao + ", pais=" + pais;

    }


    

    
}