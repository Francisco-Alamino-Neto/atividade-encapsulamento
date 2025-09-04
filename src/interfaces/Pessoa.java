package interfaces;

public class Pessoa extends SerVivo implements Coracao, Rim {

	@Override
	public void bater() {
		System.out.println("Batendo");
	}

	@Override
	public void filtro() {
	}
}
