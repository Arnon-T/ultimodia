package br.com.questao;

import br.com.util.Teclado;

public class Questao11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1) Desenvolver um programa que pergunte o valor da conta a ser paga no restaurante e exiba como resposta o
			valor com o acréscimo dos 10% da gorjeta do garçom.
		 */
		
		double vconta;
		double vfinal;
		double ac = 1.1;
		
		vconta = Teclado.lerDouble("Digite o valor da conta.");
		
		vfinal = vconta * ac;
		
		System.out.println("Valor acrescido de 10% : " + vfinal);
		
		
	}

}
