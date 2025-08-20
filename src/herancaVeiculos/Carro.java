package herancaVeiculos;

public class Carro extends Veiculos {

	public Carro(String nome, String cor, double tamanho) {
		super(nome, cor, tamanho);
	}
	
	@Override
	public void fazerSom() {
		super.fazerSom();
		System.out.println("MuuuuuuHHH");
	}
}
