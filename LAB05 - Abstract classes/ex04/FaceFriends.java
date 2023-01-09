package ex04;
import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;

public class FaceFriends {
  private static ArrayList<Contato> contacts = new ArrayList<Contato>();

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean toBeContinue = true;

    while (toBeContinue) {
      renderMenu();

      int menuItemSelected = scanner.nextInt();
      processMenuOptions(menuItemSelected);

      System.out.println("\nDeseja sair? S/N");
      toBeContinue = scanner.next().charAt(0) != 'S';
    }
  }

  private static void renderMenu() {
    System.out.println("===== MENU =====");
    System.out.println("1. Inserir contato");
    System.out.println("2. Imprimir todos os contatos");
    System.out.println("3. Imprimir todos os familiares");
    System.out.println("4. Imprimir todos os amigos");
    System.out.println("5. Imprimir todos os colegas de trabalho");
    System.out.println("6. Imprimir os melhores amigos, irmãos e colegas de trabalho");
    System.out.println("7. Imprimir determinado contato");
  }

  private static void processMenuOptions(int indexItem) {
    Scanner scanner = new Scanner(System.in);

    switch (indexItem) {
      case 1:
    	  opcaoContato();
        saveContactByType(scanner.nextInt());
      break;
      case 2:
        imprimirContatos();
      break;
      case 3:
        printFamiliares();
      break;
      case 4:
        printAmigos();
      break;
      case 5:
        printColegasDeTrabalho();
      break;
      case 6:
        imprimirMelhores();
      break;
      case 7:
        System.out.println("Digite o index do contato: ");
        printContactByIndex(scanner.nextInt());
      break;
      default:
        System.out.println("Opção não encontrada");
    }
  }

  private static void opcaoContato() {
    System.out.println("\nDigite o contato que você quer adicionar: ");
    System.out.println("1. Inserir contato de Amigos");
    System.out.println("2. Inserir contato de Familia");
    System.out.println("3. Inserir contato de Trabalho");
  }

  private static void saveContactByType(int type) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("\nNovo contato\n");
    System.out.println("Nome do contato: ");
    String nome = scanner.nextLine();
    System.out.println("Apelido: ");
    String apelido = scanner.nextLine();
    System.out.println("Email: ");
    String email = scanner.nextLine();
    System.out.println("Aniversário: ");
    LocalDate aniversario = LocalDate.of(
      scanner.nextInt(), 
      scanner.nextInt(), 
      scanner.nextInt()
    );

    switch (type) {
      case 1:
        System.out.println("Grau de amizade: (1, 2, 3, 4)");
        addContatos(new Amigos(nome,apelido,email,
        		  	aniversario,scanner.nextInt()));
      break;
      case 2:
        System.out.println("Qual Ã© o parentesco do contato (pai, mãe, irmão, irmã...): ");
        scanner.nextLine();
        addContatos(new Familia(nome,apelido,email,
        			aniversario,scanner.nextLine()));
      break;
      case 3:
        System.out.println("Qual é o tipo do contato (chefe, colega, estagiário, gerente...): ");
        scanner.nextLine();
        addContatos(
          new Trabalho(nome,apelido,email,
            aniversario,scanner.nextLine()));
      break;
      default:
        System.out.println("Opção não encontrada");
    }
  }

  private static void imprimirContatos() {
    int i = 0;
    while(i < getContatos().size()) {
      getContatos().get(i).imprimirBasico();
      System.out.println();
      i++;
    }
  }

  private static void printContactByIndex(int index) {
    getContatos().get(index).imprimirBasico();
  }

  private static void printFamiliares() {
    int i = 0;
    while(i < getContatos().size()) {
      Contato contact = getContatos().get(i);
      if (contact instanceof Familia) {
        contact.imprimirContato();
      }
      i++;
    }
  }

  private static void printAmigos() {
    int i = 0;
    while(i < getContatos().size()) {
      Contato contact = getContatos().get(i);
      if (contact instanceof Amigos) {
        contact.imprimirContato();
      }
      i++;
    }
  }

  private static void printColegasDeTrabalho() {
    int i = 0;
    while(i < getContatos().size()) {
      Contato contact = getContatos().get(i);
      if (contact instanceof Trabalho && ((Trabalho)contact).isColegaDeTrabalho()) {
        contact.imprimirContato();
      }
      i++;
    }
  }

  private static void imprimirMelhores() {
    int i = 0;
    while(i < getContatos().size()) {
      Contato contact = getContatos().get(i);
      if (contact instanceof Familia && ((Familia)contact).isIrmaos()) {
        contact.imprimirContato();
      }
      if (contact instanceof Amigos && ((Amigos)contact).getGrau() == 1) {
        contact.imprimirContato();
      }
      if (contact instanceof Trabalho && ((Trabalho)contact).isColegaDeTrabalho()) {
        contact.imprimirContato();
      }
      i++;
    }
  }

  private static ArrayList<Contato> getContatos() {
    return contacts;
  }

  private static void addContatos(Contato contact) {
    contacts.add(contact);
  }
}