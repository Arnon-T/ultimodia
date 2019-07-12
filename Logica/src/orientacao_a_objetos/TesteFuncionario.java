package orientacao_a_objetos;

public class TesteFuncionario {

	public static void main(String[] args) {
		/*
		 *	Nesta Classe são testados Objetos da Classe Funcionário; e
		 *	Métodos da Classe Funcionário.
		 */
		
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		
		funcionario1.setNome("Funcionário 1");
		//funcionario1.salario = 1000.0;
		funcionario2.setNome("Funcionário 2");
		//funcionario2.salario = 2000.0;
		
		System.out.printf("Nome do funcionário: %s. Salário do funcionário: %f. \n", funcionario1.getNome(), funcionario1.getSalario()); // Teste Classe Funcionário
		System.out.printf("Nome do funcionário: %s. Salário do funcionário: %f. \n", funcionario2.getNome(), funcionario2.getSalario()); // Teste Classe Funcionário
		
		// Teste de métodos aumento e consultar.
	
		System.out.println(funcionario1.calculaBonificacao());
		System.out.println(funcionario2.calculaBonificacao());
		
		funcionario1.aumento(111.0);
		System.out.println(funcionario1.mostraDados());
		funcionario2.aumento(222.0);
		System.out.println(funcionario2.mostraDados());		
		
		System.out.println(funcionario1.getValeRefeicao());
		funcionario2.ajusteValeRefeicao(0.25);
		System.out.println(funcionario2.getValeRefeicao());
			
	}

}
