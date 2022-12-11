package ex02.tridimensional;

import ex02.forms.FormaTridimensional;

public class Cubo extends FormaTridimensional {

	private double lado;
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public Cubo() {
	}
	public Cubo(double l) {
		this.lado = l;
	}

	public double obterArea() {
		return (6*(this.lado*this.lado));//6L^2
	}
	
	public double obterVolume() {
		return (this.lado * this.lado * this.lado);
	}
	
	public String descricao() {
		return "Cubo";
	}
}
