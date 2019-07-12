package br.com.questao;

import br.com.util.Teclado;

public class Questao09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double numero;
		
		numero = Teclado.lerDouble("Digite um número: ");
		
		System.out.println("Potência = " + Math.pow(numero, 2));
		System.out.println("Raiz = " + Math.sqrt(numero));
		
	}

}
