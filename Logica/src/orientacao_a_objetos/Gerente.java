package orientacao_a_objetos;

public class Gerente extends Funcionario {
	private String nome;
	private double salario;
	private final double aumentopadrao = 1.1;
	private String usuario;
	private String senha;
		
	// Método de aumento fixo.
	public void aumento() {
		this.salario *= aumentopadrao;
	}
	// Método de aumento variável.
	
	public void aumento(double valoraumento) {
		this.salario += valoraumento;
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
	public double getAumentopadrao() {
		return aumentopadrao;
	}	
	
	@Override
	public String mostraDados(){
		String dados =  "Nome do funcionário: " + this.getNome() + " . Salário: R$" + this.getSalario() + ". Bonificação: " + this.calculaBonificacao() + this.usuario + " " + this.senha;
	return dados;
	}
	
}
