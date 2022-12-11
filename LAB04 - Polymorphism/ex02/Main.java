package ex02;

import java.util.ArrayList;
import java.util.Random;

import ex02.bidimensional.Circulo;
import ex02.bidimensional.Quadrado;
import ex02.bidimensional.Triangulo;
import ex02.forms.Forma;
import ex02.forms.FormaBidimensional;
import ex02.forms.FormaTridimensional;
import ex02.tridimensional.Cubo;
import ex02.tridimensional.Esfera;
import ex02.tridimensional.Tetraedro;

public class Main {

	public static void main(String[] args) {

		ArrayList<Forma> lista = new ArrayList<>();	
		
		//Forma [] list = new Forma[30];
		
        Random ram = new Random();  
        
        //Circulo c = new Circulo(5.0);
             	
		for(int i=0;i<15;i++) {		
			lista.add(new Circulo(ram.nextInt(25)+1));
			lista.add(new Quadrado(ram.nextInt(25)+1));
			lista.add(new Triangulo(ram.nextInt(25)+1,ram.nextInt(25)+1));
			lista.add(new Cubo(ram.nextInt(25)+1));
			lista.add(new Esfera(ram.nextInt(25)+1));
			lista.add(new Tetraedro(ram.nextInt(25)+1,ram.nextInt(25)+1,ram.nextInt(25)+1));
		}
		
		for(int i=0;i<lista.size();i++) {
			
			if(lista.get(i) instanceof FormaBidimensional) {
				
				System.out.println("Forma: " + lista.get(i).descricao());				
				System.out.println("Dimensionalidade: Bidimensional\n"
								 + "Area da figura: " + lista.get(i).obterArea());				
				System.out.println("_________________________________________");
				
			}else if(lista.get(i) instanceof FormaTridimensional) {
				
				System.out.println("Forma: " + lista.get(i).descricao());				
				System.out.println("Dimensionalidade: Tridimensional\n"
						         + "Volume da figura: " + lista.get(i).obterVolume());
				System.out.println("_________________________________________");
			}
		}
		
	}

}
