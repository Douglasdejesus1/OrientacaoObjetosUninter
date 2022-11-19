package empresa;

public class Curso {
	private String nome;
	private Double mensalidade;
	public Curso(String nome, Double mensalidade) {
		super();
		this.nome = nome;
		this.mensalidade = mensalidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(Double mensalidade) {
		this.mensalidade = mensalidade;
	}
	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", mensalidade=" + mensalidade + "]";
	}


}
