package br.com.questao;

import br.com.util.Teclado;

public class Questao16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 6) Fazer um algoritmo que pergunte o nome de um vendedor, o seu sal�rio fixo e o total de vendas efetuadas por
			ele no m�s (em dinheiro). Sabendo que este vendedor ganha 15% de comiss�o sobre suas vendas efetuadas,
			exibir ao final o seu nome, o sal�rio fixo, a comiss�o e o sal�rio completo (fixo + comiss�o sobre vendas) no final
			do m�s.
		 * 
		 */
		
		String nome;
		double salario;
		double vendas;
		double sfinal;
		double comis;		
		
		nome = Teclado.lerTexto("Digite seu nome: ");
		salario = Teclado.lerDouble("Digite seu sal�rio: ");
		vendas = Teclado.lerDouble("Informe suas vendas do m�s: ");
		
		comis = vendas * 0.15;
		sfinal = salario + comis;
		
		System.out.println("Nome: " + nome);
		System.out.println("Sal�rio: " + salario);
		System.out.println("Vendas: " + vendas);
		System.out.println("Comiss�o: " + comis);
		System.out.println("Sal�rio completo: " + sfinal);			
		
	}

}
