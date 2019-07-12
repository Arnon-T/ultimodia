package br.com.questao;

import br.com.util.Teclado;

public class Questao01 {

	public static void main(String[] args) {
		
		String nome, sexo;
		
		nome = Teclado.lerTexto("Digite o nome");
		
		System.out.println("O nome informado foi: " + nome + "\n");
		
		
		sexo = Teclado.lerTexto("Digite o sexo: ");
		
		System.out.println("O sexo digitado foi: " + sexo);
		
	}

}
