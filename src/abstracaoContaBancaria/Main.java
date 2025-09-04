package abstracaoContaBancaria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int menuContas; //Seleção das contas (poupança, corrente e pessoa jurídica)
		int menuAcao = 0; //Seleção das ações dentro de uma conta (depósito, saque e exibição do saldo)
		
		Conta contPoup = new ContaPoupanca(menuAcao, menuAcao, null, menuAcao);
		Conta contCorr = new ContaCorrente(menuAcao, menuAcao, null, menuAcao);
		Conta contPJ = new ContaPessoaJuridica(menuAcao, menuAcao, null, menuAcao);
		
		do {
			System.out.println("Escolha uma conta:"
					+ "\n1 - Conta Corrente"
					+ "\n2 - Conta Poupanca"
					+ "\n3 - Conta Pessoa Jurídica"
					+ "\n4 - Encerrar programa");
			menuContas = sc.nextInt();
			
			if (menuContas == 1) {
				System.out.println("Você escolheu Conta Corrente, selecione uma opção:"
						+ "\n1 - Depositar"
						+ "\n2 - Sacar"
						+ "\n3 - Exibir saldo");
				menuAcao = sc.nextInt();
				if (menuAcao == 1) {
					System.out.print("Insira o valor do depósito: ");
					contCorr.depositar(sc.nextInt());
					contCorr.calcularTarifaMensal();
				} else if (menuAcao == 2) {
					System.out.print("Insira o valor do saque: ");
					contCorr.sacar(sc.nextInt());
				} else if (menuAcao == 3) {
					sc.nextLine();
					System.out.println(contCorr.exibirSaldo());
				}
			} else if (menuContas == 2) {
				System.out.println("Você escolheu Conta Poupança, selecione uma opção:"
						+ "\n1 - Depositar"
						+ "\n2 - Sacar"
						+ "\n3 - Exibir saldo");
				menuAcao = sc.nextInt();
				if (menuAcao == 1) {
					System.out.print("Insira o valor do depósito: ");
					contPoup.depositar(sc.nextInt());
				} else if (menuAcao == 2) {
					System.out.print("Insira o valor do saque: ");
					contPoup.sacar(sc.nextInt());
				} else if (menuAcao == 3) {
					sc.nextLine();
					System.out.println(contPoup.exibirSaldo());
				}
			} else if (menuContas == 3) {
				System.out.println("Você escolheu Conta Pessoa Jurídica, selecione uma opção:"
						+ "\n1 - Depositar"
						+ "\n2 - Sacar (Deve ser maior que a taxa de 1,50)"
						+ "\n3 - Exibir saldo");
				menuAcao = sc.nextInt();
				if (menuAcao == 1) {
					System.out.print("Insira o valor do depósito: ");
					contPJ.depositar(sc.nextInt());
					contPJ.calcularTarifaMensal();
				} else if (menuAcao == 2) {
					System.out.print("Insira o valor do saque: ");
					contPJ.sacar(sc.nextInt());
				} else if (menuAcao == 3) {
					sc.nextLine();
					System.out.println(contPJ.exibirSaldo());
				}
			} else if (menuContas == 4) {
				System.out.println("Encerrando o programa.");
			} else {
				System.out.println("Opção inválida, tente novamente.");
			}
			
		} while (menuContas != 4);
		sc.close();
	}

}
