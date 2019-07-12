package questoes;

import br.com.util.Teclado;

public class Questao23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = Teclado.lerInt("Digite um numero inteiro: ");
		if (numero <= 10 && numero >= 1) {
			//Teste
			System.out.println(numero);
		}
	}

}
