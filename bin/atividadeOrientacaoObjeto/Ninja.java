package atividadeOrientacaoObjeto;

public class Ninja {
	
	private String vila;
	private String rank;
	private String jutsu;
	public Ninja(String vila, String rank, String jutsu) {
		super();
		this.vila = vila;
		this.rank = rank;
		this.jutsu = jutsu;
	}
	public String getVila() {
		return vila;
	}
	public void setVila(String vila) {
		this.vila = vila;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getJutsu() {
		return jutsu;
	}
	public void setJutsu(String jutsu) {
		this.jutsu = jutsu;
	}
	
	public void fazerJutsu() {
		System.out.println("Executando o jutsu: ");
	}
	
}
