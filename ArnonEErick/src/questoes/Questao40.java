package questoes;

import br.com.util.Teclado;

public class Questao40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Desenvolver um programa que peça ao usuário para digitar diversos números reais,
		 *  e ao final, exibir o maiore omenor número que foram digitados, além da média entre
		 *   TODOS os números digitadospelo usuário. A inserção de números deve parar quando o 
		 *   usuário digitar o número -1, e este número -1 não deve ser considerado nem como maior,
		 *    nem como menor, e nem na contagem da média.
		 */
		int maior = 0;
		int menor = 2147483647;
		int media = 0;
		int n = 0;		
		int i = 0;
		while (n != -1) {
			i++;
			n = Teclado.lerInt("Digite um número: ");
			if (n != -1) {
				media += (n/i); 
				
				if (maior < n) {
					maior = n;
				}
				if (menor > n) {
					menor = n;
				}
			}

		}
		System.out.printf("Média: %d. Maior: %d. Menor: %d.", media, maior, menor);
	}

}
