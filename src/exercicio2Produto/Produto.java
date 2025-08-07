package exercicio2Produto;

public class Produto {
	
	private String nome;
	
	private double preco;
	
	public double desconto;
	
	public void setNome(String nome) {
		this.nome = nome;
		}
	
	public void setPreco(double preco) {
		if (preco < 0) {
			System.out.println("Preço inválido");	
		} else {
			System.out.println("Você inseriu: " + preco);
			this.preco=preco;
		}
	}
	
		
	public void calculoDesconto(double desconto) {
		if (desconto < 0) {
			System.out.println("Desconto inválido");
		} else if (desconto > 100) {
			System.out.println("Desconto inválido");
		} else {
			this.desconto = preco * (desconto / 100);
		}
	}
	
	public double resultadoDesconto() {
		return preco - desconto;
	}
	
	public String toString() {
		return "Produto [nome: " + nome + ", preço: " + resultadoDesconto() + "]";
		}
		
	}
