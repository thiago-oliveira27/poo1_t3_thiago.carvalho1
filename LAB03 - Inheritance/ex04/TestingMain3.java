package ex04;

public class TestingMain3 {

	public static void main(String[]args) {
		
		//Criando objetos (SEM USO DO CONSTRUTOR)
		C1 c1 = new C1();		
		c1.setPub(1);
		c1.setProtec(2);
		c1.setPriv(3);
		System.out.println("_____________________________________________________________");
		C2 c2 = new C2();		
		c2.setPub(4);
		c2.setProtec(5);
		c2.setPriv(6);
		System.out.println("_____________________________________________________________");
		C3 c3 = new C3();		
		c3.setPub(7);
		c3.setProtec(8);
		c3.setPriv(9);
		
		
		System.out.println("_____________________________________________________________");
		System.out.println(c1.mostrar_atributos());
		
		System.out.println("___________________________");		
		System.out.println(c2.mostrar_atributos());
			
		System.out.println("___________________________");
		System.out.println(c3.mostrar_atributos());
		
		
		System.out.println("\n________________________________________________________________________________________________\n"
				         + "************************************************************************************************\n");
				
		
		//Criando objetos (COM USO DO CONSTRUTOR)
				C1 c11 = new C1(11,22,33);		
				
				System.out.println("_____________________________________________________________");
				C2 c22 = new C2(44,55,66);		
				
				System.out.println("_____________________________________________________________");
				C3 c33 = new C3(77,88,99);		
				
				System.out.println("_____________________________________________________________");
				System.out.println(c11.mostrar_atributos());
				
				System.out.println("___________________________");		
				System.out.println(c22.mostrar_atributos());
					
				System.out.println("___________________________");
				System.out.println(c33.mostrar_atributos_super());
		

	}
	
}
