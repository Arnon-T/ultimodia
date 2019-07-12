package questoes;

import br.com.util.Teclado;

public class Questao24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero = Teclado.lerDouble("Digite um número: ");
		if (numero > 0) {
			System.out.println("Positivo.");
		}
		else if (numero < 0) {
			System.out.println("Negativo.");
		}
		else {
			System.out.println("Nulo.");
		}
	}

}
