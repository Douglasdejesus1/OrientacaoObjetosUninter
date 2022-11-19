package uninter;

public class Real extends Moeda {

	public Real(double valorI) {
		this.valor = valorI;
	}

	public double converter() {
		return this.valor;
	}

	@Override
	public void info() {
		System.out.printf("R$ %.2f \n", valor);
	}

}
