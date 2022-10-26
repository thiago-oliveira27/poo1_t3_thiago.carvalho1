
import java.time.LocalDate;

/*
# Ex04
Crie uma nova classe chamada Selecao, que � 
composta pelo nome da Selecao, por 11 jogador2es 
titulares, o nome do t�cnico, e outras informa��es 
que julgar pertinente. Instancie 2 sele��es.
*/

public class Main4 {
    public static void main(String[]args){
    	
    	Figurinha3[] jogador1 = new Figurinha3[11];
    	jogador1[0] = new Figurinha3("Felipe",LocalDate.parse("2003-04-12"),1.73f,70.0f,"centro-avante","Brazil");
    	jogador1[1] = new Figurinha3("Frank",LocalDate.parse("2002-03-15"),1.85f,65f,"zagueiro","Alemanha");
    	jogador1[2] = new Figurinha3("Gabriel",LocalDate.parse("1980-10-09"),1.90f,90f,"Goleiro","Alemanha");
    	jogador1[3] = new Figurinha3("Pedro",LocalDate.parse("2003-04-12"),1.73f,70.0f,"centro-avante","Brazil");
    	jogador1[4] = new Figurinha3("Davi",LocalDate.parse("2002-03-15"),1.85f,65f,"zagueiro","Alemanha");
    	jogador1[5] = new Figurinha3("Arthur",LocalDate.parse("1980-10-09"),1.90f,90f,"Goleiro","Alemanha");
    	jogador1[6] = new Figurinha3("Miguel",LocalDate.parse("2003-04-12"),1.73f,70.0f,"centro-avante","Brazil");
    	jogador1[7] = new Figurinha3("Augusto",LocalDate.parse("2002-03-15"),1.85f,65f,"zagueiro","Alemanha");
    	jogador1[9] = new Figurinha3("Matheus",LocalDate.parse("1980-10-09"),1.90f,90f,"Goleiro","Alemanha");
    	jogador1[10] = new Figurinha3("Leandro",LocalDate.parse("2003-04-12"),1.73f,70.0f,"centro-avante","Brazil");
    	jogador1[11] = new Figurinha3("Alex",LocalDate.parse("2002-03-15"),1.85f,65f,"zagueiro","Alemanha");
        Selecao Selecao1 = new Selecao("Brasil",jogador1,"Jos�");
    	
    	
        Figurinha3[] jogador2 = new Figurinha3[11];
        jogador2[0] = new Figurinha3("Joao",LocalDate.parse("2003-04-12"),1.73f,70.0f,"centro-avante","Brazil");
        jogador2[1] = new Figurinha3("Thiago",LocalDate.parse("2002-03-15"),1.85f,65f,"zagueiro","Alemanha");
        jogador2[2] = new Figurinha3("Paulo",LocalDate.parse("1980-10-09"),1.90f,90f,"Goleiro","Alemanha");
        jogador2[3] = new Figurinha3("Fernando",LocalDate.parse("2003-04-12"),1.73f,70.0f,"centro-avante","Brazil");
        jogador2[4] = new Figurinha3("Gabriel",LocalDate.parse("2002-03-15"),1.85f,65f,"zagueiro","Alemanha");
        jogador2[5] = new Figurinha3("Arthur",LocalDate.parse("1980-10-09"),1.90f,90f,"Goleiro","Alemanha");
        jogador2[6] = new Figurinha3("Miguel",LocalDate.parse("2003-04-12"),1.73f,70.0f,"centro-avante","Brazil");
        jogador2[7] = new Figurinha3("Augusto",LocalDate.parse("2002-03-15"),1.85f,65f,"zagueiro","Alemanha");
        jogador2[9] = new Figurinha3("Matheus",LocalDate.parse("1980-10-09"),1.90f,90f,"Goleiro","Alemanha");
        jogador2[10] = new Figurinha3("Vinicius",LocalDate.parse("2003-04-12"),1.73f,70.0f,"centro-avante","Brazil");
        jogador2[11] = new Figurinha3("Saulo",LocalDate.parse("2002-03-15"),1.85f,65f,"zagueiro","Alemanha");
        Selecao Selecao2 = new Selecao("Fran�a",jogador2,"Ant�nio");
        
    }
   
}
