/*

O conceito de herança (inheritance) em POO é muito utilizado para reaproveitamento de código.

- Modifique a classe Figurinha, transformando os atributos *private * para *protected*
- Modifique a classe FigurinhaExtra, eliminando todos os atributos e métodos reduntantes de Figurinha. Obtenha os valores desses atributos por herança utilizando a palavra chave *extends*, isto é: "public class FigurinhaExtra extends Figurinha {".
- Note que a herança irá trazer os atributos e os métodos para a classe FigurinhaExtra.
- Note que o método MostrarFigurinha() deve continuar em FigurinhaExtra, pois ele é diferente do método FigurinhaExtra() da classe Figurinha
- O construtor deve ser modificado, de forma a inicializar somente os atributos de FigurinhaExtra. Os atributos que são originais de classe Figurinha (chamada de superclasse ou classe mãe/pai) deverão ser inicializados por meio da chamada do construtor original de Figurinha. Isso é feito usando a palavra reservada *super*

Faça um programa principal que cria uma Figurinha e uma FigurinhaExtra, e mostre os dados das figurinhas criadas
*/


import java.time.LocalDate;


public class FigExtras extends Figurinha3{
    
    private  String categoria;
    private  String cor;
    

    public FigExtras(Figurinha3 fig, String categoria, String cor){

        super(fig.getNome()fig.getNascimento(), 
              fig.getAltura(),fig.getPeso(),
              fig.getPosicao(),fig.getPais());

        this.categoria = categoria;
        this.cor = cor;
    }


    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getCategoria() {
        return categoria;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }
    
    public String mostrarFigurinha(){

        return super.mostrarFigurinha() +
        "\ncategoria= " +categoria +", cor= "+ cor;

    }


    

    
}