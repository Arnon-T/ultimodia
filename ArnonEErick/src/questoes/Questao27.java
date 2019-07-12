package questoes;

import java.util.Arrays;

import br.com.util.Teclado;

public class Questao27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int[5];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Teclado.lerInt("Digite um número inteiro: ");
		}
		
		Arrays.parallelSort(numeros);
		
		System.out.println("Menor : " + numeros[0]);
		System.out.println("Maior : " + numeros[4]);
	}

}
