package atividadeOrientacaoObjeto;

public class Main {

	public static void main(String[] args) {
		
		Uzumaki naruto = new Uzumaki("konoha", "hokage", "rasenshuriken");
		Kaguya kimimaro = new Kaguya("Otogakure", "Líder dos Cinco do Som", "Dança do Salgueiro");
		Uchiha itachi = new Uchiha("konoha", "nukenin", "Amaterasu");
		Hyuga neji = new Hyuga("konoha", "jonin", "Oito Trigramas Sessenta e Quatro Palmas");
		
		naruto.fazerJutsu();
		System.out.println();
		
		kimimaro.usarKekkeiGenkai();
		kimimaro.fazerJutsu();
		System.out.println();
		
		itachi.usarKekkeiGenkai();
		itachi.fazerJutsu();
		System.out.println();
		
		neji.usarKekkeiGenkai();
		neji.fazerJutsu();
		
	}

}
