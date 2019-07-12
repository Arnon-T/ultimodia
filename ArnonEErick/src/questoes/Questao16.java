package questoes;

import br.com.util.Teclado;

public class Questao16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero = Teclado.lerDouble("Digite um numero: ");
		if (numero < 20) {
			numero /= 2;
			System.out.println(numero);
		}
		else {
			System.out.println(numero);
		}
	}

}
