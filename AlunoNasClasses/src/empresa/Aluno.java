package empresa;

import java.util.List;

public class Aluno {

	String nome;
	String curso;
	Avaliacao avaliacao;
	
	
	
	public Aluno(String nome, String curso, Avaliacao avaliacao) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.avaliacao = avaliacao;
	}



	void info() {
		System.out.println("Nome: " +nome);
		System.out.println("Curso: "+curso);
		System.out.println("Media A: "+avaliacao.mediaAritimetica());
		System.out.println("Media P: "+avaliacao.mediaPonderada());
	}
	
	
	
}
