package br.com.questao;

import br.com.util.Teclado;

public class Questao20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  	10) Escreva um algoritmo pergunte o n�mero total de eleitores de um munic�pio, o n�mero de votos brancos, nulos
			e v�lidos e apresente como resposta o percentual que cada um representa em rela��o ao total de eleitores.
		 */
		
		double total;
		double branco;
		double nulo;
		double valido;
		double pbranco;
		double pnulo;
		double pvalido;
		
		total = Teclado.lerInt("Digite o total de eleitores na cidade: ");
		branco = Teclado.lerInt("Digite o n�mero de votos em branco: ");
		nulo = Teclado.lerInt("Digite o n�mero de votos nulos: ");
		valido = Teclado.lerInt("Digite o n�mero de votos v�lidos: ");
				
		pbranco = (branco/total) * 100;
		pnulo = (nulo/total) * 100;
		pvalido = (valido/total) * 100;
		
		System.out.println("Votos brancos:  " 	+ branco 	+ ". " + pbranco 	+ "%");
		System.out.println("Votos nulos:    " 	+ nulo 		+ ". " + pnulo 		+ "%");
		System.out.println("Votos v�lidos:  " 	+ valido 	+ ". " + pvalido	+ "%");
		System.out.println("Total de votos: " 	+ total 	+ ". 100%");
						
	}

}
