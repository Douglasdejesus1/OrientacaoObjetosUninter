package empresa;

public class Comissionado extends Funcionario {

	public float comissao;
	public float vendas;
	public Comissionado(String nome, float comissao, float vendas) {
		super(nome);
		this.comissao = comissao;
		this.vendas = vendas;
	}
	
	public float pagamento() {
		System.out.println("Pagamento processando...");
		return vendas*comissao;
	}
}
