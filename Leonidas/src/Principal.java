import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor = 0;
		while (valor != 10000) {
			System.out.println("De seu palpite sobre quandos soldados Leonidas enfrentou?");
			valor = sc.nextInt();
			if (valor < 10000) {
				System.out.println("Enfrentou mais que isso");
			} else if (valor > 10000) {
				System.out.println("Enfrentou menos que isso");
			} else {
				System.out.println("Correto, enfrentou 10000");

			}
		}

	}

}