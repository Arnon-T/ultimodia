package questoes;

import br.com.util.Teclado;

public class Questao28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = Teclado.lerDouble("Digite o primeiro n�mero: ");
		double b = Teclado.lerDouble("Digite o segundo n�mero: ");
		double c = Teclado.lerDouble("Digite o terceiro n�mero: ");
		double maior = 0.0;
		double segundoMaior = 0.0;
		double terceiroMaior = 0.0;
		
		
		if (a > b && b > c) {
			maior = a;
			segundoMaior = b;
			terceiroMaior = c;
		}
		
		if (a > b && c > b) {
			maior = a;
			segundoMaior = c;
			terceiroMaior = b;
		}
		else if (b > c && c > a) {
			maior = b;
			segundoMaior = c;
			terceiroMaior = a;
		}
		else if (b > c && a > c) {
			maior = b;
			segundoMaior = a;
			terceiroMaior = c;
		}
		else if (c > b && a > b) {
			maior = c;
			segundoMaior = a;
			terceiroMaior = b;
		}
		else{
			maior = c;
			segundoMaior = b;
			terceiroMaior = a;
		}
		
		System.out.println("Maior " + maior + ". Segundo " + segundoMaior + ". Terceiro " + terceiroMaior);

		
	}

}
