package questoes;

import br.com.util.Teclado;

public class Questao25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1 = Teclado.lerInt("Digite um número inteiro: ");
		int numero2 = Teclado.lerInt("Digite um número inteiro: ");
		if (numero2 % numero1 == 0) {
			System.out.println("O segundo número é divisível pelo primeiro.");
		}
		else {
			System.out.println("O segundo número não é divisível pelo primeiro.");
		}
	}

}
