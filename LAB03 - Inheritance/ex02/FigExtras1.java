package ex02;


import java.time.LocalDate;


public class FigExtras1 extends Figurinha1{
    
    private  String categoria;
    private  String cor;
    

    public FigExtras1(String nome, LocalDate nascimento, 
                    float altura, float peso, String posicao, 
                    String pais, String categoria, String cor){
    	
        super(nome,nascimento,altura,peso,posicao,pais);
        
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

        return "Figurinha Extra \nNome=" + super.nome + ", nascimento=" + super.nascimento + ", altura=" + super.altura + ", peso=" + super.peso
        + ", posicao=" + super.posicao + ", pais=" + super.pais 
        + ", categoria=" + categoria + ", cor= " + cor+ "\n";

    }


    

    
}