package questoes;

import br.com.util.Teclado;

public class Questao10 {
	public static void main(String[] args) {
		int numero = Teclado.lerInt("Digite um número: ");
		int fatorial = numero;
		for (int i = 1; i < numero; i++) {
			fatorial = i*fatorial;
		}
		System.out.println(fatorial);
	}
}
