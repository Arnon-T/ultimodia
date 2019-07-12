package br.com.questao;

import br.com.util.Teclado;

public class Questao16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 6) Fazer um algoritmo que pergunte o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por
			ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
			exibir ao final o seu nome, o salário fixo, a comissão e o salário completo (fixo + comissão sobre vendas) no final
			do mês.
		 * 
		 */
		
		String nome;
		double salario;
		double vendas;
		double sfinal;
		double comis;		
		
		nome = Teclado.lerTexto("Digite seu nome: ");
		salario = Teclado.lerDouble("Digite seu salário: ");
		vendas = Teclado.lerDouble("Informe suas vendas do mês: ");
		
		comis = vendas * 0.15;
		sfinal = salario + comis;
		
		System.out.println("Nome: " + nome);
		System.out.println("Salário: " + salario);
		System.out.println("Vendas: " + vendas);
		System.out.println("Comissão: " + comis);
		System.out.println("Salário completo: " + sfinal);			
		
	}

}
