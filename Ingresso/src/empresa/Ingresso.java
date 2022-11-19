package empresa;

public class Ingresso {
	public String nomeEvento;
	public double valor;
	public String getNomeEvento() {
		return nomeEvento;
	}
	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Ingresso(String nomeEvento, double valor) {
		super();
		this.nomeEvento = nomeEvento;
		this.valor = valor;
	}
	public Ingresso() {
		super();
	}
	
	void imprimir() {
		System.out.println("Nome do Show: "+nomeEvento);
		System.out.println("Valor: "+valor);
	}
	

}
