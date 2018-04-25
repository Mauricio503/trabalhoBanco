package model;


public class Conta {

	private String usuario;
	private String senha;
	private String nome;
	
	
	public Conta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Conta(String usuario, String senha, String nome) {
		super();
		this.usuario = usuario;
		this.senha = senha;
		this.nome = nome;
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

	

}
