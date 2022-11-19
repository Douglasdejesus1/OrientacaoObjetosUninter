package uninter;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Cofrinho cofrinho = new Cofrinho();

		ArrayList<Moeda> moedas = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("$$  COFRINHO ELETRONICO  $$");
		System.out.println("-----------Menu------------");
		System.out.println("1-Adicionar");
		System.out.println("2-Remover");
		System.out.println("3-Listar");
		System.out.println("4-Calcular valor convertido");
		System.out.println("0-Encerrar");

		int escolha = 1;
		while (escolha != 0) {
			System.out.println();
			System.out.println("O que deseja executar?...1-Adi,2-Rem,3-List,4-Cal,0-sair");
			escolha = sc.nextInt();
			switch (escolha) {
			case 1:
				int tipoMoeda = 0;
				while (tipoMoeda > 3 || tipoMoeda < 1) {
					System.out.println("Escolha o Tipo de moeda que deseja Adicionar..");
					System.out.println("1-Real");
					System.out.println("2-Dolar");
					System.out.println("3-Euro");
					tipoMoeda = sc.nextInt();
					Moeda moe;
					if (tipoMoeda == 1) {
						System.out.println("Qual o valor em Reais?");
						double valor = sc.nextDouble();
						moe = new Real(valor);
						cofrinho.adicionar(moe);
					}
					if (tipoMoeda == 2) {
						System.out.println("Qual o valor em Dolar?");
						double valor = sc.nextDouble();
						moe = new Dolar(valor);
						cofrinho.adicionar(moe);
					}
					if (tipoMoeda == 3) {
						System.out.println("Qual o valor em Euros?");
						double valor = sc.nextDouble();
						moe = new Euro(valor);
						cofrinho.adicionar(moe);
					}

				}
				break;
			case 2:
				tipoMoeda = 0;
				while (tipoMoeda > 3 || tipoMoeda < 1) {
					System.out.println("Escolha o Tipo de moeda que deseja Remover..");
					System.out.println("1-Real");
					System.out.println("2-Dolar");
					System.out.println("3-Euro");
					tipoMoeda = sc.nextInt();
					Moeda moe;
					if (tipoMoeda == 1) {
						System.out.println("Qual o valor em Reais?");
						double valor = sc.nextDouble();
						moe = new Real(valor);
						cofrinho.remover(moe);
					}
					if (tipoMoeda == 2) {
						System.out.println("Qual o valor em Dolar?");
						double valor = sc.nextDouble();
						moe = new Dolar(valor);
						cofrinho.remover(moe);
					}
					if (tipoMoeda == 3) {
						System.out.println("Qual o valor em Euros?");
						double valor = sc.nextDouble();
						moe = new Euro(valor);
						cofrinho.remover(moe);
					}

				}
				break;
			case 3:
				cofrinho.listar();
				break;
			case 4:
				cofrinho.totalConvertido();
				break;
			}
		}

	}

}
