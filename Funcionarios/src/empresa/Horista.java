package empresa;

public class Horista extends Funcionario {
	public int totalHoras;
	public float valorHora;

	public Horista(String nome, int totalHoras, float valorHora) {
		super(nome);
		this.totalHoras = totalHoras;
		this.valorHora = valorHora;
	}

	public float pagamento() {
		System.out.println("Processando pagamento");
		return totalHoras*valorHora;
	}

}
