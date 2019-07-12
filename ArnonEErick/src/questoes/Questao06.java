package questoes;

import br.com.util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		int base = Teclado.lerInt("Digite a base da potência.");
		int expoente = Teclado.lerInt("Digite o expoente da potência.");
		int potencia = 0;
		
		for (int i = 0; i <= expoente; i++) {
			potencia = potencia * base;
			System.out.println(potencia);
		}

	}

}
