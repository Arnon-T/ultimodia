package br.com.questao;

import br.com.util.Teclado;

public class Questao17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 7) A Loja Mamão com Açúcar está vendendo seus produtos em até 10 prestações sem juros. Faça um algoritmo que
			pergunte um valor de uma compra, o número de prestações escolhidas e apresente como resultado o valor das
			prestações.
		 * 
		 */
		
		double vcompra;
		int prestacao;
		double vprestacao;
		
		vcompra = Teclado.lerDouble("Digite o valor das compras: ");
		prestacao = Teclado.lerInt("Informe o número de prestações: ");
		
		vprestacao = vcompra / prestacao;
		
		System.out.println(prestacao + " prestações, de R$ " + vprestacao + ". Total: R$ " + vcompra);
		
		
	}

}
