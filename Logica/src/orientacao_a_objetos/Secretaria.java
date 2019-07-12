package orientacao_a_objetos;

public class Secretaria extends Funcionario{
	
	private int ramal;

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
	
	@Override
	public String mostraDados(){
		String dados =  "Nome do funcionário: " + this.getNome() + " . Salário: R$" + this.getSalario() + ". Bonificação: " + this.calculaBonificacao() + this.ramal;
	return dados;
	}	
	
}
