package ex05;

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

public class EmpresaMain {
    public static void main(String[] args) {

        ArrayList<Horista> horista = new ArrayList<>();
        ArrayList<Operario> operario = new ArrayList<>();
        ArrayList<Vendedor> vendedor = new ArrayList<>();
        ArrayList<Chefe> chefe = new ArrayList<>();

        //adicionando um obj de cada tipo em seu respectivo array, sem guardar referencia (nome do obj), 
        //sendo acessado somente pela posicao do arraylist
        horista.add(new Horista());
        operario.add(new Operario());
        vendedor.add(new Vendedor());
        chefe.add(new Chefe());
               
        // setta o nome de todos para suas respectivas fun��es, todos gen�ricos apenas para exemplo de uso
        //settando valores aletorios de salarios, sem o uso de entrada de dados do usuario
        
            horista.get(0).setNome("Horista");
            horista.get(0).setDataNascimento("01/02/2002");
            horista.get(0).setSalario(500.0);
            horista.get(0).setHoras(5.0);

            operario.get(0).setNome("Operario");
            operario.get(0).setDataNascimento("04/09/1987");
            operario.get(0).setSalario(200.0);
            operario.get(0).setQtdProd(20);
            
            vendedor.get(0).setNome("Vendedor");
            vendedor.get(0).setDataNascimento("27/03/2003");
            vendedor.get(0).setSalario(600);
            vendedor.get(0).setVendas(60);
            vendedor.get(0).setComissao(50);
            
            chefe.get(0).setNome("Chefe");
            chefe.get(0).setDataNascimento("23/02/1999");
            chefe.get(0).setSalario(1200.0);
            
            //Printando salarios

            double salarioHorista = horista.get(0).salarioPadrao(horista.get(0).getSalario());
            System.out.println("Salario horista: " + salarioHorista);
            
            double salarioOperario = operario.get(0).salarioPadrao(operario.get(0).getSalario());
            System.out.println("Salario operario: " + salarioOperario);
            
            double salarioVendedor = vendedor.get(0).salarioPadrao(vendedor.get(0).getSalario());
            System.out.println("Salario vendedor: " + salarioVendedor);
            
            double salarioChefe = chefe.get(0).salarioPadrao(chefe.get(0).getSalario());
            System.out.println("Salario chefe: " + salarioChefe);
            
    }
}