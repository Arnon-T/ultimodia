package br.com.questao;

import br.com.util.Teclado;

public class Questao14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 4) Desenvolver um programa que pergunte ao usu�rio o seu peso e sua altura. Ao final o programa dever� exibir na
			tela o valor do �ndice de massa corporal desta pessoa (IMC).
			F�rmula: IMC = peso / altura2
 			- Obs: peso em quilos e altura em metros.
		 * 
		 */
		
		double peso;
		double altura;
		double IMC;
		
		peso = Teclado.lerDouble("Digite seu peso: ");
		altura = Teclado.lerDouble("digite sua altura: ");
		
		IMC = peso / (altura * altura);
		
		System.out.println("Seu IMC �: " + IMC);
		
		
		
		
		
	}

}
