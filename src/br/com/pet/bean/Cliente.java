package br.com.pet.bean;

public class Cliente {
	private String nome;
	private String endereco;
	private String email;
	private int telefone;
	private int rg;
	private int cpf;
	
	public Cliente(String nome, String endereco, String email, int telefone, int rg, int cpf) {
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
		this.rg = rg;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public double getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public double getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", endereco=" + endereco + ", email=" + email + ", telefone=" + telefone
				+ ", rg=" + rg + ", cpf=" + cpf + "]";
	}
	
	
		

}
