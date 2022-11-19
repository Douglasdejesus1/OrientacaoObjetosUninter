package empresa;

public class IngressoVip extends Ingresso{

	public double adicional;

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	public IngressoVip(String nomeEvento, double valor) {
		super(nomeEvento, valor);
	}

	public IngressoVip(String nomeEvento, double valor, double adicional) {
		super(nomeEvento, valor);
		this.adicional = adicional;
	}
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Taxa adicional: "+adicional);
		System.out.println("Total: "+(super.getValor()+adicional));
	}
}
