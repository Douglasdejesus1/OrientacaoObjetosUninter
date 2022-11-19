package empresa;

public class LivroDigital extends Livro {

	public String linkDownload;
	public int tamanhoMB;

	public LivroDigital(String autor, String titulo, String LinkDownload) {
		super(autor, titulo);
		this.linkDownload=LinkDownload;
	}
	
	public float imposto() {
		return super.imposto() + 2;

	}

	public float tamanhoPorPagina() {
		return tamanhoMB / (float)paginas;
	}
	public void imprimirImposto() {
		System.out.println("Imposto livro fisico: "+ super.imposto());
		System.out.println("Imposto livro virtual: "+ this.imposto());
	}
	
}