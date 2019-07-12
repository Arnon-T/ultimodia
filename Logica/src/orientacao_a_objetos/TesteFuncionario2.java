package orientacao_a_objetos;

import java.util.ArrayList;

import br.com.util.Teclado;

public class TesteFuncionario2 {

	public static void main(String[] args) {
		
		/* 
		 * Crie uma classe chamada TesteFuncionario2. Dentro dessa classe, crie um objeto do tipo Funcionario.
		 *  Receba do teclado o valor para o atributo nome. Depois crie um la�o que permita que o usu�rio possa alterar o nome
		 *   e o sal�rio dos funcion�rios e tamb�m visualizar os dados atuais.
		 */
		
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		boolean sair = false;
		
		while (sair == false) {
			int operacao = Teclado.lerInt("Selecione uma opera��o. \n (1)Cadastrar novo funcion�rio; \n (2)Alterar cadastro de funcion�rio; \n (3) Listar funcion�rios cadastrados; \n (4)Sair. \n");
						
			if (operacao == 1) {
				Funcionario funcionario = new Funcionario();
				System.out.println("Cadastro de novo funcion�rio. \n");
				funcionario.setNome(Teclado.lerTexto("Digite o nome do funcion�rio: "));
				funcionario.setSalario(Teclado.lerDouble("Digite o sal�rio do funcion�rio: "));
				funcionarios.add(funcionario);	
			}
			else if (operacao == 2) {	
				System.out.println("Altera��o de cadastro de funcion�rio. \n");
				int somaFunc = funcionarios.size();
				System.out.println("Selecione um n�mero de funcion�rio de 1 a " + somaFunc);
				int codigoFunc = Teclado.lerInt("Selecione o c�digo do funcion�rio.");
					if (codigoFunc >= 0 && codigoFunc <= somaFunc){
						funcionarios.get(codigoFunc).setNome(Teclado.lerTexto("Digite o novo nome do funcion�rio " + codigoFunc + "."));
						funcionarios.get(codigoFunc).setSalario(Teclado.lerDouble("Digite o novo sal�rio do funcion�rio " + codigoFunc + "."));
					}
					else {
						System.out.println("Selecione um c�digo de funcion�rio v�lido.");
					}
			} 
			else if (operacao == 3) {
				System.out.println("Lista de funcion�rios cadastrados + sal�rios. \n");
				for (Funcionario todosFunc : funcionarios) {
					System.out.println(todosFunc.consultar() + "\n");				
				}			
			}
			else if (operacao == 4) {
				System.out.println("Encerrando programa.");
				sair = true;
			}
			else {
				System.out.println("Digite uma opera��o v�lida.");
			}
		}
	}
}