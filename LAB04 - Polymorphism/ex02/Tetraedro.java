package ex02.tridimensional;

import ex02.forms.FormaTridimensional;

public class Tetraedro extends FormaTridimensional {
	
	private double lado;
	private double base;
	private double altura;
	
	
	public Tetraedro() {
	}
	
	public Tetraedro(double l, double a, double h) {
		this.lado = l;
		this.base = a;
		this.altura = h;
	}
	
	public double obterArea() {
		return ((this.lado * this.lado) * Math.sqrt(3));
	}

	public double obterVolume() {
		return (((1.0/3.0)*this.base)*this.altura);
	}
	
	public String descricao() {
		return "Tetraedro";
	}
}
