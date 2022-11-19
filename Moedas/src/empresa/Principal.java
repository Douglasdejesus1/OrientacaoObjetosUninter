package empresa;

public class Principal {

	public static void main(String[] args) {
		Cofrinho c = new Cofrinho();
		c.add(new Moeda(50, "Reais"));
		c.add(new Moeda(1, "Euros"));
		c.add(new Moeda(10, "Reais"));

		System.out.println("O Total de moedas é: "+c.calcularTotal());
	}

}
