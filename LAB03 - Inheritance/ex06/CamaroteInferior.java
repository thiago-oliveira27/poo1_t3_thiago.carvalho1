package ex06;

public class CamaroteInferior extends Vip {
	
    private String localizacao;
    
    public CamaroteInferior() {
    	
    }

    public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getLocalizacao(){
        return this.localizacao;
    }

    public void imprimeLocalizao(){
        System.out.printf(this.localizacao);
    }
}
