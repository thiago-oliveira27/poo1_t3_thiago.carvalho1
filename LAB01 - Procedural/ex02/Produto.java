public class Produto {
	
	private String nome;
	private float preco;
	private int qtd_estoque;
	
	public Produto() {
		super();
		nome = null;
		preco = 0;
		qtd_estoque = 0;		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQtd_estoque() {
		return qtd_estoque;
	}

	public void setQtd_estoque(int qtd_estoque) {
		this.qtd_estoque = qtd_estoque;
	}	
	
	public int altera_preco(float preco, float porcentagem){
		
		float temp;
		
        if (porcentagem > -100) {
            temp = 1 + porcentagem/100;  
            preco *= temp;  
            setPreco(preco);
            return 0;
        } else {
            return -1;
        }

    }

	
	
}
