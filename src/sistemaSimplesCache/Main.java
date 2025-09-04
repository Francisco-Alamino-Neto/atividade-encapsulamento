package sistemaSimplesCache;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String sair;
		int menu;
		int id = 1;

		// Lista que representa o banco de dados
		List<Pessoa> banco = new ArrayList<>();
		// Lista que representa o cache (mais acessados)
		List<Pessoa> cache = new ArrayList<>();

		// Adicionando pessoas ao banco
		banco.add(new Pessoa(id++, "Isabel", 25));
		banco.add(new Pessoa(id++, "Vladimir", 35));
		banco.add(new Pessoa(id++, "Maria", 40));
		banco.add(new Pessoa(id++, "Aristoteles", 50));
		banco.add(new Pessoa(id++, "Himari", 20));

		do {
			System.out.println("Digite o ID de uma pessoa:");
			menu = sc.nextInt();

			boolean encontrada = false;

			for (Pessoa p : cache) {
				if (menu == p.getId()) {
					encontrada = true;
					System.out.println(p.toString());
					break;
				} else {
					break;
				}
			}

			if (!encontrada) {
				for (Pessoa p : banco) {
					if (menu == p.getId()) {
						encontrada = true;
						System.out.println(p.toString());
						break;
					} else {
						System.out.println("Pessoa não encontrada, você deseja inseri-la no banco?");
						String resposta = sc.nextLine().toLowerCase();
						if (resposta.equalsIgnoreCase("sim")) {
							System.out.print("Insira o nome da pessoa: ");
							String nome = sc.nextLine();
							System.out.println("Digite a idade da pessoa: ");
							int idade = sc.nextInt();
							banco.add(new Pessoa(id++, nome, idade));
						} else if (resposta.equalsIgnoreCase("não")) {
							break;
						} else {
							System.out.println("Resposta inválida");
						}
					}
				}
			}
			System.out.println("Deseja sair?");
			sair = sc.nextLine().toLowerCase();
			sc.nextLine();
		} while (!sair.equalsIgnoreCase("sim"));

	}

}
