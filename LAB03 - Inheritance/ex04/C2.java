package ex04;

public class C2 extends C1{

	public int pub; 
    protected int protec;
    private int priv;
    
    public C2(){
        System.out.println("Classe C2: chamada do construtor padrao, sem parametros **");
    }

    public C2(int pub, int protec, int priv){
        this.pub = pub;
        this.protec = protec;
        this.priv = priv;
       System.out.println("Classe C2: chamada do construtor com parametros");
    }

    @Override
    public String mostrar_atributos() {
    	return "C2:\n" + 
				"Atb1: "+ pub + "\n"+
				"Atb2: "+ protec + "\n"+
				"Atb3: "+ priv;
    }
    
    public String mostrar_atributos_super() {
    	return "C2---->"+super.mostrar_atributos();
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