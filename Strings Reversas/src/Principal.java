import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> listaNomes = new ArrayList<>();
		System.out.println("Digite a quantidade de nomes: ");
		int qtd = sc.nextInt();
		String nome;
		
		for(int i=0; i<qtd; i++) {
			nome = sc.next();
			listaNomes.add(nome);	
		}
		for(int i=listaNomes.size()-1; i>=0;i--) {
			System.out.println(listaNomes.get(i));
		}

	}

}
