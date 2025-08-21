package sistemaTransporte;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Carro carro = new Carro("Corolla");
		Bicicleta bike = new Bicicleta("Monark");
		Onibus bus = new Onibus("MarcoPolo");
		
		int menu;
		
		do {
			System.out.println("Escolha um veículo para um trajeto de 100km:"
				+ "\n1 - Carro;"
				+ "\n2 - ônibus;"
				+ "\n3 - Bicicleta;"
				+ "\n4 - Encerrar programa.");
			menu = sc.nextInt();
		
			if (menu == 1) {
				System.out.println("Um carro levaria " + carro.calcularTempo(100) + " minutos.");
			} else if (menu == 2) {	
				System.out.println("Um ônibus levaria " + bus.calcularTempo(100,4) + " minutos.");
			} else if (menu == 3) {
				System.out.println("Uma bicicleta levaria " + bike.calcularTempo(100) + " minutos.");
			} else if (menu == 4 ){
				System.out.println("Encerrando programa.");
			} else {
				System.out.println("Opção inválida, tente novamente.");
			}
		} while (menu != 4);
		
	}
	
}
