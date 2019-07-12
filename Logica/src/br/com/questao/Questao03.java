package br.com.questao;

import br.com.util.Teclado;

public class Questao03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double valordolar = 3.8;		
		double digitado;
		
		digitado = Teclado.lerDouble("Digite um valor em dólares: ");
		
		
		System.out.println("R$ " + valordolar * digitado);
		
	}

}
