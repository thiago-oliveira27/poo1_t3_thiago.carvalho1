package ex01;

public class Funcionario {

    // A classe *Funcionario* deve incluir os campos privados *nome*,
    // *dataNascimento* e *salario*.

    private String nome;
    private String dataNascimento;
    private double salario;
 
    public Funcionario() {
    	
    }

    public Funcionario(String nome, String dataNascimento, double salario) {

        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;


    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the dataNascimento
     */
    public String getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return double return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double salarioPadrao(double salario) {
        return this.salario = salario;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nDt. Nascimento: " + dataNascimento;

    }


}