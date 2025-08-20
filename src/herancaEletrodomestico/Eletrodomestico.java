package herancaEletrodomestico;

public class Eletrodomestico {
	
	private String nome;
	private String cor;
	private int tensao;
	private double preco;
	
	public Eletrodomestico(String nome, String cor, int tensao, double preco) {
		this.nome = nome;
		this.cor = cor;
		this.tensao = tensao;
		this.preco = preco;
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

	public int getTensao() {
		return tensao;
	}

	public void setTensao(int tensao) {
		this.tensao = tensao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
