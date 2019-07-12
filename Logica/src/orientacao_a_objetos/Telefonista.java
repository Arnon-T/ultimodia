package orientacao_a_objetos;

public class Telefonista extends Funcionario {
	private int codigoEstacao;

	public int getCodigoEstacao() {
		return codigoEstacao;
	}

	public void setCodigoEstacao(int codigoEstacao) {
		this.codigoEstacao = codigoEstacao;
	}
	
	@Override
	public String mostraDados(){
		String dados =  "Nome do funcion�rio: " + this.getNome() + " . Sal�rio: R$" + this.getSalario() + ". Bonifica��o: " + this.calculaBonificacao() + this.codigoEstacao;
	return dados;
	}		
}
