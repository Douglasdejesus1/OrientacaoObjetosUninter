package empresa;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		Conta cDouglas = new Conta(12, "Douglas", 500, 600);
		Conta cRodrigo = new Conta(36, "Rodrigo", 0, 1000);
		cDouglas.info();
		cRodrigo.info();
		try {
			cDouglas.sacar(1000);			
		} catch (Exception e) {
			System.out.println("Digite um valor valido");
			System.out.println(e.getMessage());
		}
		
		cDouglas.tranferir(50,cDouglas, cRodrigo);
		
		cDouglas.info();
		cRodrigo.info();
		
		cDouglas.tranferir(122,cDouglas, cRodrigo);
		
		cDouglas.info();
		cRodrigo.info();
		
		cDouglas.tranferir(328,cDouglas, cRodrigo);
		
		cDouglas.info();
		cRodrigo.info();
		
	}

}
