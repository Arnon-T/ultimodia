package orientacao_a_objetos;

public class TesteCliente {

	public static void main(String[] args) {
					
		Cliente clienteteste1 = new Cliente();		
		Cliente clienteteste2 = new Cliente();
		
		clienteteste1.setNomecliente("Cliente 1");
		clienteteste2.setNomecliente("Cliente 2");
		clienteteste1.setCodigocliente(11);
		clienteteste2.setCodigocliente(22);
		
		System.out.printf("Nome do cliente %s. Código do cliente %s. \n",   clienteteste1.getNomecliente(), clienteteste1.getCodigocliente()); //Teste Classe Cliente
		System.out.printf("Nome do cliente %s. Código do cliente %s. \n",   clienteteste2.getNomecliente(), clienteteste2.getCodigocliente()); //Teste Classe Cliente
		
	}

}
