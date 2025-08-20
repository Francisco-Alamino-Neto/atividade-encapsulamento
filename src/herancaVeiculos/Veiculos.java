package herancaVeiculos;

public class Veiculos {
	
	private String nome;
	private String cor;
	
	public Veiculos(String nome, String cor) {
		this.nome = nome;
		this.cor = cor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void iniciar() {
		System.out.println("Veículo está iniciando...");
	}
	
}
