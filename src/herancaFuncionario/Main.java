package herancaFuncionario;

public class Main {

	public static void main(String[] args) {
		
		Contador cont = new Contador("Danilo", 2000, "dfdsf", 2343);
		
		System.out.println(cont.calculoSalario(2000));
		
		Eletricista elet = new Eletricista("Danilo", 2000, "dfdsf", false);
		
		System.out.println(elet.calculoSalario(2000));
	}

}
