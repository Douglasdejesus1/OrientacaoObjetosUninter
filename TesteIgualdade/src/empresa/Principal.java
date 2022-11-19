package empresa;

public class Principal {

	public static void main(String[] args) {

		String s1 = new String("MSG"); //0X1001
		String s2 = new String("MSG"); //0X1002
		String s3 = s1;
		String s4 = "MSG";
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s1.equals(s3));
		System.out.println("-----objetos------");
		
		Usuario us1 = new Usuario(1, "Douglas", "32");
		Usuario us2 = new Usuario(1, "Douglas", "31");
		Usuario us3 = new Usuario(1, "Douglas", "32");
		System.out.println(us1.equals(us2));
		System.out.println(us1.equals(us3));
		
	}
	
	

}
