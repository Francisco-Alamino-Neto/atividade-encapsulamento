package contaBancaria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int menu;
		
		ContaBancaria conta = new ContaBancaria(); //O nome disso é instanciar objeto
		
		do {
		System.out.println("O que deseja fazer?"
				+ "\n1 - Consultar saldo"
				+ "\n2 - Depositar"
				+ "\n3 - Sacar"
				+ "\n4 - Sair");
		
		menu = sc.nextInt();
		
		if (menu == 1) {
		System.out.println("Seu saldo atual é: " + conta.getSaldo());
		} else if (menu == 2) {
			System.out.println("Deposite o valor desejado.");
			conta.depositar(sc.nextDouble());
		} else if (menu == 3) {
			System.out.println("Saque o valor desejado.");
			conta.sacar(sc.nextDouble());
		} else if (menu == 4) {
			System.out.println("Encerrando o programa.");
        } else {
            System.out.println("Opção inválida, tente novamente.");
		}
		
		} while (menu != 4);
		sc.close();
	}

}
