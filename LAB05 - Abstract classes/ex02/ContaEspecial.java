package ex01;

public class ContaEspecial extends ContaCorrente {

	private float limite;
	
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public ContaEspecial(float val, int num, int pwd, float limi) {
		super(val, num, pwd);

		this.limite = limi;
	
	}
	
	

}
