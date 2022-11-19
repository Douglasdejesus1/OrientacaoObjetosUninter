package empresa;

public class Principal {
	public static void main(String[] args) {

		LivroDigital livroD = new LivroDigital("O Hobbit", new Autor("Tolkien", "tolkien@tolkien.com", "Ingles"), "Aventura", 1, 15, 25.5);
		LivroFisico livroF = new LivroFisico("Senhor dos Aneis", new Autor("Tolkien", "tolkien@tolkien.com", "Ingles"), "Aventura", 1, 10000, 260);
		
		livroD.info();
		System.out.println();
		livroF.info();
	}
}
