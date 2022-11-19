package empresa;

public abstract class Funcionario {
	public String nome;

	public Funcionario(String nome) {
		super();
		this.nome = nome;
	}
	
	public abstract float pagamento(); 
	

}
