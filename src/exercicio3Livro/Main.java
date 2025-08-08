package exercicio3Livro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int menu;
		
		Livro livro = new Livro();
		
		do {
			System.out.println("O que deseja fazer?"
					+ "\n1 - Inserir título do livro"
					+ "\n2 - Inserir autor do livro"
					+ "\n3 - Inserir número de páginas"
					+ "\n4 - Conferir "
					+ "\n5 - Sair");
			menu = sc.nextInt();
		
			if (menu == 1) {
				sc.nextLine();
				System.out.println("Insira o título: ");
				livro.setTitulo(sc.nextLine());
			} else if (menu == 2) {
				sc.nextLine();
				System.out.println("Insira o autor: ");
				livro.setAutor(sc.nextLine());
			} else if (menu == 3) {
				System.out.println("Insira o número de páginas:");
				livro.setNumeroPaginas(sc.nextInt());
			} else if (menu == 4) {
				System.out.println(livro.toString());
			} else if (menu == 5){
				System.out.println("Encerrando o programa.");
			} else {
				System.out.println("Opção inválida, tente novamente.");
			}
			
		} while (menu != 5);
		sc.close();
		
		
	}

}
