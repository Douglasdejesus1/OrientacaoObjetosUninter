package empresa;

public class Assalariado extends Funcionario{
	public float salario;

	public Assalariado(String nome, float salario) {
		super(nome);
		this.salario = salario;
	}
	public float pagamento() {
		System.out.println("Processando pagamento");
		return salario;
	}

}
