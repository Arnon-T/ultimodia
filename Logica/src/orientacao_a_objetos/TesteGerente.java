package orientacao_a_objetos;

public class TesteGerente {

	public static void main(String[] args) {
		/*
		 * Nesta Classe são testados os Objetos da Classe Gerente; e
		 * Os Métodos da Classe Gerente.
		 */
		
		Gerente gerente1 = new Gerente();
		Gerente gerente2 = new Gerente();

		gerente1.setNome("Gerente 1");
		gerente1.setSalario(10000.00);
		gerente2.setNome("Gerente 2");
		gerente2.setSalario(20000.00);
		
		System.out.printf("Nome do Gerente: %s. Salário: R$%f. \n", gerente1.getNome(), gerente1.getSalario());
		System.out.printf("Nome do Gerente: %s. Salário: R$%f. \n", gerente2.getNome(), gerente2.getSalario());
		
		// Teste método aumento fixo (porcentagem fixa).
		
		gerente1.aumento();
		gerente2.aumento();
				
		System.out.printf("Nome do Gerente: %s. Salário: R$%f. \n", gerente1.getNome(), gerente1.getSalario());
		System.out.printf("Nome do Gerente: %s. Salário: R$%f. \n", gerente2.getNome(), gerente2.getSalario());

		// Teste método aumento variável (Aumento em reais).
		
		gerente1.aumento(111.11);
		gerente2.aumento(222.22);
				
		System.out.printf("Nome do Gerente: %s. Salário: R$%f. \n", gerente1.getNome(), gerente1.getSalario());
		System.out.printf("Nome do Gerente: %s. Salário: R$%f. \n", gerente2.getNome(), gerente2.getSalario());
		
		
	}

}
