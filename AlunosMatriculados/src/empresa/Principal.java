package empresa;

public class Principal {

	public static void main(String[] args) {
		Aluno douglas = new Aluno("Douglas", 31505, 300.00, new Curso("Economia",1200.00));
		douglas.info();
	}

}
