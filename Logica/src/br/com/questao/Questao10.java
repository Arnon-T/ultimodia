package br.com.questao;

public class Questao10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//prestação = valor + (valor x (taxa : 100) x tempo em dias).
		
		double valor = 2000;
		double taxa = 10;
		int tempo = 10; //em dias
		double prestacao = valor + (valor * (taxa / 100) * tempo);
		System.out.println(prestacao);
	}

}
