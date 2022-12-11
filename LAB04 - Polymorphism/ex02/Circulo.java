package ex02.bidimensional;

import ex02.forms.FormaBidimensional;

public class Circulo extends FormaBidimensional {
	
	private double raio;
	
	public Circulo() {
	}
	
	public Circulo (double r) {
		this.raio = r;
	}

	public void setRaio(double r) {
			this.raio = r;
	}
	public double getRaio() {
		return raio;
	}
	
	@Override
	public double obterArea() {
		return (3.14*(this.raio*this.raio));
	}
	
	public String descricao() {
		return "Circulo";
	}
	@Override
	public double obterVolume() {
		// TODO Auto-generated method stub
		return 0;
	}
}
