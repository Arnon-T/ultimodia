package questoes;

import br.com.util.Teclado;

public class Questao17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String capital = Teclado.lerTexto("Digite a capital do Brasil: ");
		
		if (capital.equalsIgnoreCase("Brasília")) {
			System.out.println("Correto");
		}
		else {
			System.out.println("Incorreto.");
		}
		
	}

}
