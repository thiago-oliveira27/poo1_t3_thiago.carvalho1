package ex01;

import java.time.LocalDate;

public class Figurinha{
    private String nome;
    private LocalDate nascimento;
    private float altura;
    private float peso;
    private String posicao;
    private String pais;
    

    public Figurinha(String nome, LocalDate nascimento, float altura, float peso, String posicao, String pais) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
    }
    
    public String mostrarFigurinha(){

        return "Figurinha \nNome=" + this.nome + ", nascimento=" + this.nascimento + ", altura=" + this.altura + ", peso=" + this.peso
                + ", posicao=" + this.posicao + ", pais=" + this.pais + "\n";

    }


    

    
}