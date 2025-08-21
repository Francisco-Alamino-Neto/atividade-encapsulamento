package sistemaTransporte;

public class Carro extends Veiculo {

	public Carro(String modelo) {
		super(modelo);
	}
	
	@Override
	public float calcularTempo(float distancia) {
		return (distancia / 80f) * 60;
	}
}
