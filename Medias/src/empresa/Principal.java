package empresa;

public class Principal {
	public static void main(String[] args) {

		Avaliacao aluno1 = new Avaliacao(9, 5.6, 1.0);
		
		System.out.println(aluno1.mediaAritimetica());
		System.out.println(aluno1.mediaPonderada());
	}

}
