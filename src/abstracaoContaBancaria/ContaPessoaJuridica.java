package abstracaoContaBancaria;

import java.time.LocalDate;

public class ContaPessoaJuridica extends Conta {

	public ContaPessoaJuridica(int numero, int agencia, String titular, double saldo) {
		super(numero, agencia, titular, saldo);
	}

	public void sacar(double valor) {
		if (valor > saldo || valor < 1.50) {
			System.out.println("Saque inválido, tente novamente.");
		} else {
			saldo = valor - saldo - 1.50;
			System.out.println("Taxa de 1,50 aplicada, valor sacado: " + (valor - 1.50));
		}
	}

	private Meses ultimoMesTarifado;

	@Override
	void calcularTarifaMensal() {

		Meses mesAtual = Meses.values()[LocalDate.now().getMonthValue() - 1];

		if (mesAtual != ultimoMesTarifado) {
			double tarifa = 20.0;
			double saldoAtual = getSaldo();

			if (saldoAtual >= tarifa) {
				setSaldo(saldoAtual - tarifa);
				ultimoMesTarifado = mesAtual;
				System.out.println("Tarifa mensal de R$ 20,00 cobrada. Saldo atual: R$ " + getSaldo());
			} else {
				System.out.println("Saldo insuficiente para cobrar a tarifa mensal.");
			}
		} else {
			System.out.println("A tarifa mensal já foi cobrada neste mês.");
		}
	}

}
