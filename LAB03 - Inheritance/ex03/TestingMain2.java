package ex03;

import java.time.LocalDate;

/*
# Ex03
- Modifique a classe Figurinha, transformando os atributos *protected* para *private*>*
- Entenda o erro que ocorre em MostrarFigurinha() da classe FigurinhaExtra com essa modifica��o
- Modifique o m�todo MostrarFigurinha() para ser poss�vel vizualizar os atributos privados de Figurinha.
 Para isso use *super.MostrarFigurinha()*
- Crie um novo construtor, que ter� como par�metro uma Figurinha (normal) e os dois atributo adicionais de FigurinhaExtra.
 Esse construtor permitir� criar um novo objeto de FigurinhaExtra a partir de um objeto j� existente de Figurinha 
 (ou seja, uma figurinha extra de um jogador que j� foi criado)

Fa�a um programa principal que cria uma Figurinha e uma FigurinhaExtra, e mostre os dados das figurinhas criadas
*/

public class TestingMain2 {
    public static void main(String[]args){
    	
    	Figurinha2 figNormal = new Figurinha2("Roberto",LocalDate.parse("2000-09-03"),1.73f,70.0f,"coleiro","Uruguai");
    	FigExtras2 figExtra = new FigExtras2(figNormal, "Legend", "Bronze");
    	
    	System.out.println(figNormal.mostrarFigurinha());
    	System.out.println(figExtra.mostrarFigurinha());
    
    	
    	
        
    }
   
}
