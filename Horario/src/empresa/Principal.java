package empresa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		Horario aula = new Horario();
		aula.setHora(12);
		aula.setHora(40);

		System.out.println(aula.getHora());

		ArrayList<String> pessoas = new ArrayList<>();
		pessoas.add("Mario");
		pessoas.add("Luigi");
		pessoas.add("Peach");
		pessoas.add("Yoshi");
		System.out.println(pessoas);
		Collections.sort(pessoas);
		System.out.println(pessoas);
		Collections.shuffle(pessoas);
		System.out.println(pessoas);
		

		HashMap<String, String> capitais = new HashMap();
		capitais.put("Brasil", "Bras�lia");
		capitais.put("Argentina", "Buenos Aires");
		capitais.put("Paraguai", "Assun��o");
		capitais.put("Uruguai", "Montevid�u");
		System.out.println(capitais);
		
		ArrayList<Integer> lista = new ArrayList();
		HashSet<Integer> conjunto = new HashSet();
		HashMap<String,Integer> mapa = new HashMap();
		lista.add(1);
		lista.add(5);
		lista.add(10);
		lista.add(12);
		
		conjunto.add(2);
		conjunto.add(6);
		conjunto.add(11);
		conjunto.add(13);
		
		mapa.put("Branco", 3);
		mapa.put("Amarelo", 7);
		mapa.put("Vermelho", 12);
		mapa.put("Azul", 14);
		
		int soma;
		soma=0;
		for(int i= 0; i<lista.size();i++) {
			soma += lista.get(i);
		}
		System.out.println("A soma da Lista �: "+soma);
		
		soma=0;
		//Iterator it = mapa.entrySet().iterator();
		Iterator it = conjunto.iterator();
		//Iterator it = lista.iterator();
		
		while(it.hasNext()) {
			soma+=(Integer)it.next();
		}
		System.out.println("A soma da Lista �: "+soma);
		
		

	}
}
