package herancaEletrodomestico;

public class Microondas extends Eletrodomestico {

	private double capacidade;

	public Microondas(String nome, String cor, int tensao, double preco, double capacidade) {
		super(nome, cor, tensao, preco);
		this.capacidade = capacidade;
	}

	public double getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}
	
}
