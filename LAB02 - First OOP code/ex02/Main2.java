import java.time.LocalDate;

/*
# Ex02
Crie um novo projeto, semelhante ao exerc�cio anterior. 
Torne todas os atributos do exerc�cio 1 privados. 
Crie m�todos para alterar os valores dos atributos e para mostrar os
 valores dos atributos na tela. Instancie os mesmos tr�s jogadores.
*/


public class Main2 {
    public static void main(String[] args){
    	
        Figurinha2 figurinha1 = new Figurinha2();
        figurinha1.setNome("Thiago");
        figurinha1.setNascimento(LocalDate.parse("2003-10-23")); 
        figurinha1.setAltura(1.73f);
        figurinha1.setPeso(65);
        figurinha1.setPosicao("Goleiro");
        figurinha1.setPais("Brasil");

        Figurinha2 figurinha2 = new Figurinha2();
        figurinha2.setNome("Vinicio");
        figurinha2.setNascimento(LocalDate.parse("2003-10-30"));
        figurinha2.setAltura(1.90f);
        figurinha2.setPeso(100);
        figurinha2.setPosicao("Volante");
        figurinha2.setPais("Brasil");

        Figurinha2 figurinha3 = new Figurinha2();
        figurinha3.setNome("Lucas");
        figurinha3.setNascimento(LocalDate.parse("2000-07-13"));
        figurinha3.setAltura(1.60f);
        figurinha3.setPeso(50);
        figurinha3.setPosicao("Atacante");
        figurinha3.setPais("Alemanha");
        
        System.out.println(figurinha1);
        System.out.println(figurinha2);
        System.out.println(figurinha3);
    }

}
