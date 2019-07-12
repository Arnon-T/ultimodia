package array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		int numeros[] = {5,3,2,4,1};
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		Arrays.sort(numeros);
		System.out.println("\n");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		int soma = 0;
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}
		int media = soma/numeros.length;
		System.out.println("\n" + media + "\n");
		
		System.out.println(numeros[numeros.length - 1]);
	}

}
