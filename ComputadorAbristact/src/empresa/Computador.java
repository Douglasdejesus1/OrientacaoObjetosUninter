package empresa;

public abstract class Computador {
	
	public int gbMemoria;
	public int numProcessadores;
	
	
	
	public Computador(int gbMemoria, int numProcessadores) {
		super();
		this.gbMemoria = gbMemoria;
		this.numProcessadores = numProcessadores;
	}



	public abstract double calculaValor();

}
