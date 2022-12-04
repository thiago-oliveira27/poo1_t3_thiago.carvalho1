package ex06;

public class Vip extends Ingresso {
	
    private double taxaVip;
    
    public Vip() {
    	
    }
    
    public double getTaxaVip() {
		return taxaVip;
	}

	public void setTaxaVip(double taxaVip) {
		this.taxaVip = taxaVip;
	}

	//valor vip
	public double valorVip(){
        return (this.taxaVip + super.escreveValor());
    }
}
