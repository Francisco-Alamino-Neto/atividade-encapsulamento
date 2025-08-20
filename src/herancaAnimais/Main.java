package herancaAnimais;

public class Main {

	public static void main(String[] args) {
		
		
		Vaca vaca = new Vaca("mimosa","pintada",2);
		Gato gato = new Gato("Mew","Rosa",1);
		Cachorro cachorro = new Cachorro("Bolt","Branco",2);
		
		vaca.fazerSom();
		gato.fazerSom();
		cachorro.fazerSom();
		
	}

}
