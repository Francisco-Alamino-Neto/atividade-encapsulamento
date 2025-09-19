package atividadeOrientacaoObjeto;

public class Uchiha extends Ninja implements KekkeiGenkai { 
	
	public Uchiha(String vila, String rank, String justu) {
		super(vila, rank, justu);	}
	
	
	 @Override
	    public void usarKekkeiGenkai() {
	        System.out.println("Ativa o Mangekyou Sharingan! ");
	    }
	@Override
	public void fazerJutsu() {
		super.fazerJutsu();
		System.out.println(getJutsu());
		}
	
}
