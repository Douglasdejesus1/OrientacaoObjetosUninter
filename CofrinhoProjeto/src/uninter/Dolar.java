package uninter;

import java.util.Objects;

public class Dolar extends Moeda {

	public Dolar(double valorI) {
		this.valor = valorI;
	}

	@Override
	public void info() {
		System.out.printf("US$ %.2f \n", valor);
	}

	@Override
	public double converter() {
		return this.valor * 5; // ADOTEI UMA TAXA DE CAMBIO DE 1 DOLAR PARA 5 REAIS
	}
}
