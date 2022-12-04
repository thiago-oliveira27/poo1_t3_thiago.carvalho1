package ex06;

public class CamaroteSuperior extends Vip {
		
	private double taxaSuperior;
	
	public CamaroteSuperior(){
		
	}
	
	public double getTaxaSuperior() {
		return taxaSuperior;
	}

	public void setTaxaSuperior(double taxaSuperior) {
		this.taxaSuperior = taxaSuperior;
	}


    public double getValorCamaroteSuperior(){
       return (this.taxaSuperior + super.getValor());
    }
}
