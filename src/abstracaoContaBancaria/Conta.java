package abstracaoContaBancaria;

public abstract class Conta {

	private int numero;
	private int agencia;
	private String titular;
	protected double saldo;
	
	public Conta(int numero, int agencia, String titular, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.titular = titular;
		this.saldo = saldo;
	}


	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	//Se o valor do depósito for menor ou igual a zero, a operação será inválida
	public void depositar(double valor) {
		if (valor <= 0) {
			System.out.println("Depósito inválido, tente novamente.");
		} else {
			saldo = valor + saldo;
		}
	}
	//Se valor de saque for maior que saldo, a operação será inválida.
	public void sacar(double valor) {
		if (valor > saldo) {
			System.out.println("Saque inválido, tente novamente.");
		} else {
			saldo = valor - saldo;
		}
	}

	public double exibirSaldo() {
		return saldo;
	}
	
	abstract void calcularTarifaMensal();
}
