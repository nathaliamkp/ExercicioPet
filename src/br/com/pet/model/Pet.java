package br.com.pet.model;

public class Pet {
	public String nome;
	public String raca;
	public String especie;
	public int idade;
	public String sexo;
	public Cliente tutor;
	
	public Pet(String nome, String raca, String especie, int idade, String sexo, Cliente tutor) {
		this.nome = nome;
		this.raca = raca;
		this.especie = especie;
		this.idade = idade;
		this.sexo = sexo;
		this.tutor = tutor;
		
		
	}
	

}
