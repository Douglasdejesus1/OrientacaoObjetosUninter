package Program;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Qual sua altura?");
	double altura = teclado.nextDouble();
	System.out.println("Qual seu peso?");	
	double peso = teclado.nextDouble();
	double imc= peso/(Math.pow(altura,2));
	System.out.printf("Seu imc �: %.2f",imc);
	
	teclado.close();
	}
}
