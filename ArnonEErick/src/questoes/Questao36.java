package questoes;

public class Questao36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Desenvolver  um  programa  que  apresente  todos  os  valores  numéricos  inteiros  
		 * ímpares  situados  na  faixa  de  0  a 20.  Para  saber  se  o  número  é  ímpar, será  necessário
		 *   verificar  essa  condiçãocom  o  comando if.  Sendoímpar, mostre-o; não sendo, passe para o 
		 *   próximo passo.
		 */
		
		for (int i = 0; i < 20; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		} 
		
		
	}

}
