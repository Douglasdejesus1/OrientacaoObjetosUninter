package empresa;

public class Principal {

	public static void main(String[] args) {
		Nota douglas = new Nota("Douglas", 8,2,6);
		Nota flavia = new Nota("Flavia", 8,9,7);
		Nota rodrigo = new Nota("Rodrigo", 3,4,7);
		douglas.resultado();
		flavia.resultado();
		rodrigo.resultado();

	}

}
