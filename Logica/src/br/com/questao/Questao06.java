package br.com.questao;

import br.com.util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double f;
		
		f = Teclado.lerDouble("Digite uma temperatura em F: ");
		
		double c = (f - 32) * 5/9;
		
		System.out.println("Temp em C: " + c);
		
	}

}
