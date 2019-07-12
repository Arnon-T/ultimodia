package br.com.questao;

import br.com.util.Teclado;

public class Questao05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salario;
		final double acrescimo = 1.15;
		
		salario = Teclado.lerDouble("Digite o salário: ");
		
		System.out.println("Salário com acrescimo: " + (salario*acrescimo));
		
		
	}

}
