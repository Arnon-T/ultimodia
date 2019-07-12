package br.com.questao;

import br.com.util.Teclado;

public class Questao15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 5) Fazer um algoritmo que pergunte dois números e ao final apresente os seguintes valores: a soma dos dois
			números, a subtração do primeiro pelo segundo número, a subtração do segundo pelo primeiro número, a
			multiplicação entre os dois números, a divisão do primeiro pelo segundo número, e também o resto da divisão
			do primeiro pelo segundo número.
		 * 
		 */
		
		double n1;
		double n2;
		double soma;
		double subtrai;
		double multiplica;
		double divide;
		double resto;
		
		n1 = Teclado.lerDouble("Digite o primeiro número: ");
		n2 = Teclado.lerDouble("Digite o segundo número: ");
		
		soma = n1 + n2;
		subtrai = n2 - n1;
		multiplica = n1 * n2;
		divide = n1 / n2;
		resto = n1 % n2;
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtrai: " + subtrai);
		System.out.println("Multiplica: " + multiplica);
		System.out.println("Divide: " + divide);
		System.out.println("Resto: " + resto);
		
		
		
		
		
	}

}
