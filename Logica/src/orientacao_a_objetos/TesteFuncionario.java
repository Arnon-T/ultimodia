package orientacao_a_objetos;

public class TesteFuncionario {

	public static void main(String[] args) {
		/*
		 *	Nesta Classe s�o testados Objetos da Classe Funcion�rio; e
		 *	M�todos da Classe Funcion�rio.
		 */
		
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		
		funcionario1.setNome("Funcion�rio 1");
		//funcionario1.salario = 1000.0;
		funcionario2.setNome("Funcion�rio 2");
		//funcionario2.salario = 2000.0;
		
		System.out.printf("Nome do funcion�rio: %s. Sal�rio do funcion�rio: %f. \n", funcionario1.getNome(), funcionario1.getSalario()); // Teste Classe Funcion�rio
		System.out.printf("Nome do funcion�rio: %s. Sal�rio do funcion�rio: %f. \n", funcionario2.getNome(), funcionario2.getSalario()); // Teste Classe Funcion�rio
		
		// Teste de m�todos aumento e consultar.
	
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
