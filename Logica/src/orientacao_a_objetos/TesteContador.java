package orientacao_a_objetos;

public class TesteContador {

	public static void main(String[] args) {
		// TESTANDO CONTADOR
		
		Agencia a1 = new Agencia(1);
		Agencia a2 = new Agencia(2);
		Conta c1 = new Conta(a1);
		Conta c2 = new Conta(a2);
		
		// Print contas criadas.
		
		System.out.println(c1.getNumeroCc());
		System.out.println(c2.getNumeroCc());
		
		// Questao 53
		System.out.println(Conta.contador + " " + c2.zeraContador() + " " + Conta.contador);
	}

}
