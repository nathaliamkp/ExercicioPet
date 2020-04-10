package br.com.pet.model;

public class Cliente {
	public String nome;
	public String endereco;
	public String email;
	public int telefone;
	public double rg;
	public double cpf;
	
	public Cliente(String nome, String endereco, String email, int telefone, double rg, double cpf) {
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
		this.rg = rg;
		this.cpf = cpf;
	}
		

}
