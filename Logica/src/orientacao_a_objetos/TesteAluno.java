package orientacao_a_objetos;

public class TesteAluno {

	public static void main(String[] args) {
		/*
		 	Utilizei esta classe para testar:
		 	Utilização da Classe Aluno; e
		 	Conexão entre Classe Aluno e Classe Turma;
		 */
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
		Turma testeturma1 = new Turma();
		Turma testeturma2 = new Turma();
		
		aluno1.turma = testeturma1; // Conexão entre a Classe Aluno e a Classe Turma 
		aluno2.turma = testeturma2;	// Conexão entre a Classe Aluno e a Classe Turma
		
		aluno1.nome = "Aluno 1";
		aluno1.nascimento = "01/01/2001";
		aluno1.rg = 111111;
		aluno1.turma.periodo = "Noturno";
		aluno1.turma.serie = 5;
		aluno1.turma.sigla = "A";
		aluno1.turma.tipoensino = "Presencial";

		aluno2.nome = "Aluno 2";
		aluno2.nascimento = "02/02/2002";
		aluno2.rg = 222222;
		aluno2.turma.periodo = "Matutino";
		aluno2.turma.serie = 1;
		aluno2.turma.sigla = "B";
		aluno2.turma.tipoensino = "Distância";
		
		// Testes de output da Classe Turma utilizando objeto da Classe Aluno.
		
		System.out.printf("Nome: %s. Nascimento: %s. RG: %d. Período: %s. Série: %dª. Sigla: %s. Tipo de Ensino: %s. \n", aluno1.nome, aluno1.nascimento,
							aluno1.rg, aluno1.turma.periodo, aluno1.turma.serie, aluno1.turma.sigla, aluno1.turma.tipoensino);
		System.out.printf("Nome: %s. Nascimento: %s. RG: %d. Período: %s. Série: %dª. Sigla: %s. Tipo de Ensino: %s. \n", aluno2.nome, aluno2.nascimento,
							aluno2.rg, aluno2.turma.periodo, aluno2.turma.serie, aluno2.turma.sigla, aluno2.turma.tipoensino);		
	}

}