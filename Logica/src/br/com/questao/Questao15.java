package br.com.questao;

import br.com.util.Teclado;

public class Questao15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 5) Fazer um algoritmo que pergunte dois n�meros e ao final apresente os seguintes valores: a soma dos dois
			n�meros, a subtra��o do primeiro pelo segundo n�mero, a subtra��o do segundo pelo primeiro n�mero, a
			multiplica��o entre os dois n�meros, a divis�o do primeiro pelo segundo n�mero, e tamb�m o resto da divis�o
			do primeiro pelo segundo n�mero.
		 * 
		 */
		
		double n1;
		double n2;
		double soma;
		double subtrai;
		double multiplica;
		double divide;
		double resto;
		
		n1 = Teclado.lerDouble("Digite o primeiro n�mero: ");
		n2 = Teclado.lerDouble("Digite o segundo n�mero: ");
		
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
