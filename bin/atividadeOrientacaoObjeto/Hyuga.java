package atividadeOrientacaoObjeto;

public class Hyuga extends Ninja implements KekkeiGenkai {
	
	public Hyuga(String vila, String rank, String justu) {
		super(vila, rank, justu);	}
	
	 @Override
	    public void usarKekkeiGenkai() {
	        System.out.println("Neji ativa o Byakugan! ");
	    }
	@Override
	public void fazerJutsu() {
		super.fazerJutsu();
		System.out.println(getJutsu());
	}
	
}
