package ex06;

public class Main {

	public static void main(String[] args) {
		
		Normal normal = new Normal();
		Vip vip = new Vip();
		
		CamaroteInferior camInf = new CamaroteInferior();
		CamaroteSuperior camSup = new CamaroteSuperior();
		
		//atribuindo um valor ao ingresso normal
		normal.setValor(20.0);
		System.out.println("Valor do ingresso normal: " + normal.escreveValor()+"\n");
		
		//atribuindo um valor ao ingresso VIP e também sua taxa
		vip.setValor(20.0);
		vip.setTaxaVip(5.50);
		System.out.println("Valor do ingresso VIP (taxa VIP inclusa): " + vip.valorVip()+"\n");
		
		//atribuindo localização e valor ao camarote inferior
		camInf.setLocalizacao("Norte");
		camInf.setValor(30);
		System.out.println("Camarote Inferior: " + camInf.getValor() + " - Localização: " + camInf.getLocalizacao()+"\n");
		
		//atribuindo taxa e valor ao camarote superior
		camSup.setTaxaSuperior(10.0);
		camSup.setValor(30);
		System.out.println("Camarote Superior: " + camSup.getValorCamaroteSuperior() + "\n");
		
		
	}

}
