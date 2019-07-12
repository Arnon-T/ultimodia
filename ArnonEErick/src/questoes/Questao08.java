package questoes;

import br.com.util.Teclado;

public class Questao08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] nome = new String[20]; 
		String[] sexo = new String[20]; 
		int[] idade = new int[20];
		
		for (int i = 0; i < nome.length; i++) {
			nome[i] = Teclado.lerTexto("Digite o nome: ");
			sexo[i] = Teclado.lerTexto("Digite o sexo: ");
			idade[i]= Teclado.lerInt("Digite a idade: ");
		}
		for (int i = 0; i < nome.length; i++) {
			if (sexo[i].equalsIgnoreCase("M")) {
				if(idade[i] >= 21) {
					System.out.println(nome[i]);
				}
			}
		}
		
	}
}
