package atividadeOrientacaoObjeto;

public class Kaguya extends Ninja implements KekkeiGenkai{
	
	public Kaguya(String vila, String rank, String justu) {
		super(vila, rank, justu);	}
	
	
	   @Override
	    public void usarKekkeiGenkai() {
	        System.out.println("Kimimaro ativa o Shikotsumyaku (Pulso de Ossos Mortos)! ");
	    }
	@Override
	public void fazerJutsu() {
		super.fazerJutsu();
		System.out.println(getJutsu());
	}
}
