package empres;

public class Principal {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		s1.numero+=20;
		System.out.println(s1.numero);
		System.out.println(s2.numero);
		System.out.println("------");
		s2.numero+=30;
		System.out.println(s1.numero);
		System.out.println(s2.numero);
		System.out.println("------");
	}

}
