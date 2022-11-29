package ex04;

/*
 
 Teste de chamada de heran�a
 Fa�a um programa que contenha tr�s classes: C1; C2; C3

- A classe C1 � base da Classe C2, que por sua vez � base da Classe C3
- Para cada classe, inclua um atributo p�blico, protegido e privado (pode ser de qualquer tipo)
- Para cada classe, construa um construtor padr�o sem par�metros e um construtor com par�metros
- Nos construtores de cada classe, inclua um comando que imprime uma mensagem indicando a passagem pelo contrutor. Por exemplo, para C1:
  "Classe C1: chamada do construtor padrao, sem parametros"
  "Classe C3: chamada do construtor com parametros"
- Na classe C3 inclua um construtor que use o "super" para chamar o construtor da classe C2 com par�metro
- Em todas as classes, inclua um m�todo que chama mostar_atributos, que mostra os valores de *todos* os atributos de um objeto (n�o utilizar super)
    - Lembre que as classes herdam os atributos, inclusive os privados - e esses tamb�m devem ser mostrados 
- Em todas as classes, inclua um m�todo que chama mostar_atributos_super, que mostra os valores de *todos* os atributos de um objeto e que utilize super
 
 */



public class C1{

    public int pub; 
    protected int protec;
    private int priv;

    public C1(){
        System.out.println("Classe C1: chamada do construtor padrao, sem parametros *");
    }

    public C1(int pub, int protec, int priv){
        this.pub = pub;
        this.protec = protec;
        this.priv = priv;
       System.out.println("Classe C1: chamada do construtor com parametros");
    }
    
    public String mostrar_atributos() {
		 return "C1:\n" + 
				"Atb1: "+ pub + "\n"+
				"Atb2: "+ protec + "\n"+
				"Atb3: "+ priv;
    }

	public int getPub() {
		return pub;
	}

	public void setPub(int pub) {
		this.pub = pub;
	}

	public int getProtec() {
		return protec;
	}

	public void setProtec(int protec) {
		this.protec = protec;
	}

	public int getPriv() {
		return priv;
	}

	public void setPriv(int priv) {
		this.priv = priv;
	}
    

}