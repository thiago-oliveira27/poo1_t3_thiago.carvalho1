package ex04;
import java.time.LocalDate;

public class Amigos extends Contato {
	
  private int grau;

  public Amigos (String nome,String apelido,
    String email,LocalDate aniversario,int grau) {
	  
    super(nome, apelido,  email, aniversario);
    this.grau = grau;
  }

  public void imprimirContato() {
    this.imprimirBasico();
    System.out.printf("Grau: %s\n\n", this.grau);
  }

  public int getGrau() {
    return this.grau;
  }
}