package br.com.questao;

import br.com.util.Teclado;

public class Questao18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 8) Fazer um algoritmo que receba o pre�o de custo de um produto e mostre como resposta o valor de venda. 
		 * Sabe-se que o pre�o de custo receber� um acr�scimo de acordo com um percentual informado pelo usu�rio.
		 * 
		 */
		
		double custoproduto;
		double valorvenda;
		double acrescimo;
		double vacrescimo;
				
		custoproduto = Teclado.lerDouble("Digite o custo do produto: ");
		acrescimo = Teclado.lerDouble("Digite o percentual a ser acrescido no custo: ");
		
		vacrescimo = (acrescimo / 100) * custoproduto;		
		valorvenda = custoproduto + vacrescimo;		
		
		System.out.println("Valor venda: " + valorvenda);
		System.out.println("Custo produto: " + custoproduto);
		System.out.println("Valor acrescimo: " + vacrescimo);
		
		
	}

}
