package br.com.questao;

import br.com.util.Teclado;

public class Questao19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 9) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas
			em dias. Obs: Considere os anos com 365 dias e os meses com 30 dias.
		 */
		
		int ano;
		int mes;
		int dia;
		int totaldias;
		
		ano = Teclado.lerInt("Anos: ");
		mes = Teclado.lerInt("Meses: ");
		dia = Teclado.lerInt("Dias: ");
		
		totaldias = (ano * 365) + (mes * 30) + dia;
		
		System.out.println("Total em dias: " + totaldias);
		
		
		
	}

}
