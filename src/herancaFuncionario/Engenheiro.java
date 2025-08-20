package herancaFuncionario;

public class Engenheiro extends Funcionario{
	
	private int numCrea;

	public Engenheiro(String nome, double salario, String rg, int numCrea) {
		super(nome, salario, rg);
		this.numCrea = numCrea;
	}

	public int getNumCrea() {
		return numCrea;
	}

	public void setNumCrea(int numCrea) {
		this.numCrea = numCrea;
	}
	
	
	
}
