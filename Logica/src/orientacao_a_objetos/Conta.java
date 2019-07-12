package orientacao_a_objetos;

public class Conta {	
	
	private int numeroCc;
	private double saldo;
	private double limite = 100.0;
	private Agencia agencia;
	static int contador = 0;

	
	Conta(Agencia agencia){
		this.agencia = agencia;
		contador++;
		this.numeroCc += contador;
	}
	
	public void deposito(double valordeposito) {
		this.saldo += valordeposito;
	}
	
	public void saque(double valorsaque) {
		this.saldo -= valorsaque;
	}
	
	public void imprimeExtrato() {
		System.out.printf("Seu saldo é de R$%f.\n", this.saldo); // Método void utilizado apenas para impressão formatada de extrato de conta (saldo atual sem limite de crédito).
	}
	
	public double getSaldoTotal() {
		return this.saldo + this.limite; // O Saldo disponível inclui o valor do limite de crédito do cliente.
	}
	
	public void transfere(Conta origem, Conta destino, double valor) {
		origem.saldo -= valor;
		destino.saldo += valor;
	}	
	
	public int zeraContador(){
		int print = contador;
		contador = 0;
		return print;
	}

	public int getNumeroCc() {		
		return numeroCc;
	}
	
	public void setNumeroCc(int numerocc) {
		this.numeroCc = numerocc;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Conta.contador = contador;
	}



}
