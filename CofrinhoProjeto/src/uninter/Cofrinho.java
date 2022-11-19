package uninter;

import java.util.ArrayList;

public class Cofrinho {

	ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();

	// METODO PARA ADICIONAR AS MOEDAS NA LISTA DE MOEDAS
	public void adicionar(Moeda m) {
		listaMoedas.add(m);
	}

	// METODO PARA REMOVER AS MOEDAS NA LISTA DE MOEDAS
	public void remover(Moeda m) {
		listaMoedas.remove(m);
	}

	// METODO PARA LISTAR TODAS AS MOEDAS
	public void listar() {
		if (listaMoedas.isEmpty()) {
			System.out.println("O cofre está vázio!");
		} else {
			for (Moeda m : listaMoedas) {
				m.info();
			}
		}
	}

	// METODO PARA SOMAR AS MOEDAS JÁ CONVERTIDAS EM REAIS
	public void totalConvertido() {
		double soma = 0;
		if (listaMoedas.isEmpty()) {
			System.out.println("O cofre está vázio!");
		} else {
			for (Moeda m : listaMoedas) {
				soma += m.converter();
			}
			System.out.printf("Total convertido em reais: R$ %.2f \n", soma);
			soma = 0;
		}
	}
}
