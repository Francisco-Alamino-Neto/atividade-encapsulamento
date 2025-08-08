package exercicio1Pessoa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int menu;
		
		Pessoa pessoa = new Pessoa();
		
		do {
			System.out.println("O que deseja fazer?"
					+ "\n1 - Inserir nome"
					+ "\n2 - Inserir idade"
					+ "\n3 - Conferir nome e idade"
					+ "\n4 - Sair");
			menu = sc.nextInt();
		
			if (menu == 1) {
				sc.nextLine();
				System.out.println("Insira seu nome: ");
				pessoa.setNome(sc.nextLine());
			} else if (menu == 2) {
				System.out.println("Insira sua idade: ");
				pessoa.setIdade(sc.nextInt());
			} else if (menu == 3) {
				System.out.println(pessoa.toString());
			} else if (menu == 4) {
				System.out.println("Encerrando o programa.");
			} else {
	            System.out.println("Opção inválida, tente novamente.");
			}
			
		} while (menu != 4);
		sc.close();
	}

}
