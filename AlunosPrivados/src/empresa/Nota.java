package empresa;

public class Nota {
	String nome;
	private double nota1;
	private double nota2;
	private int falta;
	public Nota(String nome, double nota1, double nota2, int falta) {
		super();
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.falta = falta;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota) {
		this.nota1 = nota;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota) {
		this.nota2 = nota;
	}
	

	public int getFalta() {
		return falta;
	}
	public void setFalta(int falta) {
		this.falta = falta;
	}
	public void resultado() {
		double media=(nota1+nota2)/2;
		if(media<4 ||falta>7){
			System.out.println(nome+ " voce foi Reprovado, a media alcancada foi: " +media+". Número de faltas: "+falta);
		}
		else if(media>=4 && media<7 ){
			double notaFinal=10-media;
			System.out.println(nome+ " voce ficou de Exame, a media alcancada foi: " +media+", necessario tirar na prova final:"+notaFinal+". Número de faltas: "+falta);
		}
		else {
			System.out.println(nome+ " voce foi Aprovado, a media alcancada foi: " +media+". Número de faltas: "+falta);
		}
	}
	
}
