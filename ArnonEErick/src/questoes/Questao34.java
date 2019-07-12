package questoes;

import br.com.util.Teclado;

public class Questao34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Desenvolver  um  programa  que  leiaum número nqualquer  menor  ou  igual  a  50  e apresente
		 *   o  valor  obtido  da multiplicação 
		 * sucessiva de npor 3 enquanto o produto for menor que 250. (n x 3; n x 3 x 3; n x 3 x 3 x 3 etc...).
		 */
		
		double n = Teclado.lerDouble("Digite um número inteiro menor ou igual a 50: ");
		double multi = 0;
		double i = 1.0;
		
		while (multi < 250) {		
			multi = n*(Math.pow(3, i));
			if (multi < 250) {
				System.out.println(multi);	
			}
			i++;
		}
	}
}
