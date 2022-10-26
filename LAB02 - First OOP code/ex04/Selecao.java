

/*
# Ex04
Crie uma nova classe chamada Selecao, que � composta pelo 
nome da Selecao, por 11 jogadores titulares, o nome do t�cnico,
 e outras informa��es que julgar pertinente. Instancie 2 sele��es.
*/

public class Selecao {
    private String nome;
    Figurinha3[] jogador = new Figurinha3[11];
    private String tecnico;
    
    public Selecao() {
    }

    public Selecao(String nome, Figurinha3[] jogador, String tecnico) {
        this.nome = nome;
        this.jogador = jogador;
        this.tecnico = tecnico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Figurinha3[] getJogador() {
        return jogador;
    }

    public void setJogador(Figurinha3[] jogador) {
        this.jogador = jogador;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

   

}
