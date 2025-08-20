package herancaVeiculos;

public class Main {

	public static void main(String[] args) {
		
		Carro carro = new Carro("Corolla","Cinza");
		Veiculos veiculo = new Veiculos("Civic", "Prata");
		
		carro.iniciar();
		veiculo.iniciar();
	}

}
