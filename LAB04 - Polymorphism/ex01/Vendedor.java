package ex01;

public class Vendedor extends Funcionario {

    /*
     * Vendedor: valor fixo + comissão X vendas;
     */

	private double comissao;
    public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public int getVendas() {
		return vendas;
	}

	public void setVendas(int vendas) {
		this.vendas = vendas;
	}

	private int vendas;
    
	public Vendedor() {
		
	}
	
    public Vendedor(String nome, String dataNascimento, double salario) {
		super(nome, dataNascimento, salario);
	}
    
    public Vendedor(String nome, String dataNascimento, double salario, 
    				double comissao, int vendas) {
    	
		super(nome, dataNascimento, salario);
		this.comissao = comissao;
		this.vendas = vendas;
	}
    
    @Override
    public double salarioPadrao(double salario) {
    	
    	return (salario + (this.vendas*comissao));
    }
	
}