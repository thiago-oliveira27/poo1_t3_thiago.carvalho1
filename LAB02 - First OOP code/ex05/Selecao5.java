

/*
# Ex04
Crie uma nova classe chamada Selecao, que � composta pelo 
nome da Selecao, por 11 jogadores titulares, o nome do t�cnico,
 e outras informa��es que julgar pertinente. Instancie 2 sele��es.
*/

public class Selecao {
    private String nome;
    private Figurinha3[] jogador = new Figurinha3[11];
    private String tecnico;
    
    
    public Selecao(String nome, String tecnico) {
        this.nome = nome;
        this.tecnico = tecnico;

        for(int i;i<jogador.length;i++){
            jogador[i] = new Figurinha3(nome);
        }
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
