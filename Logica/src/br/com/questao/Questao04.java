package br.com.questao;

import br.com.util.Teclado;

public class Questao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		numero = Teclado.lerInt("Digite um número: ");
		
		System.out.println("Anterior : " + (numero - 1) + " Posterior: " + (numero + 1));
		
	}

}
