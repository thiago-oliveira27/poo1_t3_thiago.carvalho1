package ex04;
import java.time.LocalDate;

public class Trabalho extends Contato {
  private String tipo;

  public Trabalho (String name,String surname,
		  			String email,LocalDate birthday,String tipo) {
    super(name, surname,  email, birthday);
    this.tipo = tipo;
  }

  public void imprimirContato() {
    this.imprimirBasico();
    System.out.printf("Tipo - %s\n\n", this.tipo);
  }

  public boolean isColegaDeTrabalho() {
    return this.tipo == "colega";
  }

  public String getTipo() {
    return this.tipo;
  }
}