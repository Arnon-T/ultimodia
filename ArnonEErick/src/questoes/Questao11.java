package questoes;

public class Questao11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] matriz = new String [10][10];
			for (int i = 1; i < matriz.length; i++) {
				System.out.println("\n");
				for (int j = 1; j < matriz.length; j++) {
					System.out.print(" " + i + "-" + j);
				}
			}
	}

}
