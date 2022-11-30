import java.util.ArrayList;

/* Ex05
Uma empresa tem quatro tipos de funcionários: chefes, vendedores, operários e horistas.
 Cada um desses funcionários ganha seus salários conforme regras distintas, apresentadas a seguir: 

Chefe: salário fixo e predefinido;
Vendedor: valor fixo + comissão X vendas;
Operario: valor por produção X quantidade produzida;
Horista: valor por hora X total de horas trabalhadas.


Crie as classes correspondentes, adicionando atributos e métodos que achar necessários. 
A classe *Funcionario* deve incluir os campos privados *nome*, *dataNascimento* e *salario*. 
Além disso, crie uma classe *Empresa*, que conterá o método *main()*. A empresa tem vários funcionários, 
logo crie um vetor (array) para cada tipo de funcionário*. 
*/

public class Empresa {
    public static void main(String[] args) {

        ArrayList<Horista> horista = new ArrayList<>();
        ArrayList<Operario> operario = new ArrayList<>();
        ArrayList<Vendedor> vendedor = new ArrayList<>();
        ArrayList<Chefe> chefe = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            horista.add(new Horista());
            operario.add(new Operario());
            vendedor.add(new Vendedor());
            chefe.add(new Chefe());
        }
        System.out.println("Compilou");

        // setta o nome de todos para suas respectivas funções

        for (int i = 0; i < 5; i++) {
            horista.get(i).setNome("Horista");
            horista.get(i).setDataNascimento("01/02/2002");
            horista.get(i).setSalario(500.0);

            operario.get(i).setNome("Operario");
            operario.get(i).setDataNascimento("04/09/1987");
            operario.get(i).setSalario(400.0);

            vendedor.get(i).setNome("Vendedor");
            vendedor.get(i).setDataNascimento("27/03/2003");
            vendedor.get(i).setSalario(600);

            chefe.get(i).setNome("Chefe");
            chefe.get(i).setDataNascimento("23/02/1999");
            chefe.get(i).setSalario(1200.0);

        }

    }
}