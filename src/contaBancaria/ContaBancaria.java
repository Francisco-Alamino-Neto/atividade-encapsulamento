package contaBancaria;

public class ContaBancaria {
	
	private double saldo;

	public void consultarSaldo() {
		System.out.println("Seu saldo é : " + saldo);
	}
	
	public double depositar(double deposito) {
		return saldo = saldo + deposito;
	}
	
	public void sacar(double saque) {
		if (saldo >= saque) {
		saldo = saldo - saque;
		System.out.println("Seu saldo atual é: " + saldo);
		}else {
			System.out.println("Saldo insuficiente");
		}
	}

	public double getSaldo() {
		return saldo;
	}
	
}
