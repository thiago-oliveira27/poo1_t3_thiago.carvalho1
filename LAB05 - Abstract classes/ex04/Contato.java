package ex04;
import java.time.LocalDate;

public abstract class Contato {
  private String nome;
  private String apelido;
  private String email;
  private LocalDate aniversario;

  public Contato(String nome,String apelido,
    String email,LocalDate aniversario){
	  
    this.nome = nome;
    this.apelido = apelido;
    this.email = email;
    this.aniversario = aniversario;
  }

  public void imprimirBasico() {
    System.out.printf("nome - %s\n", this.nome);
    System.out.printf("apelido - %s\n", this.apelido);
    System.out.printf("Email - %s\n", this.email);
    System.out.printf("Aniversário - %s\n", this.aniversario);
  }

  public abstract void imprimirContato();

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getApelido() {
		return apelido;
	}
	
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public LocalDate getAniversario() {
		return aniversario;
	}
	
	public void setAniversario(LocalDate aniversario) {
		this.aniversario = aniversario;
	}

 
}
