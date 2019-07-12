package orientacao_a_objetos;

public class TesteClienteECartao {

	public static void main(String[] args) {
		/*
		 	Utilizei esta Classe para:
		 	Testar os atributos da Classe CartaoDeCredito; e
		 	Testar a conexão entre a Classe CartaoDeCredito e a Classe Cliente.
		 */
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		cliente1.setCodigocliente(11);
		cliente2.setCodigocliente(22);
		
		CartaoDeCredito cartao1 = new CartaoDeCredito(111111); //Teste Classe CartaoDeCredito
		CartaoDeCredito cartao2 = new CartaoDeCredito(222222); //Teste Classe CartaoDeCredito
		
		cartao1.setCliente(cliente1); // Teste conexão Classe CartaoDeCredito e Classe Cliente.
		cartao2.setCliente(cliente2); // Teste conexão Classe CartaoDeCredito e Classe Cliente.
		
		//cartao1.numero = 11111111;
		//cartao2.numero = 22222222;
		cartao1.setAnoValidade(2021);
		cartao2.setAnoValidade(2022);
				
		System.out.printf("Cartão %d, validade %d, código cliente %d." + "\n", cartao1.getNumero(), cartao1.getAnoValidade(), cartao1.getCliente().getCodigocliente()); //Teste output conexão entre Classe Cliente e Classe Cartao de Crédito
		System.out.printf("Cartão %d, validade %d, código cliente %d." + "\n", cartao2.getNumero(), cartao2.getAnoValidade(), cartao2.getCliente().getCodigocliente()); //Teste output conexão entre Classe Cliente e Classe Cartao de Crédito
				
	}

}