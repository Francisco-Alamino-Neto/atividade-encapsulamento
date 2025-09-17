package sistemaSimplesCache;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

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

		boolean continuar = true;
		
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
			String sair = "";
            while (!sair.equalsIgnoreCase("sim") && !sair.equalsIgnoreCase("não")) {
                System.out.println("Deseja sair? (sim/não)");
                sair = sc.nextLine().toLowerCase();

                if (sair.equalsIgnoreCase("não")) {
                    continuar = true;  // Continua o programa
                    break;  // Volta para o início do loop principal
                } else if (sair.equalsIgnoreCase("sim")) {
                    continuar = false;  // Encerra o programa
                    break;  // Sai do loop de confirmação
                } else {
                    System.out.println("Resposta inválida, por favor responda com 'sim' ou 'não'.");
                }
            }

        } while (continuar);  // O loop principal só continua se a resposta for "não" (deseja continuar)
    }
}
