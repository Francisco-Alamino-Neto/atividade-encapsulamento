package atividadeOrientacaoObjeto;

public class Uzumaki extends Ninja{

	public Uzumaki(String vila, String rank, String jutsu) {
		super(vila, rank, jutsu);	}
	
	
	@Override
	public void fazerJutsu() {
		super.fazerJutsu();
		System.out.println("Rasenshuriken");
}
}