package orientacao_a_objetos;

public class TesteTurma {

	public static void main(String[] args) {
			
		Turma turma1 = new Turma();
		Turma turma2 = new Turma();	
		
		turma1.periodo = "Noturno";
		turma1.serie = 5;
		turma1.sigla = "B";
		turma1.tipoensino = "Presencial";

		turma2.periodo = "Matutino";
		turma2.serie = 8;
		turma2.sigla = "A";
		turma2.tipoensino = "Distância";
		
		System.out.printf("Período: %s. Série: %dª. Sigla: %s. Tipo de Ensino: %s. \n", turma1.periodo, turma1.serie, turma1.sigla, turma1.tipoensino); // Teste Classe Turma
		System.out.printf("Período: %s. Série: %dª. Sigla: %s. Tipo de Ensino: %s. \n", turma2.periodo, turma2.serie, turma2.sigla, turma2.tipoensino); // Teste Classe Turma			
		
	}

}
