package questoes;

import br.com.util.Teclado;

public class Questao19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = Teclado.lerInt("Digite um n�mero inteiro: ");
		if (numero % 4 == 0 && numero % 5 == 0) {
			System.out.println(numero);
		}
		else {
			System.out.println("Valor n�o � divis�vel por 4 e 5.");
		}
	}

}
