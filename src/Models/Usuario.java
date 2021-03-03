package Models;

public class Usuario {
	
	private int 	id;
	private String 	Nome;
	private String 	Senha;
	
	public Usuario(int id, String nome, String senha) {
		super();
		this.id = id;
		Nome = nome;
		Senha = senha;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}
	

}
