package br.com.questao;

import br.com.util.Teclado;

public class Questao08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double distancia;
		double mediad;
		
		distancia = Teclado.lerDouble("Digite a distância da viagem: " );
		mediad = Teclado.lerDouble("Digite os Km/L referente ao carro: ");
		
		System.out.println("Gasto em L: " + (distancia/mediad));
		
		
	}

}
