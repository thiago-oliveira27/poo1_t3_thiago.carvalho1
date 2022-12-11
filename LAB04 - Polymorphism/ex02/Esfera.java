package ex02.tridimensional;

import ex02.forms.FormaTridimensional;

public class Esfera extends FormaTridimensional {

	private double raio;
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}

	private double pi = 3.14;
	
	public Esfera() {
		
	}
	public Esfera(double r) {
		this.raio = r;
	}
		
	public double obterArea() {
		return (4*(this.pi*(this.raio * this.raio)));
	}
	
	public double obterVolume() {
		return ((4.0/3.0)*(this.pi*(this.raio*this.raio*this.raio)));
	}
	
	public String descricao() {
		return "Esfera";
	}
}
