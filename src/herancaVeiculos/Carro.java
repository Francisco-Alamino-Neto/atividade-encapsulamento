package herancaVeiculos;

public class Carro extends Veiculos {

	public Carro(String nome, String cor) {
		super(nome, cor);
	}
	
	@Override
	public void iniciar() {
		System.out.println("Carro está iniciando...");
	}
}
