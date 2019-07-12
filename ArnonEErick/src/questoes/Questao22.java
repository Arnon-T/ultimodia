package questoes;

import br.com.util.Teclado;

public class Questao22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = Teclado.lerInt("Digite um valor inteiro positivo ou negativo: ");
		if (numero < 0) {
			numero = -(numero);
			System.out.println(numero);
		}
		else {
			System.out.println(numero);
		}
	}

}
