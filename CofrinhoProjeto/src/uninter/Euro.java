package uninter;

public class Euro extends Moeda {

	public Euro(double valorI) {
		this.valor = valorI;
	}

	@Override
	public void info() {
		System.out.printf("£$ %.2f \n", valor);
	}

	@Override
	public double converter() {
		return this.valor * 6; // ADOTEI UMA TAXA DE CAMBIO DE 1 EURO PARA 6 REAIS
	}
}
