package sistemaTransporte;

public class Veiculo {
	
	private String modelo;
	
	public Veiculo(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public float calcularTempo(float distancia) {
		return (distancia / 00f) * 60;
	}

	public float calcularTempo(float distancia, int numero_paradas) {
		return (distancia / 00f) * 60 + (15 * numero_paradas);
	}
	
}
