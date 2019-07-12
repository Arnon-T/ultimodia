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
		String dados =  "Nome do funcionário: " + this.getNome() + " . Salário: R$" + this.getSalario() + ". Bonificação: " + this.calculaBonificacao() + this.codigoEstacao;
	return dados;
	}		
}
