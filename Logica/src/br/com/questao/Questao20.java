package br.com.questao;

import br.com.util.Teclado;

public class Questao20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  	10) Escreva um algoritmo pergunte o número total de eleitores de um município, o número de votos brancos, nulos
			e válidos e apresente como resposta o percentual que cada um representa em relação ao total de eleitores.
		 */
		
		double total;
		double branco;
		double nulo;
		double valido;
		double pbranco;
		double pnulo;
		double pvalido;
		
		total = Teclado.lerInt("Digite o total de eleitores na cidade: ");
		branco = Teclado.lerInt("Digite o número de votos em branco: ");
		nulo = Teclado.lerInt("Digite o número de votos nulos: ");
		valido = Teclado.lerInt("Digite o número de votos válidos: ");
				
		pbranco = (branco/total) * 100;
		pnulo = (nulo/total) * 100;
		pvalido = (valido/total) * 100;
		
		System.out.println("Votos brancos:  " 	+ branco 	+ ". " + pbranco 	+ "%");
		System.out.println("Votos nulos:    " 	+ nulo 		+ ". " + pnulo 		+ "%");
		System.out.println("Votos válidos:  " 	+ valido 	+ ". " + pvalido	+ "%");
		System.out.println("Total de votos: " 	+ total 	+ ". 100%");
						
	}

}
