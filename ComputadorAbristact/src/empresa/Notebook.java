package empresa;

public class Notebook extends Computador {
	public int polegadasTela;
	
	

	



	public Notebook(int gbMemoria, int numProcessadores, int polegadasTela) {
		super(gbMemoria, numProcessadores);
		this.polegadasTela = polegadasTela;
	}







	@Override
	public double calculaValor() {
		return gbMemoria*250+numProcessadores*500+polegadasTela*100;
	}

}
