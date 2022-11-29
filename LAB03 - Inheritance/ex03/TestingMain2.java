package ex03;

import java.time.LocalDate;

/*
# Ex03
- Modifique a classe Figurinha, transformando os atributos *protected* para *private*>*
- Entenda o erro que ocorre em MostrarFigurinha() da classe FigurinhaExtra com essa modificação
- Modifique o método MostrarFigurinha() para ser possível vizualizar os atributos privados de Figurinha.
 Para isso use *super.MostrarFigurinha()*
- Crie um novo construtor, que terá como parâmetro uma Figurinha (normal) e os dois atributo adicionais de FigurinhaExtra.
 Esse construtor permitirá criar um novo objeto de FigurinhaExtra a partir de um objeto já existente de Figurinha 
 (ou seja, uma figurinha extra de um jogador que já foi criado)

Faça um programa principal que cria uma Figurinha e uma FigurinhaExtra, e mostre os dados das figurinhas criadas
*/

public class TestingMain2 {
    public static void main(String[]args){
    	
    	Figurinha2 figNormal = new Figurinha2("Roberto",LocalDate.parse("2000-09-03"),1.73f,70.0f,"coleiro","Uruguai");
    	FigExtras2 figExtra = new FigExtras2(figNormal, "Legend", "Bronze");
    	
    	System.out.println(figNormal.mostrarFigurinha());
    	System.out.println(figExtra.mostrarFigurinha());
    
    	
    	
        
    }
   
}
