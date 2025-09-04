package abstracao;

public class Main {
	public static void main(String[] args) {
		
	//	SerVivo bacteria = new SerVivo();
		
		SerVivo dogao = new Cachorro();
		
		SerVivo bili = new Humano();
		
		dogao.setCor(Cores.AZUL);
		
		for (Cores cor : Cores.values()) {
			System.out.println(cor + " " + cor.getI());
		}

	}

}
