package ex04;
import java.time.LocalDate;

public class Familia extends Contato {
  private String parentesco;

  public Familia (String name,String surname,
		  		  String email,LocalDate birthday,String parentesco){
	  
    super(name, surname,  email, birthday);
    this.parentesco = parentesco;
  }

  public void imprimirContato() {
    this.imprimirBasico();
    System.out.printf("Parentesco - %s\n\n", this.parentesco);
  }

  public boolean isIrmaos() {
    return (this.getParentesco().equals("irmão") || this.getParentesco().equals("irmã"));
  }

  public String getParentesco() {
    return this.parentesco;
  }
}