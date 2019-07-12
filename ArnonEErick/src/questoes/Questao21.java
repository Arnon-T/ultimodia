package questoes;

import br.com.util.Teclado;

public class Questao21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1 = Teclado.lerInt("Digite um valor inteiro: ");
		int numero2 = Teclado.lerInt("Digite um valor inteiro: ");
		int diferenca = 0;
		
		if (numero1 > numero2) {
			diferenca = numero1 - numero2;
			System.out.println("Diferença " + diferenca);
		}
		else {
			diferenca = numero2 - numero1;
			System.out.println("Diferença " + diferenca);
		}
		
	}

}
