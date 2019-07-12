package questoes;

import br.com.util.Teclado;

public class Questao18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero = Teclado.lerDouble("Digite um número: ");
		if (numero % 2 == 0) {
			System.out.println("Par.");
		}
		else {
			System.out.println("Impar.");
		}
	}

}
