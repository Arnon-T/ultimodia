package orientacao_a_objetos;

public class Funcionario {
	
	private String nome;
	private double salario = 1000.00;	
	private double valeRefeicao = 100.00;
	
	public void aumento(double aumento) {
		this.salario += aumento;
	}
	
	public String mostraDados(){
		String dados =  "Nome do funcionário: " + this.nome + " . Salário: R$" + this.salario + ". Bonificação: " + this.calculaBonificacao() ;
		return dados;
	}
	// Questão 57
	public void ajusteValeRefeicao(double taxa) {
		this.valeRefeicao *= (1 + taxa);
	}

	public double calculaBonificacao() {
		return salario * 1.1;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getValeRefeicao() {
		return valeRefeicao;
	}

	public void setValeRefeicao(double valeRefeicao) {
		this.valeRefeicao = valeRefeicao;
	}
	
	
	
	
}
