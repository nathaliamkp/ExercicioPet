package br.com.pet.bean;

public class Vet {
	private String nome;
	private int registro;
	private double telefone;
	private String email;
	
	public Vet(String nome, int registro, double telefone, String email) {
		this.nome = nome;
		this.registro = registro;
		this.telefone = telefone;
		this.email = email;
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public double getTelefone() {
		return telefone;
	}

	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	@Override
	public String toString() {
		return "Vet [nome=" + nome + ", registro=" + registro + ", telefone=" + telefone + ", email=" + email + "]";
	}
	
	
	
	


}
