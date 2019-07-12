package br.com.questao;

import br.com.util.Teclado;

public class Questao07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n1,n2,n3;
		
		n1 = Teclado.lerInt("Digite n1: ");
		n2 = Teclado.lerInt("Digite n2: ");
		n3 = Teclado.lerInt("Digite n3: ");
		
		System.out.println("Média = " + ((n1+n2+n3)/3));
		
	}

}
