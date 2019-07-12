package br.com.questao;

import br.com.util.Teclado;

public class Questao13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 3) Desenvolver um programa que pergunte ao usuário o seu peso (em quilos) e sua altura (em metros). Ao final o
			programa deverá exibir na tela para o usuário o valor do peso informado em gramas e a altura em centímetros.
		 * 
		 */
		
		
		double peso;
		double altura;
		
		peso = Teclado.lerDouble("Digite o peso em kg: ");
		altura = Teclado.lerDouble("Digite a altura em m: ");
		
		peso = peso * 1000;
		altura = altura * 100;
		
		System.out.println("Peso em g: " + peso + " g");
		System.out.println("Altura em cm: " + altura + " cm");
		
		
		
		
		
		
		
	}

}
