package poo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.lang.Math.*;

public class ex11 {
	
	/*
		Uma piscina de bolinhas possui bolas azuis, verdes, amarelas e vermelhas. 
		Faça um programa em que o usuário digita a quantidade de 
		bolinhas de cada cor existente em uma piscina e mostra a
		probabilidade de ocorrência de cada cor, indicando qual possui 
		a maior probabilidade
	 
	 */
		
	public static void main(String[] args) {
		
		ArrayList<Integer> bolinhas = new ArrayList<Integer>();
		ArrayList<Double> chances = new ArrayList<Double>();
				
		double total = 0;
		int maior_chance_id=-1;
		String msg = "<< Maior probabilidade";
		
        Scanner sc = new Scanner(System.in);
        
        System.out.println("<< Probabilidades >>\n");
        System.out.println("Digite a quantidade de bolinhas");
                
        System.out.print("Verde: ");
        bolinhas.add(sc.nextInt());
        System.out.print("Azul: ");
        bolinhas.add(sc.nextInt());
		System.out.print("Amarela: ");
		bolinhas.add(sc.nextInt());
		System.out.print("Vermelha: ");
		bolinhas.add(sc.nextInt());
		sc.nextLine();
        		
		for(int i=0;i<bolinhas.size();i++) {
			total += bolinhas.get(i);
		}
		
		for(int i=0;i<bolinhas.size();i++) {
			chances.add((bolinhas.get(i)/total) * 100);
			if(i==0 || chances.get(i) > chances.get(i-1)) {
				maior_chance_id = i;
			}
		}
		
		System.out.println("\nProbabilidades");
		System.out.printf("Verde: %.1f%% %s \n", chances.get(0),(maior_chance_id == 0 ? msg : ""));
		System.out.printf("Azul: %.1f%% %s \n", chances.get(1),(maior_chance_id == 1 ? msg : ""));
		System.out.printf("Amarela: %.1f%% %s \n", chances.get(2),(maior_chance_id == 2 ? msg : ""));
		System.out.printf("Vermelha: %.1f%% %s \n", chances.get(3),(maior_chance_id == 3 ? msg : ""));
			
	}

}
