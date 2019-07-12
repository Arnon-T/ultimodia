package orientacao_a_objetos;

public class TesteConta {

	public static void main(String[] args) {
		/*
		  	Utilizei esta classe para:
		  	Testar os atributos da Classe Conta; e 
		  	Testar a conexão entre a Classe Conta e a Classe Agencia
		*/
		
		Agencia ag1 = new Agencia(101);
		Agencia ag2 = new Agencia(202);
		
		Conta cc1 = new Conta(ag1);
		Conta cc2 = new Conta(ag2);
		
		cc1.setAgencia(ag1); // Teste conexão Classe Conta e Classe Agencia
		cc2.setAgencia(ag2); // Teste conexão Classe Conta e Classe Agencia
		
		cc1.setNumeroCc(1001);
		//cc1.agencia.numeroag = 101;
		//cc1.limite = 200     Comentado para adequar limite ao valor fixado pelo exercício (100).
		cc1.setSaldo(10000.0);		
		cc2.setNumeroCc(2002);
		//cc2.agencia.numeroag = 202;
		//cc2.limite = 200     Comentado para adequar limite ao valor fixado pelo exercício (100).
		cc2.setSaldo(20000.0);
		
		System.out.printf("Conta número: %d. Agência: %d Limite: R$%f. Saldo: R$%f. \n", cc1.getNumeroCc(), cc1.getAgencia().getNumeroag(), cc1.getLimite(), cc1.getSaldo());
		System.out.printf("Conta número: %d. Agência: %d Limite: R$%f. Saldo: R$%f. \n", cc2.getNumeroCc(), cc2.getAgencia().getNumeroag(), cc2.getLimite(), cc2.getSaldo());
		
		// Teste de métodos.
		
		cc1.deposito(1000.0); 	// Método de depósito.
		cc1.saque(1.0); 		// Método de saque.
		cc1.imprimeExtrato(); 	// Método de impressão Extrato (Saldo).
		cc1.getSaldoTotal(); 		// Método de Saldo Disponível (Saldo + Limite).
		
		cc2.deposito(1000.0); 	// Método de depósito.
		cc2.saque(1.0); 		// Método de saque.
		cc2.imprimeExtrato(); 	// Método de impressão Extrato (Saldo).
		cc2.getSaldoTotal(); 		// Método de Saldo Disponível (Saldo + Limite).
		
		// Demonstra funções realizadas pelos métodos.
		
		System.out.printf("Conta número: %d. Agência: %d Limite: R$%f. Saldo: R$%f. \n", cc1.getNumeroCc(), cc1.getAgencia().getNumeroag(), cc1.getLimite(), cc1.getSaldo());
		System.out.printf("Conta número: %d. Agência: %d Limite: R$%f. Saldo: R$%f. \n", cc2.getNumeroCc(), cc2.getAgencia().getNumeroag(), cc2.getLimite(), cc2.getSaldo());
		
		// Testa o método transfere
		
		cc1.transfere(cc1, cc2, 1000.00);
		
		System.out.printf("Conta número: %d. Agência: %d Limite: R$%f. Saldo: R$%f. \n", cc1.getNumeroCc(), cc1.getAgencia().getNumeroag(), cc1.getLimite(), cc1.getSaldo());
		System.out.printf("Conta número: %d. Agência: %d Limite: R$%f. Saldo: R$%f. \n", cc2.getNumeroCc(), cc2.getAgencia().getNumeroag(), cc2.getLimite(), cc2.getSaldo());
		
	}

}
