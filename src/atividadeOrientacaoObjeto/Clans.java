package atividadeOrientacaoObjeto;

public class Clans {
	
	private String nomeClan;
	private String personagens;
	private String kekkeiGenkai;
	
	public Clans(String nomeClan, String personagens, String kekkeiGenkai) {
		this.nomeClan = nomeClan;
		this.personagens = personagens;
		this.kekkeiGenkai = kekkeiGenkai;
	}
	
	public String getNomeClan() {
		return nomeClan;
	}
	public void setNomeClan(String nomeClan) {
		this.nomeClan = nomeClan;
	}
	public String getPersonagens() {
		return personagens;
	}
	public void setPersonagens(String personagens) {
		this.personagens = personagens;
	}
	public String getKekkeiGenkai() {
		return kekkeiGenkai;
	}
	public void setKekkeiGenkai(String kekkeiGenkai) {
		this.kekkeiGenkai = kekkeiGenkai;
	}
	
	
}
