package empresa;

import java.util.Objects;

public class Usuario {
	public int id;
	public String nome;
	public String idade;
	public Usuario(int id, String nome, String idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, idade, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return id == other.id && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}
	
	

}
