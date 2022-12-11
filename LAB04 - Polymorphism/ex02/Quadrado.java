package ex02.bidimensional;

import ex02.forms.FormaBidimensional;

public class Quadrado extends FormaBidimensional {

	private double lado;
	
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public Quadrado() {
	}
	public Quadrado(double l) {
		this.lado = l;
	}

	public double obterArea() {
		return (this.lado * this.lado);
	}
	
	@Override
	public double obterVolume() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String descricao() {
		return "Quadrado";
	}
	
	
}
