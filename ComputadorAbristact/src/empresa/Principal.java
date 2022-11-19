package empresa;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		
		Desktop d1 = new Desktop(4, 8, 3);
		Desktop d2 = new Desktop(2, 16, 5);
		Notebook n1 = new Notebook(8, 8, 14);
		Notebook n2 = new Notebook(16, 12, 16);
		System.out.println(d1.calculaValor());
		System.out.println(d2.calculaValor());
		System.out.println(n1.calculaValor());
		System.out.println(n2.calculaValor());
		
		Computador comp;
		comp =d1;
		System.out.println("camp vale: "+ comp.calculaValor());
		System.out.println("-----");
		comp =n2;
		System.out.println("camp vale: "+ comp.calculaValor());
		System.out.println("------");
		
		ArrayList<Computador>computadores = new ArrayList<Computador>();
		computadores.add(d1);
		computadores.add(d2);
		computadores.add(n1);
		computadores.add(n2);
		
		double total = 0;
		for(Computador c :computadores) {
			total += c.calculaValor();
			
			
		}
		System.out.println(total);
		
	}

}
