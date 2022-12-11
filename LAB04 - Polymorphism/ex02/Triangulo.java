package ex02.bidimensional;

import ex02.forms.FormaBidimensional;

public class Triangulo extends FormaBidimensional {

	private double base;
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	private double altura;
	
	public Triangulo() {
		
	}

	public Triangulo(double b, double h) {
		this.base = b;
		this.altura = h;
	}
	
	public double obterArea() {
		return (base*altura)/2;
	}

	public double obterVolume() {
		return 0;
	}

	public String descricao() {
		return "Triangulo";
	}
}
