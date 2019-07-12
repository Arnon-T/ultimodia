package orientacao_a_objetos;

public class TesteAgencia {

	public static void main(String[] args) {
						
		Agencia testeag1 = new Agencia(11011);
		Agencia testeag2 = new Agencia(22022);
		
		//testeag1.numeroag = 11011;
		//testeag2.numeroag = 22022;
		
		System.out.printf("Número Ag.: %d.\n", testeag1.getNumeroag());
		System.out.printf("Número Ag.: %d.\n", testeag2.getNumeroag());		
		
	}

}
