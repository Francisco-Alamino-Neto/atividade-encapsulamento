package exercicio2Produto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int menu;
		
		Produto prod = new Produto();
		
		do {
			System.out.println("O que deseja fazer?"
					+ "\n1 - Inserir nome"
					+ "\n2 - Inserir preço"
					+ "\n3 - Aplicar desconto"
					+ "\n4 - Conferir nome e preço"
					+ "\n5 - Sair");
			menu = sc.nextInt();
		
			if (menu == 1) {
				System.out.println("Insira o nome: ");
				prod.setNome(sc.next());
			} else if (menu == 2) {
				System.out.println("Insira o preço: ");
				prod.setPreco(sc.nextDouble());
			} else if (menu == 3) {
				System.out.println("Insira o desconto, em porcentagem (não é necessário colocar %):");
				prod.calculoDesconto(sc.nextDouble());
				System.out.println("Preço após desconto é: " + prod.resultadoDesconto());
			} else if (menu == 4) {
				System.out.println(prod.toString());
			} else if (menu == 5){
				System.out.println("Encerrando o programa.");
			} else {
				System.out.println("Opção inválida, tente novamente.");
			}
			
		} while (menu != 5);
		sc.close();
	}

}
