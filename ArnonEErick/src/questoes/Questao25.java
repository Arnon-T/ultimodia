package questoes;

import br.com.util.Teclado;

public class Questao25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1 = Teclado.lerInt("Digite um n�mero inteiro: ");
		int numero2 = Teclado.lerInt("Digite um n�mero inteiro: ");
		if (numero2 % numero1 == 0) {
			System.out.println("O segundo n�mero � divis�vel pelo primeiro.");
		}
		else {
			System.out.println("O segundo n�mero n�o � divis�vel pelo primeiro.");
		}
	}

}
