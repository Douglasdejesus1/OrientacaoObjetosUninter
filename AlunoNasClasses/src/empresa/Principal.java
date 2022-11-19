package empresa;

public class Principal {

	public static void main(String[] args) {
		
		Avaliacao notasFlavia = new Avaliacao(5, 6, 8);
		Aluno hanna = new Aluno("Hanna", "Veterinaria", new Avaliacao(1,3,5));
		Aluno flavia = new Aluno("Flavia", "Veterinaria", notasFlavia);
		
		hanna.info();
		flavia.info();

	}

}
