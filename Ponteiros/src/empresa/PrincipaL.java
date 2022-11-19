package empresa;

public class PrincipaL {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Mario"); //0x1001
		Funcionario f2 = new Funcionario("Mario"); //0x1002
		Funcionario f3=f1; //0x1001

		System.out.println("Nome f1: "+f1.funcionario);
		System.out.println("Nome f2: "+f2.funcionario);
		System.out.println("Nome f3: "+f3.funcionario);
		System.out.println();
		f2.funcionario="Luigi";
		System.out.println("Nome f1: "+f1.funcionario);
		System.out.println("Nome f2: "+f2.funcionario);
		System.out.println("Nome f3: "+f3.funcionario);
		System.out.println();
		f3.funcionario="Yoshi";
		System.out.println("Nome f1: "+f1.funcionario);
		System.out.println("Nome f2: "+f2.funcionario);
		System.out.println("Nome f3: "+f3.funcionario);
	}

}
