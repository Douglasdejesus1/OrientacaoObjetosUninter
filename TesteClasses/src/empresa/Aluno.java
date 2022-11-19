package empresa;

public class Aluno {

	int matricula;
	String nome;
	String cpf;
	
	
	
	public Aluno(int matricula, String nome, String cpf) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.cpf = cpf;
	}



	void info() {
		System.out.println("NOME: "+nome);
		System.out.println("CPF: "+cpf);
		System.out.println("MATRICULA: "+matricula);
		
		}



	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", cpf=" + cpf + "]";
	}
	
}
