package br.com.questao;

import br.com.util.Teclado;

public class Questao17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 7) A Loja Mam�o com A��car est� vendendo seus produtos em at� 10 presta��es sem juros. Fa�a um algoritmo que
			pergunte um valor de uma compra, o n�mero de presta��es escolhidas e apresente como resultado o valor das
			presta��es.
		 * 
		 */
		
		double vcompra;
		int prestacao;
		double vprestacao;
		
		vcompra = Teclado.lerDouble("Digite o valor das compras: ");
		prestacao = Teclado.lerInt("Informe o n�mero de presta��es: ");
		
		vprestacao = vcompra / prestacao;
		
		System.out.println(prestacao + " presta��es, de R$ " + vprestacao + ". Total: R$ " + vcompra);
		
		
	}

}
