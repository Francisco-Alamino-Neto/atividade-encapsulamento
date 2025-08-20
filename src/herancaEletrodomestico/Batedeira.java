package herancaEletrodomestico;

public class Batedeira extends Eletrodomestico{

	private int potencia;

	public Batedeira(String nome, String cor, int tensao, double preco, int potencia) {
		super(nome, cor, tensao, preco);
		this.potencia = potencia;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
}
