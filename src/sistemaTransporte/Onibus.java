package sistemaTransporte;

public class Onibus extends Veiculo {
	
	public Onibus(String modelo) {
		super(modelo);
	}
	
	@Override
	public float calcularTempo(float distancia, int numero_paradas) {
		return (distancia / 60f) * 60 + (15 * numero_paradas);
	}
}
