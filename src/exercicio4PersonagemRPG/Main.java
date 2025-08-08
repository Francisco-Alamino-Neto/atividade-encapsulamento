package exercicio4PersonagemRPG;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int menu;
		
		PersonagemRPG pers = new PersonagemRPG();
		
		do {
			System.out.println("O que deseja fazer?"
					+ "\n1 - Inserir nome"
					+ "\n2 - Inserir classe"
					+ "\n3 - Inserir nível"
					+ "\n4 - Inserir vida"
					+ "\n5 - Conferir características"
					+ "\n6 - Sair");
			menu = sc.nextInt();
			
			if (menu == 1) {
				sc.nextLine();
				System.out.println("Insira o nome: ");
				pers.setNome(sc.nextLine());
			} else if (menu == 2) {
				sc.nextLine();
				System.out.println("Insira a classe: ");
				pers.setClasse(sc.nextLine());
			} else if (menu == 3) {
				System.out.println("Insira o nível: ");
				pers.setNivel(sc.nextInt());
			} else if (menu == 4) {
				System.out.println("Insira a vida: ");
				pers.setVida(sc.nextInt());
			} else if (menu == 5) {
				System.out.println(pers.toString());
			} else if (menu == 6){
				System.out.println("Encerrando o programa.");
			} else {
				System.out.println("Opção inválida, tente novamente.");
			}
			
			
		} while (menu != 6);
		sc.close();

	}

}
