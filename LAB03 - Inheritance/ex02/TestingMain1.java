package ex02;

import java.time.LocalDate;

/*
# Ex02
O conceito de heran�a (inheritance) em POO � muito utilizado para reaproveitamento de c�digo.

- Modifique a classe Figurinha, transformando os atributos *private* para *protected*
- Modifique a classe FigurinhaExtra, eliminando todos os atributos e m�todos reduntantes de Figurinha. 
Obtenha os valores desses atributos por heran�a utilizando a palavra chave *extends*, isto �: "public class FigurinhaExtra extends Figurinha {".
- Note que a heran�a ir� trazer os atributos e os m�todos para a classe FigurinhaExtra.
- Note que o m�todo MostrarFigurinha() deve continuar em FigurinhaExtra, pois ele � diferente do m�todo FigurinhaExtra() da classe Figurinha
- O construtor deve ser modificado, de forma a inicializar somente os atributos de FigurinhaExtra. Os atributos que s�o originais 
de classe Figurinha (chamada de superclasse ou classe m�e/pai) dever�o ser inicializados por meio da chamada do construtor original de Figurinha. 
Isso � feito usando a palavra reservada *super*

Fa�a um programa principal que cria uma Figurinha e uma FigurinhaExtra, e mostre os dados das figurinhas criadas
*/

public class TestingMain1 {
    public static void main(String[]args){
    	
    	Figurinha1 figNormal = new Figurinha1("Felipe",LocalDate.parse("2003-04-12"),1.73f,70.0f,"centro-avante","Brazil");
    	FigExtras1 figExtra = new FigExtras1("Thiago",LocalDate.parse("2003-04-12"),1.73f,70.0f,"centro-avante","Brazil","Legend", "Bordô");
    	
    	System.out.println(figNormal.mostrarFigurinha());
    	System.out.println(figExtra.mostrarFigurinha());
    
    	
    	
        
    }
   
}
