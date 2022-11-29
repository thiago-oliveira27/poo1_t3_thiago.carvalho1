package ex03;

public class FigExtras2 extends Figurinha2{
    
    private  String categoria;
    private  String cor;
    

    public FigExtras2(Figurinha2 fig, String categoria, String cor){
    	
        super(fig.getNome(),fig.getNascimento(),
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
    			"categoria=" + categoria + " cor= " + cor+ "\n";

    }


    

    
}