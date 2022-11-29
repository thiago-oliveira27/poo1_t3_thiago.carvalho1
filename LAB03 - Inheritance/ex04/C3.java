package ex04;

public class C3 extends C2{

	public int pub; 
    protected int protec;
    private int priv;


    public C3(){
        System.out.println("Classe C3: chamada do construtor padrao, sem parametros ***");
    }

    public C3(int pub, int protec, int priv){
       super(pub, protec, priv);
       System.out.println("Classe C3: chamada do construtor da classe SUPER (C2)");
    }

    
    @Override
    public String mostrar_atributos() {
    	return "C3:\n" + 
				"Atb1: "+ this.pub + "\n"+
				"Atb2: "+ this.protec + "\n"+
				"Atb3: "+ this.priv;
    }
    public String mostrar_atributos_super() {
    	return super.mostrar_atributos();
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