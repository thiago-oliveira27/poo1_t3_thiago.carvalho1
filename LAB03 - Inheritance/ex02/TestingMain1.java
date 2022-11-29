package ex02;

import java.time.LocalDate;

/*
# Ex02
O conceito de herança (inheritance) em POO é muito utilizado para reaproveitamento de código.

- Modifique a classe Figurinha, transformando os atributos *private* para *protected*
- Modifique a classe FigurinhaExtra, eliminando todos os atributos e métodos reduntantes de Figurinha. 
Obtenha os valores desses atributos por herança utilizando a palavra chave *extends*, isto é: "public class FigurinhaExtra extends Figurinha {".
- Note que a herança irá trazer os atributos e os métodos para a classe FigurinhaExtra.
- Note que o método MostrarFigurinha() deve continuar em FigurinhaExtra, pois ele é diferente do método FigurinhaExtra() da classe Figurinha
- O construtor deve ser modificado, de forma a inicializar somente os atributos de FigurinhaExtra. Os atributos que são originais 
de classe Figurinha (chamada de superclasse ou classe mãe/pai) deverão ser inicializados por meio da chamada do construtor original de Figurinha. 
Isso é feito usando a palavra reservada *super*

Faça um programa principal que cria uma Figurinha e uma FigurinhaExtra, e mostre os dados das figurinhas criadas
*/

public class TestingMain1 {
    public static void main(String[]args){
    	
    	Figurinha1 figNormal = new Figurinha1("Felipe",LocalDate.parse("2003-04-12"),1.73f,70.0f,"centro-avante","Brazil");
    	FigExtras1 figExtra = new FigExtras1("Thiago",LocalDate.parse("2003-04-12"),1.73f,70.0f,"centro-avante","Brazil","Legend", "BordÃ´");
    	
    	System.out.println(figNormal.mostrarFigurinha());
    	System.out.println(figExtra.mostrarFigurinha());
    
    	
    	
        
    }
   
}
