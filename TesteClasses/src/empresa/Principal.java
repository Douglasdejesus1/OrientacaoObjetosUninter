package empresa;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Aluno a = new Aluno(31801,"Douglas","384.531.280-20");
		Aluno b = new Aluno(31802,"Flavia","545.545.631-20");
		ArrayList<Aluno> alunos = new ArrayList();
		
		alunos.add(a);
		alunos.add(b);
		alunos.add(new Aluno(001,"Hanna","122.222.555-20"));
		
		for(Aluno aluno:alunos) {
		System.out.println(aluno);
		}
		
		Carro c = new Carro();
		System.out.println(Carro.milhasParaMetros(10));
		System.out.println(Carro.PI);
		
		
		
		
	}
}


