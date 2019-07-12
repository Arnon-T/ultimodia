package br.com.questao;

import br.com.util.Teclado;

public class Questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = {0,0,0,0};
		int soma = 0;
		int multiplica = 1;
		
		for (int i = 0; i < 4; i++) {
			numeros[i] = Teclado.lerInt("Digite  números: ");
		}
		
		for (int i = 0; i < 4; i++) {
			soma = numeros[i] + soma;
		}		
		
		for (int i = 0; i < 4; i++) {
			multiplica = numeros[i] * multiplica;			
		}
		
		System.out.println("Soma: " + soma);
		System.out.println("Multiplicação: " + multiplica);
		
	}

}
