package ex03;

import java.time.LocalDate;


public class Figurinha2{
	private String nome; 
	private LocalDate nascimento;
	private float altura;
	private float peso;
	private String posicao;
	private String pais;
    

    public Figurinha2(String nome, LocalDate nascimento, float altura, float peso, String posicao, String pais) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
    }
    
    public String mostrarFigurinha(){

        return "Figurinha \nNome=" + nome + ", nascimento=" + nascimento + ", altura=" + altura + ", peso=" + peso
                + ", posicao=" + posicao + ", pais=" + pais+ "\n";

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


    

    
}