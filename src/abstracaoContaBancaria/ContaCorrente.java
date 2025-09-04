package abstracaoContaBancaria;

import java.time.LocalDate;

public class ContaCorrente extends Conta {

private Meses ultimoMesTarifado; // Utilizando o enum Mes
	
	@Override
	void calcularTarifaMensal() {
		
		Meses mesAtual = Meses.values()[LocalDate.now().getMonthValue() - 1]; // LocalDate retorna um valor de 1 a 12, então subtrai 1 para ajustar ao índice do enum
		
		if (mesAtual != ultimoMesTarifado) {
            double tarifa = 12.0;
            double saldoAtual = getSaldo();

            if (saldoAtual >= tarifa) {
                setSaldo(saldoAtual - tarifa);
                ultimoMesTarifado = mesAtual; // Atualiza o mês da última tarifa cobrada
                System.out.println("Tarifa mensal de R$ 12,00 cobrada. Saldo atual: R$ " + getSaldo());
            } else {
                System.out.println("Saldo insuficiente para cobrar a tarifa mensal.");
            }
        } else {
            System.out.println("A tarifa mensal já foi cobrada neste mês.");
        }
	}
	
	public ContaCorrente(int numero, int agencia, String titular, double saldo) {
		super(numero, agencia, titular, saldo);
		// TODO Auto-generated constructor stub	
	}
}
