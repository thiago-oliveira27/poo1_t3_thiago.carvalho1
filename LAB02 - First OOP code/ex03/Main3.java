import java.time.LocalDate;

/*
# Ex03
Crie no programa principal um vetor de figurinhas e 
instancie os jogadores de sua prefer�ncia. Mostre as 
informa��es de todos os jogadores. Utilize la�os para 
manipula��o do vetor.
*/

public class Main3 {
    public static void main(String[] args){      
        Figurinha3[] figurinha= new Figurinha3[3];
        figurinha[0] = new Figurinha3("Lucas",LocalDate.parse("2000-04-12"),1.73f,70.0f,"Atacante","Estados Unidos");
        figurinha[1] = new Figurinha3("Vini",LocalDate.parse("2003-03-15"),1.85f,65f,"Volante","Russia");
        figurinha[2] = new Figurinha3("Ronaldo",LocalDate.parse("1977-10-09"),1.90f,90f,"Goleiro","Espanha");
        
        for(int i = 0;i<figurinha.length;i++){
            System.out.println(figurinha[i]);
        }
    }

}
