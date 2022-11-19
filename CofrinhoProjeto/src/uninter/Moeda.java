package uninter;

import java.util.Objects;

public abstract class Moeda {

	protected double valor;

	// METODOS QUE SERÃO IMPLEMENTADOS NAS CLASSES FILHAS EURO, REAL, DOLAR
	public abstract void info();

	public abstract double converter();

	@Override // CODIGO IMPORTANTE PARA CONSEGUIR DELETAR AS MOEDAS DO CODRE
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
}
