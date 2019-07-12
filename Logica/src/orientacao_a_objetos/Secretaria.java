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
		String dados =  "Nome do funcion�rio: " + this.getNome() + " . Sal�rio: R$" + this.getSalario() + ". Bonifica��o: " + this.calculaBonificacao() + this.ramal;
	return dados;
	}	
	
}
