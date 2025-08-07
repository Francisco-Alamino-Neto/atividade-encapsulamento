package exercicio4PersonagemRPG;

public class PersonagemRPG {
	
	private String nome;
	
	private String classe;
	
	private int nivel;
	
	private int vida;
	
	public void setNome(String nome) {
		this.nome = nome;
		}
	
	public void setClasse(String classe) {
		this.classe = classe;
		}

	public void setNivel(int nivel) {
		if (nivel < 1) {
			System.out.println("Nível inválido");
		} else {
		this.nivel = nivel;
		}
	}

	public void setVida(int vida) {
		if (vida < 100 && vida > 0) {
			this.vida = vida;
		} else {
			System.out.println("Vida inválida");
		}
	}
	
	public String toString() {
	return "--Características do personagem--"
			+ "\n1 - Nome: " + nome
			+ "\n2 - Classe: " + classe
			+ "\n3 - Nível: " + nivel
			+ "\n4 - Vida: " + vida;
		}
	
}
