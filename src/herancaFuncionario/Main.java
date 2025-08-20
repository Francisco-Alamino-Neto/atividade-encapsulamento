package herancaFuncionario;

public class Main {

	public static void main(String[] args) {
		
		Engenheiro eng = new Engenheiro("Denis", 7000, "42517852X", 547821);
		
		System.out.println(eng.getNome());
		
		eng.setNome("Heitor");
		
		System.out.println(eng.getNome());
	}

}
