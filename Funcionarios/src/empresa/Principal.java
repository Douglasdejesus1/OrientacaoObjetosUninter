package empresa;

public class Principal {

	public static void main(String[] args) {
		Funcionario funcionarios [] = { new Assalariado("Mario", 3500), new Horista("Luigi", 100, 50.5f), new Comissionado("Yoshi", 50000, 0.05f)
		};
		Funcionario f;
		double total=0;
		
		for(int i=0; i<funcionarios.length;i++) {
			f=funcionarios[i];
			total+=f.pagamento();
			System.out.println(f.nome+" salario: R$ "+f.pagamento());
			System.out.println();
		}
		System.out.println("Total R$ "+total);
	}

}
