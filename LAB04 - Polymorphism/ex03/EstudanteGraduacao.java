package ex03;

public class EstudanteGraduacao extends Estudante {
	
    private String tituloTCC;

    public EstudanteGraduacao(String nome, String endereco, String tituloTCC) {
        super(nome, endereco);
        this.tituloTCC = tituloTCC;
    }

    public void print() {
        System.out.println("EstudanteGraduacao{" +
                "tituloTCC='" + tituloTCC + '\'' +
                '}');
    }

    public String getTituloTCC() {
        return tituloTCC;
    }

    public void setTituloTCC(String tituloTCC) {
        this.tituloTCC = tituloTCC;
    }

    public String getTituloTcc() {
		return null;
	}
	public String getTituloTese() {
		return null;
	}
	public String getLinhaDePesquisa() {
		return null;
	}
	protected String getFormacao() {
		return null;
	}
	
}
