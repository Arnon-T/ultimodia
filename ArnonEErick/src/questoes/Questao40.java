package questoes;

import br.com.util.Teclado;

public class Questao40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Desenvolver um programa que pe�a ao usu�rio para digitar diversos n�meros reais,
		 *  e ao final, exibir o maiore omenor n�mero que foram digitados, al�m da m�dia entre
		 *   TODOS os n�meros digitadospelo usu�rio. A inser��o de n�meros deve parar quando o 
		 *   usu�rio digitar o n�mero -1, e este n�mero -1 n�o deve ser considerado nem como maior,
		 *    nem como menor, e nem na contagem da m�dia.
		 */
		int maior = 0;
		int menor = 2147483647;
		int media = 0;
		int n = 0;		
		int i = 0;
		while (n != -1) {
			i++;
			n = Teclado.lerInt("Digite um n�mero: ");
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
		System.out.printf("M�dia: %d. Maior: %d. Menor: %d.", media, maior, menor);
	}

}
