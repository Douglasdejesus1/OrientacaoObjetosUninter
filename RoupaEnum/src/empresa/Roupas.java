package empresa;

public class Roupas {
	public String modelo;
	public int tamanho;
	Estacao estacao;
	public Roupas(String modelo, int tamanho, Estacao estacao) {
		super();
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.estacao = estacao;
	}
	
	public void msg() {
		switch(estacao) {
		case VERAO:
			System.out.println("Arrase na praia!");
			break;
		case OUTONO:
			System.out.println("Passe o outono com elegancia!");
			break;
		case INVERNO:
			System.out.println("Se agasalhe bem e com estilo!");
			break;
		case PRIMAVERA:
			System.out.println("Muitas flores");
			break;
		default:
			System.out.println("Erro");
		}
	}
	

}
