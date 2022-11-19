package empresa;

public class Principal {
	public static void main(String[] args) {
		
		
		IngressoVip ingressoDouglas = new IngressoVip("Amigos", 299.50, 60.49);
		
		
		ingressoDouglas.imprimir();
		ingressoDouglas.adicional=100;
		ingressoDouglas.setAdicional(399.99);
		System.out.println();
		ingressoDouglas.imprimir();
	}
}
