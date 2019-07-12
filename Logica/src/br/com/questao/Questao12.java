package br.com.questao;

import br.com.util.Teclado;

public class Questao12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2) Desenvolver um programa que faça duas perguntas: o valor referente às horas atuais e o valor referente aos
			minutos atuais. Exemplo, se agora são 09:35h o usuário deverá informar como resposta às horas atuais o valor
			09 e como resposta aos minutos atuais o valor 35. Em seguida o programa deverá apresentar como resposta
			quantos minutos já se passaram desde às 00:00h deste dia.
		 * 
		 */
		
		int hora;
		int min;
		int deltat;
		
		hora = Teclado.lerInt("Digite a hora: ");
		min = Teclado.lerInt("Didite os minutos: ");
		
		deltat = (hora*60) + min;
		
		System.out.println("Já se passaram " + deltat + " minutos desde 00:00h.");
		
		
		
		
	}

}
