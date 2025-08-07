package exercicio1Pessoa;

public class Pessoa {
	
	private String nome;
	
	private int idade;
	
	public void setIdade(int idade) {
		if (idade >= 0) {
			this.idade = idade;
			System.out.println("Você inseriu: " + idade);
		}else {
			System.out.println("Idade inválida");
		}
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "Pessoa [nome: " + nome + ", idade: " + idade + "]";
		}
	
}


